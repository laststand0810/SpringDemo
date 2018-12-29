/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author nguyenpham
 */
public class Triangle implements InitializingBean, DisposableBean, BeanNameAware{
    private String name;
    private String type;
    private int height;
    private Point A,B,C;
    public void draw(){
        System.out.println(getA().getX() + " " + getA().getY());
        System.out.println(getB().getX() + " " + getB().getY());
        System.out.println(getC().getX() + " " + getC().getY());
    }
    
    public Triangle(){
    }
    
    public Triangle(String type){
        this.type = type;
    }
    
    public Triangle(String type, int height){
        this.type = type;
        this.height = height;
    }
    
    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
    }    

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the A
     */
    public Point getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(Point A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public Point getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(Point B) {
        this.B = B;
    }

    /**
     * @return the C
     */
    public Point getC() {
        return C;
    }

    /**
     * @param C the C to set
     */
    public void setC(Point C) {
        this.C = C;
    }

    //this function will be called when the bean is initialized
    @Override
    public void afterPropertiesSet() throws Exception {
        
    }

    //this function will be called when the bean is disposed.
    @Override
    public void destroy() throws Exception {
        System.out.println("this Triangle " + name + " bean is disposed");
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
