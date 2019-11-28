package dev.anyjava.multimodule.api.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class FooService {

    @Value("${cuddy.id}")
    private String cuddyId;


    @PostConstruct
    public void post() {
        log.info("cuddy.id => {}", cuddyId);
    }
}
