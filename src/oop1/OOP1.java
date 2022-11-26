/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author Asus
 */
public class OOP1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("Asif", 25);
//        s1.name = "Asif";
//        s1.age = 25
        s1.print_info();
        
//        System.out.println("Student1 name: "+s1.name);
//        System.out.println("Student1 age: "+s1.age);
        
        Student s2 = new Student();
        s2.name = "Oishy";
        s2.age = 22;
        s2.print_info();
        
        Student s3 = new Student();
        s3.university = "NSU";
        s3.print_info();
        
        System.out.println("Total Students = " + Student.count);
        
        System.out.println("\nStatic print changed by obj = " + Student.university);
        Student.university = "DU";
        System.out.println("Static print changed by class = " + Student.university);
    }
    
}
