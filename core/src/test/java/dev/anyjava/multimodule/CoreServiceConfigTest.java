package dev.anyjava.multimodule;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = CoreServiceConfig.class)
class CoreServiceConfigTest {

    @Value("${cuddy.id}")
    private String cuddyId;

    @Test
    public void applicationContext() {
        assertEquals("anyjava", cuddyId);
    }
}