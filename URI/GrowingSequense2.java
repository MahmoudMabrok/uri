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
public class GrowingSequense2 {
    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);
     
        
        int  a  ;
        a = scanner.nextInt();
        while ( a > 0 )
        {
            for (int i = 1; i <= a; i++) {
                System.out.print(i);
                if ( i != a)
                    System.out.print(" ");
            }
            System.out.println("");
                
         a = scanner.nextInt();
        
        }
    }
    }
    

