/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class ProduktViaPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getalEen = sc.nextInt();
        int getalTwee = sc.nextInt();
        int totaal;

        for (int i = getalEen ; i <= getalTwee -1 ; i++){
              getalEen += getalEen;
        }
        System.out.println(getalEen);
    }
}
