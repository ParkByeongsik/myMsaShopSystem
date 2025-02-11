package com.msashop.testpay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class TestController {
    @GetMapping("/test")
    public String pay(){
        return "결제시스템";
    }
}

