/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Scanner;

/**
 *
 * @author elian.vancutsem
 */
public class testProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rechthoek rechthoek = new Rechthoek();

        System.out.println("geef een lengte in :");
        rechthoek.lengte = sc.nextInt();

        System.out.println("geef een breedte in :");
        rechthoek.breedte = sc.nextInt();

        System.out.println("geef een x in :");
        rechthoek.xcoordinaat = sc.nextInt();

        System.out.println("geef een y in :");
        rechthoek.ycoordinaat = sc.nextInt();

        System.out.println("");
        System.out.println("Hier zijn wat eigenschappen van de rechthoek :");

        if (rechthoek.isVierkant()){
        System.out.println("Het is een vierkant.");
        }
        else{
            System.out.println("Het is geen vierkant.");
        }
        System.out.println("de omtrek is " + rechthoek.berekenOmtrek() + "cm");
        System.out.println("de oppervlakte is " + rechthoek.berekenOpp() + "cm");

        System.out.println("geef nu een coordinaat in:");
        System.out.println("");

        int puntxcoordinaat;
        int puntycoordinaat;
        do {
            System.out.println("geef een x in :");
            puntxcoordinaat = sc.nextInt();
            System.out.println("geef een y in :");
            puntycoordinaat = sc.nextInt();

            if (rechthoek.isIn(puntxcoordinaat,puntycoordinaat)){
                if(rechthoek.isVierkant()){
                    System.out.println("je punt ligt in het vierkant.");
                }
                else{
                 System.out.println("je punt ligt in de rechthoek.");
                }
            }
            else {
                if(rechthoek.isVierkant()){
                    System.out.println("je punt ligt niet in het vierkant.");
                }
                else{
                 System.out.println("je punt ligt niet in de rechthoek.");
                };
                System.out.println("probeer opnieuw");
                System.out.println("");
            }

        } while (!rechthoek.isIn(puntxcoordinaat, puntycoordinaat));

    }
}
