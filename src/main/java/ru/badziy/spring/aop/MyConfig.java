package ru.badziy.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.badziy.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
