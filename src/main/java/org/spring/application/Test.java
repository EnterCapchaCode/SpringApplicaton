package org.spring.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        computer.showInfo(Genres.RAP);

        context.close();
    }
}
