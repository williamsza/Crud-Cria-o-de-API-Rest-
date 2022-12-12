package com.ciandt.springbootmongodb.tasks.service;

import com.ciandt.springbootmongodb.tasks.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TasksService {
    private static final Map<Long, TaskDto> task = new HashMap<>();

    public TaskDto criar(TaskDto taskDto) {
        Long novoId = task.keySet().size() + 1L;
        taskDto.setId(novoId);


        return taskDto;
    }
}
