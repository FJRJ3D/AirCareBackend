package com.example.AirCareBackend.service;

import com.example.AirCareBackend.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    ITaskRepository iTaskRepository;


}
