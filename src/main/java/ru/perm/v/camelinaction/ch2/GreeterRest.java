package ru.perm.v.camelinaction.ch2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreeterRest {

    GreeterService greeterService; //TODO: inject

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return message;
    }

    @GetMapping("/hello")
    public String getHello() {
        return greeterService.getHello();
    }
}
