package trainticketbooking.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trainticketbooking.dao.TrainRepository;
import trainticketbooking.dto.TrainDto;
import trainticketbooking.model.Train;

@Service
@Transactional
public class AdminService {
    @Autowired
    TrainRepository trainRepository;
    public Integer createTrain(TrainDto payload) {
        Train train = new Train();
        train.setName(payload.getName());
        train.setFromLocation(payload.getFromLocation());
        train.setToLocation(payload.getToLocation());
        train.setTicketPrice(payload.getTicketPrice());
        train.setSeatsAvailable(payload.getSeatsAvailable());
        return trainRepository.save(train).getId();
    }
}
