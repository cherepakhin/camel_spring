package ru.perm.v.camelinaction.ch2;

public class RussianGreeter implements Greeter {

    public String sayHello() {
        return "Привет, " + System.getProperty("user.name");
    }
}
