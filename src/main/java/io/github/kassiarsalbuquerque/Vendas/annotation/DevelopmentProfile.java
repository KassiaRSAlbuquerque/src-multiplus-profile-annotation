package io.github.kassiarsalbuquerque.Vendas.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DevelopmentProfile {

}