package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.JobsDao;
import org.example.model.User;
import org.example.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao dao;
    JobsDao jobsDao;
    public List<User> getAll(){
        return  dao.findAll();
    }

    public String addQuestion(User model){

        return "Success";
    }

    public void addJob(User user) {

//        User user = new User();

//        User newAdmin=new User();
//        User existUser=dao.findById(id).orElse(null);
//        if(existUser==null){
//            existUser=new User();
//            existUser.setId(id);
//            existUser.setUserName(userName);
//            existUser.setPassword(password);
//            existUser.setAllJobs(allJobs);
//        }
//        else{
////            existUser.setAllJobs(allJobs);
//        }

//        dao.save(existUser);
//        newAdmin.setId(id);
//        newAdmin.setUserName(userName);
//        newAdmin.setPassword(password);
//        for(int i=0;i<allJobs.size();i++){
//            jobsDao.save(allJobs.get(i));
//        }

//            Jobs newJob=new Jobs();
//            newJob.setJobId(allJobs.get(i).getJobId());
//            newJob.setJobTitle(allJobs.get(i).getJobTitle());
//            newJob.setJobLocation(allJobs.get(i).getJobLocation());
//            newJob.setJobCategory(allJobs.get(i).getJobCategory());
//            newJob.setJobCompanyName(allJobs.get(i).getJobCompanyName());
//            newJob.setJobSalary(allJobs.get(i).getJobSalary());
//            newJobs.add(newJob);

//      newAdmin.setAllJobs(allJobs);
//        System.out.println(newAdmin);
//        try{
//            dao.save(newAdmin);
//        }
//        catch (Exception e){
//            System.out.println("Exception"+e);
//        }

//        dao.save(newAdmin);

    }
}
