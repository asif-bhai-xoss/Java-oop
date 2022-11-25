/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

public class Student {
    String name;
    int age;
    
    // default constructor
    Student(){
        System.out.println("No value given yet");
    }
    
    // parameterized constructor
    Student(String n, int a){
        name = n;
        age = a;
    }
    void print_info(){
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println();
    }
}
