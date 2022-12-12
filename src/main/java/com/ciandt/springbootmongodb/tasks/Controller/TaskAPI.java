package com.ciandt.springbootmongodb.tasks.Controller;

import com.ciandt.springbootmongodb.tasks.dto.TaskDto;
import com.ciandt.springbootmongodb.tasks.service.TasksService;
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

        return tasksService.criar(taskDto);
    }

    @PutMapping("/{taskId}")
    public TaskDto atualizar(@PathVariable("taskId") Long taskId,
                             @RequestBody TaskDto taskDto) {
        return tasksService.atualizar(taskDto, taskId);
    }

    @GetMapping
    @ResponseBody
    public List<TaskDto> geAll() {
        return tasksService.getAll();

    }

    @DeleteMapping("taskId")
    @ResponseBody
    public String deletar(@PathVariable("taskId") Long taskId) {
        return tasksService.delete(taskId);
    }


}
