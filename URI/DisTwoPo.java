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
public class DisTwoPo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c  = scanner.nextDouble();
        double d  = scanner.nextDouble();
        double r = Math.sqrt(Math.pow(a-c, 2)+( Math.pow(b-d, 2)));
        System.out.printf("%.4f\n" , r);
    }
    
}
