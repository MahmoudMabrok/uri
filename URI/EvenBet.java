/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.util.Scanner;

/**
 *
 * @author mo3tamed
 */
public class EvenBet {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
         int c =0;
        double a ;
        for (int i = 0; i < 5; i++) {
          a = scanner.nextDouble(); 
         if (a %2 == 0 )
          c++;   
        }
        System.out.println(c+" valores pares");
        
    }
    
}
