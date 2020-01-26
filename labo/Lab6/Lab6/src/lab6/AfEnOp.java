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
public class AfEnOp {
    public static void main(String[] args) {
        System.out.println("Welk woord wil je af- en opbouwen?");
        Scanner sc = new Scanner(System.in);
        String woord = sc.next();
        for (int i = 0 ; i < woord.length() ; i++){
            System.out.println(woord.substring(i));
        }
        for (int i = 0 ; i < woord.length() ; i++){
            System.out.println(woord.substring(0,i));
        }
        System.out.println(woord);
    }
}
