package ru.perm.v.camelinaction.ch2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreeterRestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getForRussian() {
        var result = restTemplate.getForObject("http://127.0.0.1:" + port + "/api/greet/russian", String.class);

        assertTrue(result.contains("Привет"));
    }
    @Test
    void getForEnglish() {
        var result = restTemplate.getForObject("http://127.0.0.1:" + port + "/api/greet/english", String.class);

        assertTrue(result.contains("Hello"));
    }
    @Test
    void getForGermany() {
        var result = restTemplate.getForObject("http://127.0.0.1:" + port + "/api/greet/germany", String.class);

        assertTrue(result.startsWith("Guten Tag,"));
    }
}
