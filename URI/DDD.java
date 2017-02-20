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
public class DDD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
       if (x == 11) {
            System.out.println("Sao Paulo");
        } else if (x == 31) {
            System.out.println("Belo Horizonte");
        } else if (x == 71) {
            System.out.println("Salvador");
        } else if (x == 21) {
            System.out.println("Rio de Janeiro");
        } else if (x == 61) {
            System.out.println("Brasilia");
        } else if (x == 32) {
            System.out.println("Juiz de Fora");
        } else if (x == 19) {
            System.out.println("Campinas");
        } else if (x == 27) {
            System.out.println("Vitoria");
        } else {
            System.out.println("DDD nao cadastrado");
        }

    }

}
