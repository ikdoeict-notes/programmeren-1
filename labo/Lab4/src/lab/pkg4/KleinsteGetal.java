/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;
import java.util.Scanner;
/**
 *
 * @author elian.vancutsem
 */
public class KleinsteGetal {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int GetalEen = sc.nextInt();
        int GetalTwee = sc.nextInt();
        int kleinsteGetal = Math.min(GetalEen, GetalTwee);
        System.out.println("Het kleinste getal van " + GetalEen + " en " + GetalTwee + " is : " + kleinsteGetal);
    }
}
