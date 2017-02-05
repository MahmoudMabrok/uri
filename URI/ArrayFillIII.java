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
public class ArrayFillIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.printf("N[%d] = %.4f\n" , 1 , a);
        for (int i = 1; i < 100; i++) {
            a=a/2.0;
            System.out.printf("N[%d] = %.4f\n" , i , a);
        }
    }
    
    
}
