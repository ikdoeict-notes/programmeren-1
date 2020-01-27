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
public class KleinsteKwadraat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een waarde in:");
        int waarde = sc.nextInt();
        int uitkomst = 0;
        int cijfer = 1;
        do {
            uitkomst = cijfer*cijfer;
            System.out.println(uitkomst);
            cijfer += 1;
        } while (uitkomst < waarde);
    }
}
