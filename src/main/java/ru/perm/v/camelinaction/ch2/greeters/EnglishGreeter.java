package ru.perm.v.camelinaction.ch2.greeters;

public class EnglishGreeter implements Greeter {

    public String sayHello() {
        return "Hello, " + System.getProperty("user.name");
    }
}
