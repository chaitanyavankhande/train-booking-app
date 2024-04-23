package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Job {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer jobId;
    private  String jobTitle ;
    private  String jobLocation;

    private  String jobCategory;

    private  String jobCompanyName;
    private Integer jobSalary;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public void setJobCompanyName(String jobCompanyName) {
        this.jobCompanyName = jobCompanyName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public void setJobSalary(Integer jobSalary) {
        this.jobSalary = jobSalary;
    }

    public Integer getJobSalary() {
        return jobSalary;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public String getJobCompanyName() {
        return jobCompanyName;
    }

    public Integer getJobId() {
        return jobId;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
