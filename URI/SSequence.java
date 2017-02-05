/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

/**
 *
 * @author mo3tamed
 */
public class SSequence {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += (1.0 / i); 
        }
        System.out.printf("%.2f\n" , sum);
    }
    
}
