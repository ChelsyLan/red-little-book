package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.grace.result.GraceJSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping("Hello")
    public Object hello(){
        return GraceJSONResult.ok("Hello, spring boot!");
    }
}
