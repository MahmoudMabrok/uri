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
public class Average1 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    double  x = scanner.nextDouble();
    x = x*3.5;
    double  y = scanner.nextDouble();
    y = y*7.5;
    double a = (x+ y) / 11.0;
        System.out.println("a = " + a);
    BigDecimal bd = new BigDecimal(a).setScale(5, RoundingMode.HALF_EVEN);
        System.out.println("MEDIA = " + bd);
    
    
    }
    
    
    
}
