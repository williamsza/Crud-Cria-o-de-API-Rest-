package com.ciandt.springbootmongodb.tasks.service;

import com.ciandt.springbootmongodb.tasks.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TasksService {
    private static final Map<Long, TaskDto> tasks = new HashMap<>();

    public TaskDto criar(TaskDto taskDto) {
        Long novoId = tasks.keySet().size() + 1L;
        taskDto.setId(novoId);
        tasks.put(novoId, taskDto);
        return taskDto;

    }
    public TaskDto atualizar(TaskDto taskDto, Long taskId) {
        tasks.put(taskId, taskDto);
        return taskDto;

    }
    public TaskDto getById(Long taskId){
        return tasks.get(taskId);
    }

    public List<TaskDto> getAll(){
        return new ArrayList<>(tasks.values());

    }
    public String delete(Long taskId){
        tasks.remove(taskId);
        return "DELETED";
    }
}
