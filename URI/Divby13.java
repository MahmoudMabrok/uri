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
public class Divby13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = 0;
        if (a > b) {
            int t = a;

            a = b;
            b = t;
        }
        for (int i = a; i <= b; i++) {
            if (i % 13 != 0) {
                sum += i;
            }

        }
        System.out.println(sum);

    }

}
