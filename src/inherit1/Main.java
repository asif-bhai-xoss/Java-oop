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
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1522);
        s1.name = "Asif";
        s1.age = 25;
        s1.total = 5;
        s1.setGpa(5);
        s1.print_info2();
    }
}
