package com.ciandt.springbootmongodb.cadastro.controller;

import com.ciandt.springbootmongodb.cadastro.dto.TaskDto;
import com.ciandt.springbootmongodb.cadastro.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/tasks")

public class TaskAPI {
    @Autowired
    private TasksService tasksService;

    @PostMapping
    public TaskDto criar(@RequestBody TaskDto taskDto) {
        return this.tasksService.criar(taskDto);
    }

    @PutMapping("/{taskId}")
    public TaskDto atualizar(@PathVariable("taskId") Long taskId,
                             @RequestBody TaskDto taskDto) {
        return this.tasksService.atualizar(taskDto, taskId);
    }

    @GetMapping
    public List<TaskDto> geAll() {
        return this.tasksService.getAll();

    }

    @DeleteMapping("/{taskId}")
    
    public String deletar(@PathVariable("taskId") Long taskId) {
        return tasksService.delete(taskId);
    }


}
