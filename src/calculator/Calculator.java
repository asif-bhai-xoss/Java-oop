/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Asus
 */
public class Calculator {
    void add(int ... numbers){
        int sum = 0;
        for(int num : numbers){
            sum = sum + num;
        }
        System.out.println("Sum = " + sum);
    }
}
