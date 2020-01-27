/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author elian.vancutsem
 */
public class Lab8 {
    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        int i = 0;
        int j = i;
        do {
            s = s + i;
            System.out.println("S is " + s);
            i++;
            do {
                t = t * (i- j + 1);
                i--;
            } while (j > 0);
            System.out.println("T is " + t);
        } while (i <= 5);
        s = s * t;
        System.out.println("S is " + s);
    }

}
