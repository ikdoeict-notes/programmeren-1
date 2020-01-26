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
 */
public class Permutatie {
    //public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = a;
        double e = b;
        double f = c;
        System.out.println("Variabele a is: " + a);
        System.out.println("Variabele b is: " + b);
        System.out.println("Variabele c is: " + c);
        System.out.println("Na permutatie:");

        System.out.println("Variabele a is: " + f);
        System.out.println("Variabele b is: " + d);
        System.out.println("Variabele c is: " + e);
    }
}
