package ru.perm.v.camelinaction.ch2.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Variant define configuration from beans.xml
 */
@Configuration
@ImportResource({"classpath*:beans.xml"})
public class BeansConfiguration {
}
