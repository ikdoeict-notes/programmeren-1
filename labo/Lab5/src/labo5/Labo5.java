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
public class Labo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een random woord in.");
        int woord = sc.next().charAt(0);
        char woordKarakter = (char) woord;

        if (woordKarakter < 97){
            String result = "Dit is een hoofdletter";
            System.out.println(result);
        }
        else if (woordKarakter >= 97){
            String result = "Dit is een kleineletter";
            System.out.println(result);
        }
        else {
            String result = "Dit is een cijfer";
            System.out.println(result);
        }

    }

}
