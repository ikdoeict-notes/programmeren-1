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
 * @version 1.0
 */
public class Casts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double MijnDouble = sc.nextDouble();
        int MijnInt = (int) MijnDouble;
        System.out.println((int) MijnDouble);
        System.out.println((float) MijnDouble);
        System.out.println((long) MijnDouble);
        System.out.println((short) MijnDouble);
        System.out.println((char) MijnDouble);
        System.out.println((byte) MijnDouble);
    }

}
