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
public class Average2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        x = x * 2;
        double y = scanner.nextDouble();
        y = y * 3;
        double z = scanner.nextDouble();
        z = z * 5;
        double a = (x + y + z ) / 10.0;
        BigDecimal bd = new BigDecimal(a).setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("MEDIA = " + bd);

    }

}
