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
public class EasyFib {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] fib = new int[46];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i < a; i++) {
            fib[i] = (fib[i-1])+ (fib[i-2 ]);
        }
        for (int i = 0; i < a; i++) {
            System.out.print( fib[i]) ;
            if ( i != a-1)
                System.out.print(" ");
        }
            System.out.print("\n");
        
    }
    
}
