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
public class EvenOddPONe {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int e =0 , o =0 , p =0 , n =0 ;
        double a ;
        for (int i = 0; i < 5; i++) {
          a = scanner.nextDouble(); 
         if (a %2 == 0 )
          e++;
         else
          o ++ ;
         if ( a > 0 )
             p++;
         if ( a < 0 )
             n++;
         
        }
        System.out.println(e+" valor(es) par(es)");
        System.out.println(o+" valor(es) impar(es)");
        System.out.println(p+" valor(es) positivo(s)");
        System.out.println(n+" valor(es) negativo(s)");
        
    }
    
}
