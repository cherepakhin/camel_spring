package camelinaction;

public class GreaterService {
    private Greeter greeter;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public String getHello() {
        return greeter.sayHello();
    }
}
