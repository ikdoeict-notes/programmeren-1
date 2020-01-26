/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class ZoekGetal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hoeveel getallen ga je ingeven?");
        int a = sc.nextInt();
        int[] getalRij;
        getalRij = new int[a];
        System.out.println("Geef een reeks getallen");
        for (int i = 0 ; i < a ; i++){
            getalRij[i] = sc.nextInt();
        }
        System.out.println("welk getal zoek je?");
        int gezochtGetal = sc.nextInt();
        int gevondenGetal = 0;
        for (int j = 0 ; j < a ; j++){
            if (getalRij[j] == gezochtGetal){
                gevondenGetal++;
            }
            else{

            }
        }
        if (gevondenGetal != 0){
            System.out.println("je getal is " + gevondenGetal + " keer gevonden.");
        }
        else{
            System.out.println("Getal is niet gevonden.");
        }
    }
}
