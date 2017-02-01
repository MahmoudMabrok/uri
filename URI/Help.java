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
public class Help {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double z = scanner.nextDouble();
        BigDecimal bd = new BigDecimal(z).setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("bd = " + bd);
    }
    
    
    
}
