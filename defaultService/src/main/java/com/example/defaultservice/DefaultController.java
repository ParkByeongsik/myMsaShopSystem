package com.example.defaultservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/etc")
public class DefaultController {
    @GetMapping
    public String test(){
        return "default";
    }
}
