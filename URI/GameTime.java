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
public class GameTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if ( y > x )
            System.out.println("O JOGO DUROU "+(y - x)+ " HORA(S)");
        else 
            System.out.println("O JOGO DUROU "+(24 - x + y )+ " HORA(S)");
    }
    
}
