package ru.perm.v.camelinaction.ch2;

public class DanishGreeter implements Greeter {

    public String sayHello() {
        return "Davs " + System.getProperty("user.name");
    }
}
