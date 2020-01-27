/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Elian Van Cutsem
 * @version September 2018
 */
public class Ster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ster = "*";
        String spatie = "                               ";
        String spaties = "";

        System.out.println("Geef de hoogte van de boom in:");
        int hoogte = sc.nextInt();

        for (int i = 0; i < hoogte; i++){

            for (int i2 = spatie.length() ; i2 >= 0; i2 -= 2){
                spaties =spatie.substring(0 , i2);
            }

            System.out.println(spaties + ster);
            ster += "**";
        }
    }
}
