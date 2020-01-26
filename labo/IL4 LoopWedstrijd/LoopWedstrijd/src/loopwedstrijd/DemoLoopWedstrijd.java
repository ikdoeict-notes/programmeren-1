/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwedstrijd;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class DemoLoopWedstrijd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoopWedstrijd loopwedstrijd = new LoopWedstrijd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Gegevens van loopwedstrijd : " + loopwedstrijd.naam);
        
        System.out.println("Deelnemers:");
        
        //ook een mogelijke methode:
        /*for (String atleten : loopwedstrijd.atleten) {
            System.out.println(atleten);
        }*/
        
        System.out.println(loopwedstrijd.atleten[0] + "  " + loopwedstrijd.atleten[1]
        + "  " + loopwedstrijd.atleten[2] + "  " + loopwedstrijd.atleten[3]
        + "  " + loopwedstrijd.atleten[4]);
        
        System.out.println("tijden:");
        //ook een mogelijke methode:
        /* for (int i = 0 ; i < loopwedstrijd.atleten.length ; i++){
            System.out.println(loopwedstrijd.tijden[i]);
        } */
        System.out.println(loopwedstrijd.tijden[0] + "  " + loopwedstrijd.tijden[1]
        + "  " + loopwedstrijd.tijden[2] + "  " + loopwedstrijd.tijden[3]
        + "  " + loopwedstrijd.tijden[4]);
        System.out.println();
        System.out.println(loopwedstrijd.geefWinnaar());
        System.out.println();
        System.out.println("Welke atleet wil je toevoegen?");
        String atleet = sc.next();
        System.out.println("Welke tijd heeft hij/zij gelopen?");
        double tijd = sc.nextDouble();
        loopwedstrijd.voegExtraPrestatieToe(atleet, tijd);
        System.out.println(loopwedstrijd.geefWinnaar());
    }
    
}
