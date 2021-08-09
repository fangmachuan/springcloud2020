package com.atguigu.sprincloud.service.impl;

import com.atguigu.sprincloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;


@EnableBinding(Source.class)
public class IMessageServiceImpl implements IMessageService {


    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("**************serial:"+serial);
        return null;
    }
}
