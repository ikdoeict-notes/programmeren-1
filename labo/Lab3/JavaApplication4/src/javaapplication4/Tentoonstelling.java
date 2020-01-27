/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author elian.vancutsem
 */
public class Tentoonstelling {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoeveel personen?");
        int aantalPersonen = sc.nextInt();
        int gratisToegang = aantalPersonen/10;
        double bedrag = ( aantalPersonen * 10 ) - ( gratisToegang * 10 );
        System.out.println("Er zijn " + gratisToegang + " mensen met gratis toegang.");
        System.out.println("Er moet in totaal " + bedrag + "€ worden betaald");
        double elkePersoonBetaald = bedrag/aantalPersonen;
        System.out.println("elke persoon betaald " + (Math.round(elkePersoonBetaald * 100.00)/100.00) + " €");
    }
}
