/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation1;

/**
 *
 * @author Asus
 */
public class Person {
    private String name;
    private int age;
    
    Person(){
        this.name = "";
        this.age = 0;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
