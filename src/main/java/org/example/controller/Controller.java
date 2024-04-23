package org.example.controller;

import org.example.model.User;
import org.example.model.Job;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("question")
public class Controller {

    @Autowired
    UserService userService;
    @GetMapping("allQuestion")
    public List<User> getAllQuestion(){
        return userService.getAll();
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody User user){
//        System.out.println("Admin Data"+admin.getAllJobs());
//        ArrayList<Job>jobArray=admin.getAllJobs();
//        for(int i=0 ;i<jobArray.size();i++){
//            System.out.println(jobArray.get(i).getJobCategory());
//        }
        System.out.println("Hey There add request is popped");
//        userService.addJob(user);
//        Service.addJob(admin.getId(),admin.getUserName(),admin.getPassword(),jobArray);
//        System.out.println(admin.getId());
//        System.out.println(admin.getUserName());
//        System.out.println(admin.getPassword());
//        System.out.println(admin.getAllJobs());

        return  "Success";
    }

}
