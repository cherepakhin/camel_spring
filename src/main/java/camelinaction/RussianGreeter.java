package camelinaction;

public class RussianGreeter implements Greeter {

    public String sayHello() {
        return "Привет, " + System.getProperty("user.name");
    }
}
