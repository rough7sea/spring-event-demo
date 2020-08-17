package com.rough7sea.events.listners.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationStartedEventListener {

    @Order(3)
    @EventListener
    public void onApplicationContextRefresh1(ContextRefreshedEvent event){
        log.info("1. Application started successfully: " + event);
    }

    @Order(2)
    @EventListener
    public void onApplicationContextRefresh2(ContextRefreshedEvent event){
        log.info("2. Application started successfully: " + event);
    }

    @Order(1)
    @EventListener
    public void onApplicationContextRefresh3(ContextRefreshedEvent event){
        log.info("3. Application started successfully: " + event);
    }
}
