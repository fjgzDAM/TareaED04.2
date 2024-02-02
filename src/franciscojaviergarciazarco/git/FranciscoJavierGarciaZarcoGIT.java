
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
        
        double x,y,z;
        
        System.out.print("Introduce el primer número para la suma: ");
        x = sc.nextInt();
        
        System.out.print("Introduce el segundo número para la suma: ");
        y = sc.nextInt();
        
        z = x/y;
        
        System.out.println("El resultado es " + z);
        sc.close();
        
    }
    
}
