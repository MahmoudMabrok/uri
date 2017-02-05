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
public class Positive {
    public static void main(String[] args) {
        
         
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[6];
         int n_p = 0;   
        for (int y =0 ; y < x.length ; y++) {
            x[y] = scanner.nextInt();
            if (x[y] >0)
                n_p ++ ;
        }
        System.out.println(n_p +" valores positivos");
        
     }
    
}
