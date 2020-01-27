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
public class CelsiusNaarFahrenheit {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef de temperatuur in Celsius in :");
        float gradenInCelcius = sc.nextFloat();
        float gradenInFahrenheit = (float) (((9.0/5.0)*gradenInCelcius) + 32);
        System.out.println(gradenInFahrenheit);
    }
}
