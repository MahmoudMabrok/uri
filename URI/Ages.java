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
public class Ages {
    public static void main(String[] args) {
        int x , count  =0;
        double  sum = 0 ;
        
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        do {            
         sum+= x;   
         count ++;
         x = scanner.nextInt();
        } while (x > 0 );
        
        BigDecimal bd = new BigDecimal(sum /count).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(bd);
    }
    
}
