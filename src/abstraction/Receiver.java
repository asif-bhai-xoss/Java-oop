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
public class Receiver extends Communication{
    
    @Override
    void call(){
        System.out.println("Receiver is busy");
    }
    
    @Override
    void message(){
        System.out.println("Message receieved!!");
    }
}
