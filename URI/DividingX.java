/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author mo3tamed
 */
public class DividingX {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         int n;
         n = scanner.nextInt();
        double val1;
        double val2 ;
        
        double[] A = new double[n];
        for (int i = 0; i< A.length ; i++) {
         val1 = scanner.nextDouble();
         val2 = scanner.nextDouble();
         if ( val2 != 0 )
             A[i] = val1 / val2 ; 
         else 
             A[i]= Double.MAX_VALUE ;
            
        }
        for (int i = 0; i< A.length ; i++) {
        
          if (A[i] != Double.MAX_VALUE  )
          {
              BigDecimal bd = new BigDecimal(A[i]).setScale(1, RoundingMode.HALF_EVEN);
                System.out.println(bd);
          } 
          else 
                System.out.println("divisao impossivel");
        }
        
    }
    
}
