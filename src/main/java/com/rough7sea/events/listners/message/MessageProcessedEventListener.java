package com.rough7sea.events.listners.message;

import com.rough7sea.events.event.MessageProcessedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageProcessedEventListener {

    @EventListener
    public void onEvent(MessageProcessedEvent event){
        log.info("Received processing event with text: '" + event.getText() + "'");
    }
}
