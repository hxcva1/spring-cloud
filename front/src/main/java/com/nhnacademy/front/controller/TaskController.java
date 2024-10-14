package com.nhnacademy.front.controller;

import com.nhnacademy.front.adapter.TaskAdapter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskAdapter taskAdapter;

    public TaskController(TaskAdapter taskAdapter) {
        this.taskAdapter = taskAdapter;
    }

    @PostMapping("/project")
    public HashMap<String, Object> postProject(@RequestBody HashMap<String, Object> map){
        return taskAdapter.postProject(map);
    }

}
