package org.salil.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args){

        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/Users/ssinaicuncoliencar/IdeaProjects/TestSpring/src/spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Triangle triangle= (Triangle) factory.getBean("triangle");
        //Triangle triangle= (Triangle) context.getBean("triangle");
        //triangle.draw();

        Shape shape= (Shape) context.getBean("circle");
        shape.draw();

        //System.out.println(context.getMessage("greeting", null, "Default greeting", null));

    }
}
