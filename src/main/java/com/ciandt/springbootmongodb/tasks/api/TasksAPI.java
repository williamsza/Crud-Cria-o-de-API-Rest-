package com.ciandt.springbootmongodb.tasks.api;

import com.ciandt.springbootmongodb.tasks.service.TasksService;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller
@RequestMapping(value="/tasks", produces = "MediaType.APLICATION_JSON_VALUE")
public class TasksAPI {
    @Autowired
    private TasksService tasksService;

}
