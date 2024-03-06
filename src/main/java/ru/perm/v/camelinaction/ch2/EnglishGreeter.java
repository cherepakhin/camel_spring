package ru.perm.v.camelinaction.ch2;

public class EnglishGreeter implements Greeter {

    public String sayHello() {
        return "Hello, " + System.getProperty("user.name");
    }
}
