/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 * @version 1.0
 * @author elian.vancutsem
 */
public class KwadraatEnGemiddelde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totaal = 0;

        for (int i = 1 ; i <= 7 ; i++){
            int getal = sc.nextInt();
            totaal += getal;
            System.out.println(Math.sqrt(getal));
        }
        System.out.println("het totaal is : " + totaal);
        System.out.println("Het gemiddelde is : " + totaal/7);
    }
}
