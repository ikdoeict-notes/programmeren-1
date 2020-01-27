/*
 * Dit programma geeft een enquete weer en laat een bepaald aantal deelnemers stemmen op
 * mogelijke antwoorden. Daarna word een chart weergeven met alle data en het populairste antwoord.
 */
package enquete;

/**
 * @version 17/01/2019
 * @author elian.vancutsem
 */
public class Enquete {
    final String VRAAG;
    String[] antwoorden;
    String[] deelnemers;
    int[] aantallen;    
    
    Enquete(String vraag , String[] deelnemers , String[] antwoorden){
        this.VRAAG = vraag;
        this.antwoorden = antwoorden;
        this.deelnemers = deelnemers;
        this.aantallen = new int[antwoorden.length];
    }
    
    /**
     * Deze methode kijkt of een deelnemer zijn stem geldig is.
     * @param deelnemers de naam van de deelnemer
     * @param antwoord het antwoord van de deelnemer
     * @return een boolean of de stem geldig is of niet.
     */
    
    public boolean vulEnqueteIn(String deelnemers, String antwoord){
       int antwoordInt = Integer.parseInt(antwoord);
       String[] gestemd;
       gestemd = new String[this.deelnemers.length];
        if (antwoordInt > this.antwoorden.length){
            return false;
        }
        return true;
    }
    
    public String geefPopulairsteAntwoord() {
        int grootsteNummer = 0;
        String result = "";
        for ( int i = 0 ; i < this.antwoorden.length ; i++){
            if (this.aantallen[i] > grootsteNummer) {
                grootsteNummer = this.aantallen[i];
                result = this.antwoorden[i];
            }
            else{
                
            }
        }
        return result;
    }
    
    public String geefOverzichtVanDeResultaten(){
        //geeft string met resultaten van enquete
        
        for (int i = 0 ; i < this.deelnemers.length ; i++ ){
            String antwoord = "";
            int stemmingDeelnemer = (int) (Math.random()*10 / 2);
            antwoord = "1";
            if (vulEnqueteIn(this.deelnemers[i],antwoord)) {
                this.aantallen[stemmingDeelnemer]++;
               }
        }
        String stijl = "Resultaten op de vraag: \n";
        String result = "Mensen gaan het liefst op vakantie naar ";
        System.out.println(stijl + VRAAG + '\n');
        for (int i = 0 ; i < antwoorden.length ; i++) {
            String chart;
            chart = antwoorden[i] + " : ";
            
            for (int j = 0 ; j < this.aantallen[i] ; j++) {
                chart += "X";
            }
            
            System.out.println( chart );
        }
        
        return  result + geefPopulairsteAntwoord();
    }
    
}
