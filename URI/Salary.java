/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.util.Scanner;


import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 *
 * @author mo3tamed
 */
public class Salary {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double z = scanner.nextDouble();
        System.out.println("NUMBER = " + x);
        BigDecimal bd = new BigDecimal(y * z).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("SALARY = U$ " + bd);
        
        
    }
}
