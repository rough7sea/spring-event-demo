package com.rough7sea.events.listners.message;

import com.rough7sea.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ErrorMessageReceivedAnnotationEventListener {

    @EventListener(condition = "#event.text.toLowerCase().contains('error')")
    public void receivedMessage(MessageReceivedEvent event){
        log.info("Received error message with text: '" + event.getText() + "'");
    }
}
