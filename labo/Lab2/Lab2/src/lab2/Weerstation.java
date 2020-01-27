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
 * @version 1.0
 */
public class Weerstation {
    //public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef de gemiddelde temperatuur");
        int gemTemp = sc.nextInt();
        System.out.println("Geef de hoogst gemeten waarde");
        int HoogsteWaarde = sc.nextInt();
        System.out.println("Geef de laagst gemeten waarde");
        int LaagsteWaarde = sc.nextInt();
        System.out.println("Geef het percentage zonneschijn");
        int Zonneschijn = sc.nextInt();
        System.out.println("De neerlag bedroeg: ");
        double neerslag = sc.nextDouble();
        System.out.println("De windrichting bedroeg: ");
        char windRichting = sc.next().charAt(0);
        System.out.println("De gemiddelde temperatuur bedroeg: " + gemTemp +" °C, ");
        System.out.println("De hoogst gemeten waarde was: " + HoogsteWaarde + " °C, ");
        System.out.println("De laagst gemeten waarde was: " + LaagsteWaarde + " °C, ");
        System.out.println("Het percentage zonneschijn was: " + Zonneschijn + '%');
        System.out.println("De neerslag bedroeg: " + neerslag + "mm");
        System.out.println("De windrichting was: " + windRichting);
    }
}
