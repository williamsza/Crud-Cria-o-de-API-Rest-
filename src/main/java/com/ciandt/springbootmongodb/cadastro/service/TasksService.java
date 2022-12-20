package com.ciandt.springbootmongodb.cadastro.service;

import com.ciandt.springbootmongodb.cadastro.dto.TaskDto;
import com.ciandt.springbootmongodb.cadastro.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.messaging.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TasksService {
    private static final Map<Long, TaskDto> tasks = new HashMap<>();

    private TaskRepository taskRepository;
    public TasksService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskDto criar(TaskDto taskDto) {
        Long novoId = tasks.keySet().size() + 1L;
        taskDto.setId(novoId);
        tasks.put(novoId, taskDto);
        this.taskRepository.save(taskDto);
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
    public void save(String nome, String phone, String email){
        TaskDto taskDto =new TaskDto(nome,phone,email);
        this.taskRepository.save(taskDto);
    }

    }

