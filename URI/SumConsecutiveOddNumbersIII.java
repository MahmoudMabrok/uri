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
public class SumConsecutiveOddNumbersIII {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a  , b  , s;
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            s= 0;
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a %2 == 0)
                a++;
            
            for (int j = 0; j < b ; j++) {
                s =s+ (a+ 2*j) ; 
            }
            A[i] = s ;
            
        }
        
        for (int B : A) {
            System.out.println(B);
        }
    }
    
}
