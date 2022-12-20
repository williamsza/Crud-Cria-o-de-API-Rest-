package com.ciandt.springbootmongodb.cadastro.repository;

import com.ciandt.springbootmongodb.cadastro.dto.TaskDto;
import com.ciandt.springbootmongodb.cadastro.service.TasksService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskDto, String> {
}
