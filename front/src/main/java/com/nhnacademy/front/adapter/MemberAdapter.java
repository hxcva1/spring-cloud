package com.nhnacademy.front.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@FeignClient(path = "/members", url = "http://localhost:8080", name = "member")
public interface MemberAdapter {

    @PostMapping("")
    HashMap<String, Object> createMember(HashMap<String, Object> map);
}
