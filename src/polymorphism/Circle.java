/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Asus
 */
public class Circle extends Shape {
    double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    double area(){
        return 3.1416*r*r;
    }
}
