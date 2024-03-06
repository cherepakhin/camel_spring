package camelinaction;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnglishGreeterTest {
    @Test
    public void sayHello() {
        EnglishGreeter greeter = new EnglishGreeter();
        assertEquals("Hello, vasi", greeter.sayHello());
    }
}