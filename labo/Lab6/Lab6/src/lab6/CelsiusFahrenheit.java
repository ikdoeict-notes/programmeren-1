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
public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int farenheit;

        for (int i = -20; i <= 50; i += 5) {
            farenheit = (i * 9/5) + 32;
            System.out.println("Value of x: " + i +"°C en " + farenheit + "° Farenheit");
        }
    }

}
