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
public class Tijd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef je input ( uur : minuten : seconden )");
        String Tijd = sc.nextLine();
        sc = new Scanner(Tijd).useDelimiter(" : ");
        int uur = sc.nextInt();
        int minuten = sc.nextInt();
        int seconden = sc.nextInt();
        System.out.println("De input was:" + uur + ':' + minuten + ':' + seconden);
        }
}
