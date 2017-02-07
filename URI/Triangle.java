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
public class Triangle {
    public static void main(String[] args) {
        
        
          Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if ( a < b+c  && b < a+c  && c < a+b     )
        {
            System.out.printf("Perimetro = %.1f\n" , (a+b+c));
        }
        else
        {
         System.out.printf("Area = %.1f\n" , ( 0.5 * (a +b) * c) );
        }
    }
    
}
