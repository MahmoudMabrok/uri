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
public class Interval2 {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int num , c =0 ; 
         for (int i = 0; i < a; i++) {
            num = scanner.nextInt();
            if ( num >= 10 && num <= 20 )
                c++;
        }
         System.out.println(c+" in");
         System.out.println((a-c ) +" out");
    }
    
}
