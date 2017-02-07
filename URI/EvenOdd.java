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
public class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();

        }
        for (int i = 0; i < a; i++) {

            if (b[i] % 2 == 0 && b[i] > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (b[i] % 2 == 0 && b[i] < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (b[i] < 0 && b[i] % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else if (b[i] > 0 && b[i] % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else {
                System.out.println("NULL");
            }
        }
    }

}
