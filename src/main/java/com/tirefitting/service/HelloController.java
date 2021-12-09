package com.tirefitting.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Molodets";
    }
}
