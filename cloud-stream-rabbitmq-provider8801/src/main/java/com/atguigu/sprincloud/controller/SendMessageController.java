package com.atguigu.sprincloud.controller;


import com.atguigu.sprincloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private IMessageService messageService;


    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageService.send();
    }
}
