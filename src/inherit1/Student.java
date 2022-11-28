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
public class Student extends Person{
    int total;
    private int gpa;
    Student(){
        this.total = 0;
        this.gpa = 0;
    }
    Student(int total, int gpa){
        this.total = total;
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    
    void print_info2(){
        print_info1();
        System.out.println("Total = " + this.total);
        System.out.println("Gpa = " + this.gpa);
    }
}
