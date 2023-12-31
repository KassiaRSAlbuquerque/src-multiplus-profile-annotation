package io.github.kassiarsalbuquerque.Vendas.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Autowired
@Qualifier("cachorro")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CachorroAnnotation {

}