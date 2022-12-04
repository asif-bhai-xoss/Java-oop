/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismArray;

/**
 *
 * @author Asus
 */
public class Circle extends Shape {
    double radius;
    Circle(){
        this.radius = 0.00;
    }
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double parameter(){
        System.out.print("Circle = ");
        return 2*3.1416*radius;
    }
    
}
