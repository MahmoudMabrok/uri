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
public class PosNum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int c =0;
        double a ; 
        for (int i = 0; i < 6; i++) {
         a = scanner.nextDouble();
         if (a > 0 )
          c++;   
        }
        System.out.println(c+" valores positivos");
        
    }
    
}
