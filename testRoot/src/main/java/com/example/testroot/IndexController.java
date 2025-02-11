package com.example.testroot;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    public String index() {
        return "index";
    }
}
