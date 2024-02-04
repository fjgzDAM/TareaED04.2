
package franciscojaviergarciazarco.git;

import java.util.Scanner;


/**
 *
 * @author fjgza
 */
public class FranciscoJavierGarciaZarcoGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner sc = new Scanner(System.in);
        
        int factor1,factor2,producto;
        
        System.out.println("Introduce el primer factor para la multiplicación: ");
        factor1 = sc.nextInt();
        
        System.out.println("Introduce el segundo factor para la multiplicación: ");
        factor2 = sc.nextInt();
        
        producto = factor1*factor2;
        
        System.out.println("El producto es " + producto);
        sc.close();
        
    }
    
}
