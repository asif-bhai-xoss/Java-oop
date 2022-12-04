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
public class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(){
        this.length = 0.00;
        this.width = 0.00;
    }
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double parameter(){
        System.out.print("Reactangle = ");
        return 2*(length+width);
    }
}
