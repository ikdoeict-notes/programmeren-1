/*
* Dit is een spelletje waarbij je een random woord moet raden.
*/

package lab11;

import java.util.Scanner;

/**
 * @version 1.0
 * @author Elian Van Cutsem
 */

public class WoordspelDemo {
    public static void main(String[] args) {
        Woordspel woordspel = new Woordspel();
        Scanner sc = new Scanner(System.in);
        System.out.println("het gekozen woord is : " + woordspel.huidigwoord);
        /*
        do {
            System.out.println("Geef je letter of het volledige woord.");
            woordspel.letter = sc.next();
            woordspel.beurt++;
        } while (woordspel.isGeraden() == false);

        System.out.println(woordspel.Proficiat()); */
    }

}
