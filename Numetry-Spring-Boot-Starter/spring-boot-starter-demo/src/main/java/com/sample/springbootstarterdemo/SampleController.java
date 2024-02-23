package com.sample.springbootstarterdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String helloMessage() {
        return "<h1>Hello World</h1>";
    }
}
