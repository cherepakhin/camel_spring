package ru.perm.v.camelinaction.ch2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimpleJavaConfigRestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void beanOne() {
        var task = restTemplate.getForObject("http://127.0.0.1:" + port + "/api/simple_conf/bean_one", String.class);

        assertEquals("beanOne", task);
    }

    @Test
    void beanTwo() {
        var task = restTemplate.getForObject("http://127.0.0.1:" + port + "/api/simple_conf/bean_two", String.class);

        assertEquals("beanTwo", task);
    }
}
