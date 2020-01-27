/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enquete;

/**
 *
 * @author elian.vancutsem
 */
public class DemoEnquete {
    public static void main(String[] args) {
        String vraag = "Waar gaat u het liefst heen op vakantie?";
        String[] deelnemers;
        int aantalDeelnemers = 20;
        deelnemers = new String[aantalDeelnemers];
        for (int i = 0 ; i < aantalDeelnemers ; i++){
            String result = "Deelnemer";
            deelnemers[i] = result + (i + 1);
        }
        String[] antwoord = {"Spanje", "Griekenland", "Frankrijk", "Thailand", "Miami"};
        
        Enquete enq = new Enquete(vraag , deelnemers , antwoord);
        
        
        
        System.out.println(enq.geefOverzichtVanDeResultaten());
    }
}
