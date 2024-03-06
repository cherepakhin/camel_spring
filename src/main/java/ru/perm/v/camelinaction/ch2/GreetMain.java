package ru.perm.v.camelinaction.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

    private Greeter greeter;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        GreaterService greaterService =
                (GreaterService) context.getBean("greaterService");
        System.out.println(greaterService.getHello());
    }
}
