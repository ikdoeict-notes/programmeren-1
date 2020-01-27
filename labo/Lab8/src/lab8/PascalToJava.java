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
public class PascalToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef je tekst in : ");
        String tekst = sc.nextLine();
        String tekstEdit = tekst.replaceAll("Pascal", "Java");
        System.out.println(tekstEdit);
    }
}
