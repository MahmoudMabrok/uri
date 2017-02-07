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
    public class Bhaskara {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == 0 || (b * b) < (4 * a * c)) {
            System.out.println("Impossivel calcular");
        } else {
            double r1, r2;
            r1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            r2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2.0 * a);
             
            
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
            
        }
    }

}
