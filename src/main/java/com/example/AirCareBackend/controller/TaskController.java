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

    @GetMapping(path = "/Air")
    public ArrayList<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping(path = "/Air")
    public Task addTask(@RequestBody Task newTask){
        return taskService.addTask(newTask);
    }

    @DeleteMapping(path = "/Air/{id}")
    public String deleteTask(@PathVariable Integer id) {
        return taskService.deleteTask(id);
    }

    @PutMapping(path = "/Air")
    public Task updateTask(@RequestBody Task updateTask) {
        return taskService.updateTask(updateTask);
    }
}
