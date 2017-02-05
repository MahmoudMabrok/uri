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
public class GrowingSequence {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[] A = new int[Integer.MAX_VALUE / 2000];
        
        int c =0 , a  ;
       
//       
//        do {            
//         
//          
//         c++;
//         a = scanner.nextInt();
//          
//        } while (a > 0  );
//        
//        ////////////////////////////// 
//      
        a = scanner.nextInt();
        while ( a > 0 )
        {
        
         A[c] = a ;
         c++;
         
         a = scanner.nextInt();
        
        }
        for (int i = 0; i < c; i++) {
            for (int j = 1; j <= A[i]; j++) {
                System.out.print(j);
               
                    System.out.print(" ");
            }
           
            System.out.println("");
    }
    }
    
    
}
