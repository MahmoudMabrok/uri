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
public class SimpleCalculate {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
         x = scanner.nextInt();
        double z = scanner.nextDouble();
        int y = scanner.nextInt();
         y = scanner.nextInt();
        double n = scanner.nextDouble();
    
        double sum = ( x * z)+( y*n);
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("VALOR A PAGAR: R$ " +bd  );
        
    }
    
}
