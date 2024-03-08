package ru.perm.v.camelinaction.ch2.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple_conf")
public class RestFromSimpleJavaConfiguration {
    @Autowired
    String beanOneFromSimpleJavaConfiguration;

    @Autowired
    String beanTwoFromSimpleJavaConfiguration;

    /**
     * http :8080/api/simple_conf/bean_one
     * @return beanOne
     */
    @GetMapping("/bean_one")
    public String beanOne() {
        return beanOneFromSimpleJavaConfiguration;
    }

    /**
     * http :8080/api/simple_conf/bean_two
     * @return beanTwo
     */
    @GetMapping("/bean_two")
    public String beanTwo() {
        return beanTwoFromSimpleJavaConfiguration;
    }
}
