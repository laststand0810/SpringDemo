package Drawing;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenpham
 */
public class DrawingApp {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/Spring/spring.xml");
        context.registerShutdownHook(); //
        Triangle triangle = (Triangle) context.getBean("special-triangle");
        Polygon poly = (Polygon) context.getBean("polygon");
        
        triangle.draw();
        poly.draw();
    }
}
