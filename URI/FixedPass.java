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
public class FixedPass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a != 2002)
        {
            System.out.println("Senha Invalida");
            a = scanner.nextInt();
        
        }
        System.out.println("Acesso Permitido");
    }
}
