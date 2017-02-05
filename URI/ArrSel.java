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
public class ArrSel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] A = new double[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextDouble();

        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                 BigDecimal bd = new BigDecimal(A[i]).setScale(1, RoundingMode.HALF_EVEN);
                System.out.println("A[" + i + "] = " + bd);
            
            }
        }

    }

}
