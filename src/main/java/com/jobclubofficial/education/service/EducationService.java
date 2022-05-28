package com.jobclubofficial.education.service;

import com.jobclubofficial.education.entity.Education;
import com.jobclubofficial.education.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EducationService {

    @Autowired
    private EducationRepository educationRepository;

    public List<Education> getAllEducations(String username) {
        return educationRepository.findEducationsByUsername(username.toLowerCase());
    }

}
