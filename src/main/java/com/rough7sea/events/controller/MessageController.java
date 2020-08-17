package com.rough7sea.events.controller;

import com.rough7sea.events.event.MessageReceivedEvent;
import com.rough7sea.events.models.Message;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MessageController {

    private final ApplicationEventPublisher eventPublisher;

    public MessageController(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @PostMapping("api/v2/message")
    public void sendMessage(@RequestBody Message message){
        eventPublisher.publishEvent(new MessageReceivedEvent(this, message.getText())
        );
    }
}
