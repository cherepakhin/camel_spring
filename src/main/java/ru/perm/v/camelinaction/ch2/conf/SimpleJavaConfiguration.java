package ru.perm.v.camelinaction.ch2.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleJavaConfiguration {
    @Bean
    public String beanOneFromSimpleJavaConfiguration() {
        return "beanOne";
    }

    @Bean
    public String beanTwoFromSimpleJavaConfiguration() {
        return "beanTwo";
    }
}
