/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
class kapitaal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is je kapitaal?");
        double kapitaal = sc.nextDouble();
        System.out.println("Wat is de rentevoet?");
        double rentevoet = sc.nextDouble();
        double Doel = kapitaal*2;
        int jaar = 1;
        do {
            double berekendKapitaal = kapitaal + ((kapitaal / 100) * rentevoet);

            System.out.println("na " + jaar + " jaar is je kapitaal : " + berekendKapitaal);
            jaar += 1;
            kapitaal = berekendKapitaal;
        } while (kapitaal < Doel);
        System.out.println("na " + jaar + " jaar is je kapitaal verdubbeld!");
    }
}
