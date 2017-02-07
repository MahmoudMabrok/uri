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
public class PopulationIncrease {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        double a, b, ra, rb;
        int c = 0;

        for (int i = 0; i < n; i++) {
            c = 0;
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            ra = scanner.nextDouble();
            rb = scanner.nextDouble();
            //  System.out.println(a <= b);
            while (a <= b) {
                a = (int) (a * (ra / 100.0)) + a;

                b = (int) (b * (rb / 100.0)) + b;

                c++;
                if (c > 100) {
                    c = -1;
                    break;

                }
            }

            ans[i] = c;
        }
        for (int an : ans) {
            if (an == -1) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(an + " anos.");
            }
        }

    }

}
