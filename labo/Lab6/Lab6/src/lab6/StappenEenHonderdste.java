/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author elian.vancutsem
 */
public class StappenEenHonderdste {
    public static void main(String[] args) {
        double getal;
        for (double x = -6.01; x <= 9.01; x += 0.010){
            getal = Math.round(x*100);
            System.out.println("Value of x: " + getal/100);
        }
    }
}
