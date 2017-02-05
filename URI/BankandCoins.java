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
public class BankandCoins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double[] d = new double[]{100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("NOTAS:");
        for (int i = 0; i < d.length; i++) {
            double r = d[i] ;
               // System.out.println((int)(a/d[i]) +" nota(s) de R$ "+r);
                System.out.printf("%d nota(s) de R$ %.2f\n" , (int)(a/d[i])   ,d[i]  );
                a=a%d[i];
                if (i == 5 )
                    System.out.println("MOEDAS:");
        }
        
    }

                    
}
