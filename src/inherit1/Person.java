/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit1;

/**
 *
 * @author Asus
 */
public class Person {
    String name;
    int age;
    private int id;
    Person(){
        this.name = "";
        this.age = 0;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    void print_info1(){
        System.out.println("Id = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
    }
    
}
