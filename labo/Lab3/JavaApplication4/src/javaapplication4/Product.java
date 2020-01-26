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
public class Product {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef twee getallen in");
        System.out.println("Eerste getal:");
        int NummerEen = sc.nextInt();
        System.out.println("Tweede getal:");
        int NummerTwee = sc.nextInt();
        System.out.println("Het product is :" + NummerEen * NummerTwee);
    }
}
