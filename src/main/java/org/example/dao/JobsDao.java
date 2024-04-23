package org.example.dao;

import org.example.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsDao extends JpaRepository<Job,Integer> {
}
