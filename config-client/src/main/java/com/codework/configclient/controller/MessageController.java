package com.codework.configclient.controller;

import com.codework.configclient.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    ConfigProperties configProperties;

    @GetMapping("/configmessage")
    public String getMessage(){
        return configProperties.getMessage();
    }

}
