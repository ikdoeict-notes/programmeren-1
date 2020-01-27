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
public class RekeningNummer {
    //public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef je rekeningnummer met IBAN code:");
        String IBAN = sc.nextLine();
        sc = new Scanner(IBAN).useDelimiter(" ");
        String EersteIban = sc.next();
        String nummers = sc.next();
        nummers += " " + sc.next();
        nummers += " " + sc.next();
        System.out.println("De IBAN code is:" + EersteIban);
        System.out.println("Het rekeningnummer: " + nummers);
    }
}
