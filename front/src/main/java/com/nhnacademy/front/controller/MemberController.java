package com.nhnacademy.front.controller;

import com.nhnacademy.front.adapter.MemberAdapter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberAdapter memberAdapter;

    public MemberController(MemberAdapter memberAdapter) {
        this.memberAdapter = memberAdapter;
    }

    @PostMapping("")
    public HashMap<String, Object> createMember(@RequestBody HashMap<String, Object> map){
        return memberAdapter.createMember(map);
    }
}
