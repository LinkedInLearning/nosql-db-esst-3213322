package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class TimeController {

    @GetMapping("/")
    public String getMethodName(WebRequest request) {
        Object time = request.getAttribute("time", WebRequest.SCOPE_SESSION);
        if(time == null) {
            time = LocalDateTime.now().toString();
            request.setAttribute("time", time, WebRequest.SCOPE_SESSION);
        }
        
        return time.toString();
    }

}
