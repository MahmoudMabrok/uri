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
public class TriangleType {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c  = scanner.nextDouble();
        if (b > a )
        {
        double t = a ; 
        a = b;
        b= t;
        }
        if ( c > a )
        {
        double t = a ; 
        a = c;
        c= t;
        
        }
        if ( c > b )
        {
            double t = b ; 
        b = c;
        c= t;
            
        }            
        double a2 = a*a ;
        double p2 =  (b*b) + (c*c ) ;
        
        if (a >= (b + c ))
            System.out.println("NAO FORMA TRIANGULO");
        else 
        {
            if (a2 == p2)
                System.out.println("TRIANGULO RETANGULO");
        
         else   if ( a2 > p2)
                System.out.println("TRIANGULO OBTUSANGULO");
        
            else
                System.out.println("TRIANGULO ACUTANGULO");
       //////////////////////////////////////////
            if ( a ==b && b== c)
                System.out.println("TRIANGULO EQUILATERO");
            if (( a == b && a!=c ) ||( c == b && a!=c ) ||( a == c && b!=c )  )
                System.out.println("TRIANGULO ISOSCELES");
                }
        
    }
    }

