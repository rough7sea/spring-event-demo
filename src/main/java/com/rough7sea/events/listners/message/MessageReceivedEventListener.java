package com.rough7sea.events.listners.message;

import com.rough7sea.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceivedEventListener
        implements ApplicationListener<MessageReceivedEvent> {

    @Override
    public void onApplicationEvent(MessageReceivedEvent event) {
        log.info("Received message with text: '" + event.getText() + "'");
    }
}
