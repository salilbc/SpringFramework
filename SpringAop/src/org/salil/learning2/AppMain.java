package org.salil.learning2;

import org.salil.learning2.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
    }
}

