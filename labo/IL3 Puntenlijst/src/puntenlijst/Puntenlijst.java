/*
 * Individuele oefening
 */
package puntenlijst;

import java.util.Scanner;
        
/**
 * @version 07/12/2018
 * @author Elian Van Cutsem
 */
public class Puntenlijst {

    public static void main(String[] args) {
        System.out.println("Hoeveel studenten zitten in de klas?");
        Scanner sc = new Scanner(System.in);
        int aantalStudenten = sc.nextInt();
        System.out.println("");
        System.out.println("Geef de puntenlijst:");
        String studentGegevens = "";
        String studentGegevens2 = "";
        String naam = "";
        String voornaam = "";
        String cijfer = "";
        char eersteKomma = ';';
        char tweedeKomma = ';';
        
        for (int i = 0 ; i < aantalStudenten+1 ; i++){
            studentGegevens = sc.nextLine();
            
        }
            eersteKomma = (char) studentGegevens.indexOf(";");
            naam = studentGegevens.substring(0,eersteKomma);
       
            studentGegevens2 = studentGegevens.substring(eersteKomma+1);
            tweedeKomma = (char) studentGegevens2.indexOf(";");
            voornaam = studentGegevens.substring(0 , tweedeKomma);
        
            cijfer = studentGegevens2.substring(tweedeKomma+1);
            System.out.println("");
            System.out.println("voornaam: " + voornaam);
            System.out.println("naam: " + naam);
            System.out.println("cijfer: " + cijfer);
            
    }
    
}
