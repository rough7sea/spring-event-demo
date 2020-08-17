package com.rough7sea.events.listners.message;

import com.rough7sea.events.event.MessageProcessedEvent;
import com.rough7sea.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceivedAnnotationEventListener {

    @EventListener
    public MessageProcessedEvent receivedMessage(MessageReceivedEvent event){
        log.info("Annotation Received message with text: '" + event.getText() + "'");
        return new MessageProcessedEvent(this, event.getText());
    }
}
