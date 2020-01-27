/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author elian.vancutsem
 * @version Oktober 2018
 */
public class NumeriekeWaarden {
    //public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef je karakter:");
        char Karakter = sc.next().charAt(0) ;
        int NummeriekeWaarde = (char)Karakter;
        System.out.println("dit is een karakter: " + Karakter);
        System.out.println("Karakter value: " + NummeriekeWaarde);
    }
}
