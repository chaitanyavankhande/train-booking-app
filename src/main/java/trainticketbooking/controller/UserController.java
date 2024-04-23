package trainticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trainticketbooking.dto.BookSeatDto;
import trainticketbooking.dto.BookingQueryDto;
import trainticketbooking.dto.TrainDto;
import trainticketbooking.dto.TrainScheduleDto;
import trainticketbooking.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/available-trains")
    List<TrainDto> getAvailabilityTrains(@RequestBody TrainScheduleDto payload) {
        return userService.getAvailableTrains(payload);
    }
    @PostMapping("/book-train/{trainId}")
    Integer bookSeats(@RequestBody BookSeatDto payload) {
        return userService.bookSeats(payload);
    }

    @GetMapping("/bookings/{id}")
    BookingQueryDto getBooking(@PathVariable Integer id) {
        return userService.getBooking(id);
    }

}
