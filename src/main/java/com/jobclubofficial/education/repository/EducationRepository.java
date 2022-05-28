package com.jobclubofficial.education.repository;

import com.jobclubofficial.education.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {

    List<Education> findEducationsByUsername(String username);
}
