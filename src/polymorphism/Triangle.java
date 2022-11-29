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
public class Triangle extends Shape{
    double l;
    double h;
    Triangle(double l, double h){
        this.l = l;
        this.h = h;
    }
    double area(){
        return l*h;
    }
}
