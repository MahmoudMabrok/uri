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
public class PosAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int c =0;
        double a = 1  ;
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            a = scanner.nextDouble();
            if (a > 0) {
                c++;
                 sum += a;
            }
        }

    
    System.out.println(c+" valores positivos");
    System.out.printf( "%.1f\n",(sum / c));
    
    
    }

    
        
    }
    

