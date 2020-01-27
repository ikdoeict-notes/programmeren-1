/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author elian.vancutsem
 */
public class Gemiddelde {
    //public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int Eerste = sc.nextInt();
        int Tweede = sc.nextInt();
        int Derde = sc.nextInt();
        int Vierde = sc.nextInt();
        System.out.println("De waarden van je variabele zijn: " + Eerste + ", " + Tweede + ", " + Derde + ", " + Vierde);

        int Som = Eerste+Tweede+Derde+Vierde;
        int GeheelGemiddelde = (Eerste+Tweede+Derde+Vierde)/4;
        int Rest = (Eerste+Tweede+Derde+Vierde)%4;
        double Gemiddelde = (double)Som/4;

        System.out.println("Het gehele gemiddelde is: " + GeheelGemiddelde);
        System.out.println("De gehele rest is: " + Rest);
        System.out.println("Het gemiddelde is: " + Gemiddelde);
    }
}
