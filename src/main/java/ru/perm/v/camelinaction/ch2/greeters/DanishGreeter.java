package ru.perm.v.camelinaction.ch2.greeters;

public class DanishGreeter implements Greeter {

    public String sayHello() {
        return "Davs " + System.getProperty("user.name");
    }
}
