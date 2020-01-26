/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class PositiefVerschil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoeveel getallen ga je ingeven?");
        int ingegevenGetallen = sc.nextInt();
        int i = 0;
        int grootsteGetal = 0;
        int kleinsteGetal = 100;

        do {
          System.out.println("Geef een getal in:");
          int getal = sc.nextInt();
          if (getal > grootsteGetal){
              grootsteGetal = getal;
          }
          if (getal < kleinsteGetal){
              kleinsteGetal = getal;
          }
          i++;
        } while (i < ingegevenGetallen);
        int result = grootsteGetal - kleinsteGetal;
        System.out.println("Grootste getal : " + grootsteGetal);
        System.out.println("kleinste getal : " + kleinsteGetal);
        System.out.println("het verschil is : " + result);
    }
}
