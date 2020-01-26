/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class LengteNWoorden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("geef het aantal woorden in:");
        int N = sc.nextInt();
        int totaal = '0';
        String woord;

        for ( int i = 1 ; i <= N; i++){
            System.out.println("geef een woord in:");
            woord = sc.next();
            totaal += woord.length();
        }
        System.out.println(totaal-48 + " karakters");
    }

}
