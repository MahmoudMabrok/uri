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
public class ArrFill2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] A = new int[1000];
        int v = -1;
        for (int i = 0; i < 1000; i++) {

            if (v < x -1 ) {

                v++;
            } else {
                v = 0;

            }
            A[i] = v;

        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + A[i]);

        }
    }
}
