/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.PrintStream;

/**
 *
 * @author elian.vancutsem
 */
public class Model {
    public static void main(String args []){
        System.out.println("------------------------------------------");
        System.out.println("waarderingen                    uitspraken");
        System.out.println("------------------------------------------");
        System.out.println("m      a      j            1      2      3");
        boolean marie = true;
        boolean anne = true;
        boolean jan = true;
        boolean een = !(marie || anne) || jan;
        boolean twee = marie || anne;
        boolean drie = !(anne && jan);
        System.out.println(marie + "   " + anne + "   " + jan + "         " + een + "   " + twee + "  " + drie);

        marie = true;
        anne = true;
        jan = false;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "   " + anne + "   " + jan + "        " + een + "  " + twee + "  " + drie);

        marie = true;
        anne = false;
        jan = true;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "   " + anne + "  " + jan + "         " + een + "   " + twee + "  " + drie);

        marie = true;
        anne = false;
        jan = false;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "   " + anne + "  " + jan + "        " + een + "  " + twee + "  " + drie);

        marie = false;
        anne = true;
        jan = true;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "  " + anne + "   " + jan + "         " + een + "   " + twee + "  " + drie);

        marie = false;
        anne = true;
        jan = false;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "  " + anne + "   " + jan + "        " + een + "  " + twee + "  " + drie);

        marie = false;
        anne = false;
        jan = true;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "  " + anne + "  " + jan + "         " + een + "   " + twee + " " + drie);

        marie = false;
        anne = false;
        jan = false;
        een = !(marie || anne) || jan;
        twee = marie || anne;
        drie = !(anne && jan);
        System.out.println(marie + "  " + anne + "  " + jan + "        " + een + "   " + twee + " " + drie);
    }
}
