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
 * @version
 */
public class Deling {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef twee getallen in");
        System.out.println("Eerste getal:");
        double NummerEen = sc.nextDouble();
        System.out.println("Tweede getal:");
        double NummerTwee = sc.nextDouble();
        double Deling = NummerEen / NummerTwee;
        System.out.println("De deling is : " + Deling);
        System.out.println("geef nog een getal");
        double nummerDrie = sc.nextDouble();
        double laatsteResultaat = Deling / nummerDrie;
        System.out.println("De deling is : " + laatsteResultaat);
    }
}
