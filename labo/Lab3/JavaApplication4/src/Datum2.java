
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elian.vancutsem
 */
public class Datum2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef je datum ( dd-mm-jjjj )");
        String Tijd = sc.nextLine();
        sc = new Scanner(Tijd).useDelimiter("-");
        int dag = sc.nextInt();
        int maand = sc.nextInt();
        int jaar = sc.nextInt();

        String dagString = (dag < 10 ? "0" : "") + dag;
        String maandString = (maand < 10 ? "0" : "") + maand;
        String jaarString = (jaar < 10 ? "0" : "") + jaar;

        System.out.println("De opgegeven datum was:" + dagString + '-' + maandString + '-' + jaarString);
    }
}
