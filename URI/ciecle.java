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
public class ciecle {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
         double  x = scanner.nextDouble();
         double n = ( 3.14159 * x * x );
         BigDecimal bd = new BigDecimal(n).setScale(4, RoundingMode.HALF_EVEN);
         System.out.println("A=" + bd );
    }
    
}
