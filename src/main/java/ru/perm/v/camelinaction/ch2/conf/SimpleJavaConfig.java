package ru.perm.v.camelinaction.ch2.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Variant define configuration class through annotation @Configuration.
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
