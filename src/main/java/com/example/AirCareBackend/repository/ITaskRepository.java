package com.example.AirCareBackend.repository;

import com.example.AirCareBackend.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface ITaskRepository extends CrudRepository<Task, Integer> {
}
