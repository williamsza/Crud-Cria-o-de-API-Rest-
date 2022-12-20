package com.ciandt.springbootmongodb.cadastro.repository;

import com.ciandt.springbootmongodb.cadastro.dto.TaskDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskDto, String> {
}
