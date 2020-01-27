package lab8;

import java.util.Scanner;

/**
 * @version 1.0
 * @author Elian Van Cutsem
 */

public class PlusMinSom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een getal in :");
        int getal = sc.nextInt();
        System.out.println("");
        int som = 0;
        for (int i = 1 ; i <= getal ; i++){
            if (i%2 == 0){
                som -= i;
            }
            if (i%2 == 1){
                som += i;
            }
        }
        System.out.println(som);

    }
}
