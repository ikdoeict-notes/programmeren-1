/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class HHMMSS {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een aantal seconden in:");
        int seconden = sc.nextInt();
        int sec = seconden % 60;
        int uur = seconden / 60;
        int min = uur % 60;
        uur = uur / 60;

        String uurString = (uur < 10 ? "0" : "" ) + uur;
        String minutenString = (min < 10 ? "0" : "" ) + min;
        String secondenString = (sec < 10 ? "0" : "" ) + sec;
        System.out.println( uurString + " : " + minutenString + " : " + secondenString );

    }
}
