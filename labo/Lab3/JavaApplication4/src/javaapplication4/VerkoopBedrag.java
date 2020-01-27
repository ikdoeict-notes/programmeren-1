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
public class VerkoopBedrag {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef het origineel bedrag in :");
        float bedrag = sc.nextFloat();
        System.out.println("Geef het winstmarge in :");
        int winstMarge = sc.nextInt();
        System.out.println("Dit is het uiteindelijk bedrag :");
        float winstBedrag = (bedrag/100)*winstMarge;
        float uitkomst = winstBedrag + bedrag;
        System.out.println(uitkomst);
    }
}
