package com.example.AirCareBackend.service;

import com.example.AirCareBackend.model.Task;
import com.example.AirCareBackend.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {
    @Autowired
    ITaskRepository iTaskRepository;

    public ArrayList<Task> getAllTasks(){
        return (ArrayList<Task>) iTaskRepository.findAll();
    }

    public Task addTask(Task newTask){
        return iTaskRepository.save(newTask);
    }

    public String deleteTask(Integer id) {
        iTaskRepository.deleteById(id);
        return null;
    }


}
