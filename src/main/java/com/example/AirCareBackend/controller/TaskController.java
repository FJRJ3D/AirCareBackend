package com.example.AirCareBackend.controller;

import com.example.AirCareBackend.model.Task;
import com.example.AirCareBackend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping(path = "/motos")
    public ArrayList<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping(path = "/motos")
    public Task addTask(@RequestBody Task newTask){
        return taskService.addTask(newTask);
    }
}
