package ru.perm.v.camelinaction.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        GreeterService greeterService =
                (GreeterService) context.getBean("greeterService");
        System.out.println(greeterService.getHello()); // Hello, vasi!
    }
}
