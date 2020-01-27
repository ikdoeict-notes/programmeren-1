
package lab2;
import java.util.Scanner;
/**
 *
 * @author elian.vancutsem
 */
public class Echo {
    //public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een zin in:");
        String zin = sc.nextLine();
        System.out.println("je zin was:" + '\n' + zin);
    }
}
