package com.nhnacademy.front.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@FeignClient(path = "/task", url = "http://localhost:8080", name = "task")
public interface TaskAdapter {

    @PostMapping("/project")
    HashMap<String, Object> postProject(HashMap<String, Object> map);

}
