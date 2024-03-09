package ru.perm.v.camelinaction.ch2;


import org.junit.jupiter.api.Test;
import ru.perm.v.camelinaction.ch2.greeters.EnglishGreeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnglishGreeterTest {
    @Test
    void sayHello() {
        EnglishGreeter greeter = new EnglishGreeter();
        assertEquals("Hello, vasi", greeter.sayHello());
    }
}