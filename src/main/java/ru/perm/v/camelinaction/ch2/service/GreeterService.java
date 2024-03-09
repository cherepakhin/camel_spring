package ru.perm.v.camelinaction.ch2.service;

import ru.perm.v.camelinaction.ch2.greeters.Greeter;

public class GreeterService {
    private Greeter greeter;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public String getHello() {
        return greeter.sayHello();
    }
}
