package trainticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trainticketbooking.dto.TrainDto;
import trainticketbooking.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("/train")
    Integer createTrain(@RequestBody TrainDto payload) {
        return adminService.createTrain(payload);
    }

}
