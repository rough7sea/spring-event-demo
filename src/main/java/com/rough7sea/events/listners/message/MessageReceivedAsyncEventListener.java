package com.rough7sea.events.listners.message;

import com.rough7sea.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceivedAsyncEventListener {

    @EventListener
    public void receiveMessageAsync(MessageReceivedEvent event){
        log.info("Async received message with text: '" + event.getText() + "'");
    }
}
