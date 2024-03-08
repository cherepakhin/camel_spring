package ru.perm.v.camelinaction.ch2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:beans.xml"})
public class BeansConfiguration {
}
