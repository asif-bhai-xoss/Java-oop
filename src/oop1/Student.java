/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

public class Student {
    String name;
    int age;
    static String university = "EWU";
    static int count = 0;
    
    // default constructor
    Student(){
        System.out.println("No value given yet");
        count++;
    }
    
    // parameterized constructor
    Student(String n, int a){
        name = n;
        age = a;
        count++;
    }
    static {
        System.out.println("This is static block");
    }
    
    
    void print_info(){
        System.out.println("Student "+count);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("University: "+university);
        System.out.println();
    }
}
