package trainticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import trainticketbooking.dao.BookedSeatRepository;
import trainticketbooking.dao.TrainRepository;
import trainticketbooking.dao.UserRepository;
import trainticketbooking.dto.*;
import trainticketbooking.model.BookedSeat;
import trainticketbooking.model.Train;
import trainticketbooking.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {
    @Autowired
    TrainRepository trainRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookedSeatRepository bookedSeatRepository;

    @Transactional(readOnly = true)
    public List<TrainDto> getAvailableTrains(TrainScheduleDto dto) {
        return trainRepository.findByFromLocationAndToLocation(dto.getFromLocation(), dto.getToLocation()).stream()
                .map(it -> trainToTrainDto(it))
                .collect(Collectors.toList());
    }

    private TrainDto trainToTrainDto(Train train) {
        return TrainDto.builder()
                .id(train.getId())
                .name(train.getName())
                .fromLocation(train.getFromLocation())
                .toLocation(train.getToLocation())
                .ticketPrice(train.getTicketPrice())
                .seatsAvailable(train.getSeatsAvailable())
                .build();
    }

    public Integer bookSeats(BookSeatDto payload) {
        Train train = trainRepository.findById(payload.getTrainId().longValue())
                .orElseThrow(RuntimeException::new);
        User user = userRepository.findByUsername(ThreadLocalWithUserContext.getUserContext().getUserName())
                .orElseThrow(RuntimeException::new);

        train.setSeatsAvailable(train.getSeatsAvailable() - payload.getSeats());

        trainRepository.save(train);

        BookedSeat bookedSeat = new BookedSeat();
        bookedSeat.setTrain(train);
        bookedSeat.setUser(user);
        bookedSeat.setBookedSeats(payload.getSeats());

        return bookedSeatRepository.save(bookedSeat).getId();
    }

    public BookingQueryDto getBooking(Integer bookingId) {
        BookedSeat bookedSeat = bookedSeatRepository.findById(bookingId).orElseThrow(RuntimeException::new);
        return new BookingQueryDto(
                trainToTrainDto(bookedSeat.getTrain()),
                bookedSeat.getUser().getUserId(),
                bookedSeat.getBookedSeats()
        );
    }
}
