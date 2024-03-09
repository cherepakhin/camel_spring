package ru.perm.v.camelinaction.ch2.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is a variant define configuration with annotation @Configuration and @Bean.
 *<p/><p/
 * (other variant is ru.perm.v.camelinaction.ch2.conf.BeansConfiguration
 * used in ru.perm.v.camelinaction.ch2.SimpleJavaConfigRest)
 */
@Configuration
public class ConfigFromJava {
    @Bean
    public String beanOneFromSimpleJavaConfig() {
        return "beanOne";
    }

    @Bean
    public String beanTwoFromSimpleJavaConfig() {
        return "beanTwo";
    }
}
