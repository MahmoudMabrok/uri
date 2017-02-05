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
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c  = scanner.nextDouble();
        
        
        double area = 0.5 * a * c ;
        System.out.printf("TRIANGULO: %.3f\n" , area);
        area =  c *c * 3.14159 ;
        System.out.printf("CIRCULO: %.3f\n" , area);
         area =  0.5* (a + b) * c  ;
        System.out.printf("TRAPEZIO: %.3f\n" , area);
        area = b*b ;
        
        System.out.printf("QUADRADO: %.3f\n" , area);
         area =  a * b ;
     System.out.printf("RETANGULO: %.3f\n" , area);
    }
    
}
