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
public class CilinderVolume {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef de straal in :");
        double straal = sc.nextDouble();
        System.out.println("Geef de hoogte in :");
        double hoogte = sc.nextDouble();
        double volume = Math.PI * (straal*straal) * hoogte;
        System.out.println("Dit is het volume :" + volume);
    }
}
