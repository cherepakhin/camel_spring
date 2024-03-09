package ru.perm.v.camelinaction.ch2.greeters;

public class GermanyGreeter implements Greeter {

    public String sayHello() {
        return "Guten Tag, " + System.getProperty("user.name");
    }
}
