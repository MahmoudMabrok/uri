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
public class Average3  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double av = (2 * a + 3 * b + 4 * c + d) / (10.0);
         
        if (av >= 7) {
            BigDecimal bd = new BigDecimal(av).setScale(1, RoundingMode.HALF_DOWN);
            
            System.out.printf("Media: %.1f\n", bd);
            System.out.println("Aluno aprovado.");
            
        } else if (av < 5) {
            
            BigDecimal bd = new BigDecimal(av).setScale(1, RoundingMode.HALF_DOWN);
            
            System.out.printf("Media: %.1f\n", bd);
            System.out.println("Aluno reprovado.");
            
        } else {
            d = scanner.nextDouble();
            System.out.printf("Media: %.1f\n", av);
            System.out.println("Aluno em exame.");
            
            System.out.printf("Nota do exame: %.1f\n", d);

            av = (av + d) / 2.0;
            if (av >= 5) {
                System.out.println("Aluno aprovado.");
            } else if (av < 5) {
                System.out.println("Aluno reprovado.");
            }
             System.out.printf("Media final: %.1f\n", av);
        }

    }
}
