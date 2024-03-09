package ru.perm.v.camelinaction.ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo for @Configuration and @Bean from conf.SimpleJavaConfig
 */
@RestController
@RequestMapping("/simple_conf")
public class SimpleJavaConfigRest {
    @Autowired
    String beanOneFromSimpleJavaConfig;

    @Autowired
    String beanTwoFromSimpleJavaConfig;

    /**
     * http :8080/api/simple_conf/bean_one
     * @return beanOne
     */
    @GetMapping("/bean_one")
    public String beanOne() {
        return beanOneFromSimpleJavaConfig;
    }

    /**
     * http :8080/api/simple_conf/bean_two
     * @return beanTwo
     */
    @GetMapping("/bean_two")
    public String beanTwo() {
        return beanTwoFromSimpleJavaConfig;
    }
}
