/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een woord in");
        String woord = sc.next();

        if (woord.length() %2 == 0) {
            String woordHoofdletter = woord.toUpperCase();
            System.out.println(woordHoofdletter);
        }
        else {
            String woordKleineLetter = woord.toLowerCase();
            System.out.println(woordKleineLetter);
        }
    }
}
