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
public class Cirkel {
    public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      System.out.println("Geef de straal :");
      double straal = sc.nextDouble();
      double pi = Math.PI;
      double omtrek = 2 * straal * pi;
      double oppervlakte = (straal*straal) * Math.PI;
      System.out.println("De omtrek is : " + Math.round(omtrek * 100.00)/1000.00);
      System.out.println("De opppervlakte is : " + Math.round(oppervlakte * 100.00)/1000.00);
    }
}
