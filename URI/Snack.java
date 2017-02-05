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
public class Snack {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double[] v = new double[]{1.00 ,4.00 , 4.50 , 5.00 , 2.00 , 1.50 };
        double a  =  v[x] * y;
        BigDecimal bd = new BigDecimal(a).setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Total: R$ "+ a);
        
        
        
    }
    
}
