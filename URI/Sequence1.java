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
public class Sequence1 {
    public static void main(String[] args) {
        
        int i = 1 ;
        for (int j = 7; j > 4; j--) {
            System.out.println("I="+i+" J="+j);
            if (j == 5 && i != 9)
            {
            i+=2;
            j=8;
            
            }
        }
    }
    
}
