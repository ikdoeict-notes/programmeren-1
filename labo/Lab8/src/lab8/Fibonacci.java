package lab8;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getaln = 0;
        String fibonacci = "F";
        do {
            System.out.println("geef een getal in tussen 1 en 20");
            getaln = sc.nextInt();

        } while (getaln > 20 | getaln < 1);
        System.out.println("");
        int result = 1;
        int oudresulteen = 1;
        int oudresulttwee = 1;
        for (int i = 1 ; i <= getaln ; i++){
            fibonacci = "F";

            if (i == 1 | i == 2){
                result = 1;
                System.out.println(fibonacci += i + " = " + result);
            }
            else {
                oudresulteen = oudresulttwee;
                oudresulttwee = result;
                result = oudresulttwee + oudresulteen;
                System.out.println(fibonacci += i + " = " + result);
            };

        }
    }
}
