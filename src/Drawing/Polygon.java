/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author nguyenpham
 */
public class Polygon implements ApplicationContextAware, BeanNameAware{
    private List<Point> points;
    private ApplicationContext context = null;
    /**
     * @return the points
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    
    public void draw(){
        points.forEach((point) -> {
            System.out.println("Polygon point: " + point.getX() + " " + point.getY());
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is : " + name);
    }
}
