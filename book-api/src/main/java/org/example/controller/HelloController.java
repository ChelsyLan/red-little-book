package org.example.controller;

import org.example.grace.result.GraceJSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("Hello")
    public Object hello(){
        return GraceJSONResult.ok("Hello, spring boot!");
    }
}
