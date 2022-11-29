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
public class Main {
    public static void main(String[] args) {
        
        // runtime polymorphism
        Person s1 = new Student();
        s1.display();
        
        Shape c1 = new Circle(5.55);
        System.out.println("Circle = " + c1.area());
        
        Shape t1 = new Triangle(10, 20);
        System.out.println("Triangle = " + t1.area());
    }
}
