package com.jobclubofficial.education.service;

import com.jobclubofficial.education.entity.Education;
import com.jobclubofficial.education.repository.EducationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class EducationService {

    @Autowired
    private EducationRepository educationRepository;

    public List<Education> getAllEducations(String username) {
        log.info("Retrieving education details");
        return educationRepository.findEducationsByUsername(username.toLowerCase());
    }

}
