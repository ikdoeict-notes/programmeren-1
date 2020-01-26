package lab8;
import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een woord in");
        String woord = sc.next();
        String palindroom = "";
        int i = woord.length();
        int a = i-1;

        do {
            a = i - 1;

            palindroom += woord.substring(a,i);
            i--;
        } while ( a != 1 && i < woord.length());

        String palindroomCheck = palindroom + woord.substring(0,1);
        palindroom += woord.substring(woord.length()-1,woord.length());
         if (palindroom.equals(palindroomCheck)){
             System.out.println("Dit is een palindroom");
         }
         else {
             System.out.println("Dit is geen palindroom");
         }
    }

}
