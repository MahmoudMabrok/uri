/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author mo3tamed
 */
public class ScoreValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        while ( a < 0 || a > 10 )
        {
            System.out.println("nota invalida");
            a = scanner.nextDouble();
        }
        double b = scanner.nextDouble();
         while ( b < 0 || b > 10 )
        {
            System.out.println("nota invalida");
            b = scanner.nextDouble();
        }
        BigDecimal bd = new BigDecimal( (a+b) / 2.0).setScale(2, RoundingMode.HALF_DOWN);
       
         System.out.println("media = "+ bd);
         
         
    }
    
}
