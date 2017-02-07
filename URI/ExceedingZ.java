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
public class ExceedingZ {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (b < a || b == a )
        {
        b = scanner.nextInt();
        }
        int c = 1 , sum = a+1; 
      //  System.out.println(sum < b);
        while ( sum < b )
        {
        c++;
        sum += a ; 
        a++ ; 
        }
        System.out.println(c);
    }
    
}
