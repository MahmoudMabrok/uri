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
public class SaralyPlus {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n" , (0.15 * b) + a);
    }
    
}
