package ru.perm.v.camelinaction.ch2;


import org.junit.Test;
import ru.perm.v.camelinaction.ch2.greeters.EnglishGreeter;

import static org.junit.Assert.assertEquals;

public class EnglishGreeterTest {
    @Test
    public void sayHello() {
        EnglishGreeter greeter = new EnglishGreeter();
        assertEquals("Hello, vasi", greeter.sayHello());
    }
}