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
public class ArrayCh {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       int  n =20, j = 19 ;
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            B[j] = A[i];
            j--;
        }
        
        int size=A.length,t;
        for (int i = 0; i < A.length / 2 ; i++) {
             t = A[i];
            A[i] = A[size - 1 ];
            A[size - 1] = t;
            size -- ;
            
        }
       
        for (int i = 0; i < A.length; i++) {
            System.out.println("N["+i+"] = "+B[i]);
            
        }
        /////////////////////////////////////////////////////////
        
        for (int i = 0; i < A.length; i++) {
            System.out.println("N["+i+"] = "+A[i]);
            
        }
        
    }
    
}
