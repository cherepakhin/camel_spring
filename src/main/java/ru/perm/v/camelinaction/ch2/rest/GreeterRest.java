package ru.perm.v.camelinaction.ch2.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.v.camelinaction.ch2.service.GreeterService;
import ru.perm.v.camelinaction.ch2.greeters.EnglishGreeter;
import ru.perm.v.camelinaction.ch2.greeters.GermanyGreeter;
import ru.perm.v.camelinaction.ch2.greeters.RussianGreeter;

@RestController
@RequestMapping("/greet")
public class GreeterRest {

    /**
     * inject from beans.xml property <property name="greeter" ref="russianGreeter"/>
     */
    @Autowired
    GreeterService selectedGreeterService;
    @Autowired
    GermanyGreeter germanyGreeter;
    @Autowired
    EnglishGreeter englishGreeter;
    @Autowired
    RussianGreeter russianGreeter;

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return message;
    }

    @GetMapping("/selected")
    public String getSelectedHello() {
        return selectedGreeterService.getHello();
    }

    @GetMapping("/english")
    public String getEnglishHello() {
        return englishGreeter.sayHello();
    }

    @GetMapping("/germany")
    public String getGermanHello() {
        return germanyGreeter.sayHello();
    }

    @GetMapping("/russian")
    public String getRussianHello() {
        return russianGreeter.sayHello();
    }
}
