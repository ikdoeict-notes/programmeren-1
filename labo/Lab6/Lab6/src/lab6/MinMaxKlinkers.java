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
public class MinMaxKlinkers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 2;
        int klinkers = 0;
        String meesteKlinkers = "";
        String minsteKlinkers = "";
        int grootstewoord = 0;
        int kleinstewoord =100;
        String woord;

        for ( int i = 1 ; i <= N; i++){
            System.out.println("geef een woord in:");
            woord = sc.next();
            for ( int i2 = 0 ; i2 < woord.length(); i2++)
                switch (woord.charAt(i2)) {
                    case 'a':
                        klinkers++;
                        break;
                    case 'e':
                        klinkers++;
                        break;
                    case 'i':
                        klinkers++;
                        break;
                    case 'o':
                        klinkers++;
                        break;
                    case 'u':
                        klinkers++;
                        break;
                    case 'y':
                        klinkers++;
                        break;
                    default:
                        break;
                }
            if (klinkers >= grootstewoord ){
                meesteKlinkers = woord;
                grootstewoord = woord.length();
            }
            else if (klinkers < kleinstewoord)
                minsteKlinkers = woord;
                kleinstewoord = woord.length();
        }
        System.out.println(meesteKlinkers);
        System.out.println(minsteKlinkers);
        System.out.println(klinkers);
    }

}
