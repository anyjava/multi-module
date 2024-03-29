package dev.anyjava.multimodule.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ApiApplicationTest {

    @Value("${cuddy.id}")
    private String cuddyId;

    @Test
    public void testContext() {
        assertEquals("anyjava-test-api", cuddyId);

    }
}