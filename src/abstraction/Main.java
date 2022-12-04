/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Communication c1, c2;
        c1 = new Sender();
        c2 = new Receiver();
        
        c1.call();
        c1.message();
        c2.call();
        c2.message();
        
    }
}
