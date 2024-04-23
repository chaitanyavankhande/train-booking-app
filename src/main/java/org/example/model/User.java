package org.example.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String userName;

    private  String password;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private ArrayList<Job> allJobs;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAllJobs(ArrayList<Job> allJobs) {
        this.allJobs = allJobs;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Job>getAllJobs() {
        return  allJobs;
    }
}


