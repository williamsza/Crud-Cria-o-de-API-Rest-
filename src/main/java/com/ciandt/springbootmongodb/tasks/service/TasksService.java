package com.ciandt.springbootmongodb.tasks.service;

import com.ciandt.springbootmongodb.tasks.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TasksService {
    private static final Map<Long, TaskDto> task = new HashMap<>();

    public TaskDto criar(TaskDto taskDto) {
        Long novoId = task.keySet().size() + 1L;
        taskDto.setId(novoId);
        task.put(novoId, taskDto);
        return taskDto;

    }
    public TaskDto atualizar(TaskDto taskDto, Long taskId) {
        task.put(taskId, taskDto);
        return taskDto;


    }
    public TaskDto getById(Long taskId){
        return task.get(taskId);
    }
    //Recuperar todos
    public List<TaskDto> getAll(){
        return new ArrayList<>(task.values());

    }
    public String delete(Long taskId){
        task.remove(taskId);
        return "DELETED";
    }
}
