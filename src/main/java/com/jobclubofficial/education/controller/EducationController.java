package com.jobclubofficial.education.controller;

import com.jobclubofficial.education.entity.Education;
import com.jobclubofficial.education.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {

    @Autowired
    private EducationService educationService;

    @GetMapping("/users/{username}/education")
    public Education getAllEducation(@PathVariable String username) {
        return educationService.getAllEducations(username).get(0);
    }
}
