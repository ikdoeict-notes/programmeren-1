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
public class KortsteTekst {
    public static void main(String[] args) {
        String stop = "";
        String test = "stop";
        Scanner sc = new Scanner(System.in);
        String kortsteWoord = "";
        int korsteWoordLengte = 100;
        do {
            stop = sc.next();
            if (stop.length() < korsteWoordLengte){
                korsteWoordLengte = stop.length();
                kortsteWoord = stop;
            }
        } while (!stop.equals(test.toLowerCase()));
        System.out.println("Dit is het kortste woord : " + kortsteWoord);
    }
}
