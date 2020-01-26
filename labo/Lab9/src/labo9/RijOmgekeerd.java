package labo9;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class RijOmgekeerd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef 10 getallen in:");
        int[] getalRij;
        getalRij = new int[10];
        for (int i = 0 ; i < 10 ; i++){
        getalRij[i] = sc.nextInt();
        }
        for (int j = 9 ; j > -1 ; j--){
            System.out.println(getalRij[j]);
        }
    }

}
