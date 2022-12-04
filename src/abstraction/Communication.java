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
public abstract class Communication {
    void call(){
        System.out.println("Calling.....");
    }
    abstract void message();
}
