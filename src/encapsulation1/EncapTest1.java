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
public class EncapTest1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Name before = " + p1.getName());
        p1.setName("Asif");
         System.out.println("Name after = " + p1.getName());
    }
}
