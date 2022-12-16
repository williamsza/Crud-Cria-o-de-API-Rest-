package com.ciandt.springbootmongodb.tasks.repository;

import com.ciandt.springbootmongodb.tasks.service.TasksService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TasksService, String> {
}
