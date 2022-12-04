/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismArray;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        
//        Shape s1 = new Rectangle(5, 6);
//        Shape s2 = new Circle(5);
//        
//        System.out.println(s1.parameter());
//        System.out.println(s2.parameter());

          Shape[] s = new Shape[3];
          
          s[0] = new Rectangle(20, 10);
          s[1] = new Circle(10);
          s[2] = new Rectangle(5, 10);
          
          for(int i=0; i<s.length; i++){
              System.out.println(s[i].parameter());
          }
    }
}
