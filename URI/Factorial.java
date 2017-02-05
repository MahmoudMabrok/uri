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
public class Factorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long r = 1 ;
        for (int i = 0; i < a; i++) {
            r *= (a- i );
        }
        System.out.println( r);
    }
    
}
