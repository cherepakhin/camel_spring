package ru.perm.v.camelinaction.ch2.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Other variant define configuration class
 */
@Configuration
public class SimpleJavaConfig {
    @Bean
    public String beanOneFromSimpleJavaConfig() {
        return "beanOne";
    }

    @Bean
    public String beanTwoFromSimpleJavaConfig() {
        return "beanTwo";
    }
}
