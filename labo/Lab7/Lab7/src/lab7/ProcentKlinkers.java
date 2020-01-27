/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class ProcentKlinkers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String woord = sc.next();
        int klinkers = 0;
        for ( int i = 0 ; i < woord.length() ; i++ ) {
            switch (woord.charAt(i)) {
                case 'a':
                    klinkers++;
                    break;
                case 'A':
                    klinkers++;
                    break;
                case 'e':
                    klinkers++;
                    break;
                case 'E':
                    klinkers++;
                    break;
                case 'i':
                    klinkers++;
                    break;
                case 'I':
                    klinkers++;
                    break;
                case 'o':
                    klinkers++;
                    break;
                case 'O':
                    klinkers++;
                    break;
                case 'u':
                    klinkers++;
                    break;
                case 'U':
                    klinkers++;
                    break;
                case 'y':
                    klinkers++;
                    break;
                case 'Y':
                    klinkers++;
                    break;
                default:
                    break;
            }
        }
        double percentage = (woord.length()-klinkers)*klinkers;
        System.out.println(klinkers);
    }
}
