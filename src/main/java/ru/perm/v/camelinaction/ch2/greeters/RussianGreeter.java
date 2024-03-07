package ru.perm.v.camelinaction.ch2.greeters;

public class RussianGreeter implements Greeter {
    public String sayHello() {
        return "Привет, " + System.getProperty("user.name");
    }
}
