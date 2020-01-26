/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwedstrijd;

/**
 *
 * @author elian.vancutsem
 */
public class LoopWedstrijd {
    String naam = "OdiseeRun";
    String[] atleten = {"Peter" , "Kristien" , "Thomas" , "Katja" , "Evert-jan"};
    double[] tijden = {12.5 , 14.8 , 13.2 , 14.5 , 12.2};
    double winnendeTijd = 15;
    String winnendeAtleet = "";
    int i = 0;
    
    //tijdsnood
    /* public void nietDefault(String n, String atl, double tijden[]){
        this.naam = n;
        this.atleten[] = atl
        this.tijden[] = tijden;
    } */
    
    public String geefWinnaar(){
        while ( i < 5 ){
            if(tijden[i] < winnendeTijd){
                winnendeTijd = tijden[i];
                winnendeAtleet = atleten[i];
            }
            i++;
        }
        return "En het goud gaat naar .... : " + winnendeAtleet + ", met " + winnendeTijd + " s";
    }
    
    public void voegExtraPrestatieToe(String atleet, double tijd){
        if (tijd < winnendeTijd){
            winnendeTijd = tijd;
            winnendeAtleet = atleet;
        }
    }
    
}
