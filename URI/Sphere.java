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
public class Sphere {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.printf("VOLUME = %.3f\n", (4/3.0*3.14159*a*a*a ));
    }
    
}
