package ru.perm.v.camelinaction.ch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetMainApplication.class, args);

// For demo test:
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//        GreeterService greeterService =
//                (GreeterService) context.getBean("selectedGreeterService");
//        System.out.println(greeterService.getHello()); // Hello, vasi!

    }
}
