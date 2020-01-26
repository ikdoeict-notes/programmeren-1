package lab11;

public class Woordspel{
    final int MAXAANTALBEURTEN = 10;
    String[] woordenLijst = { "koekoek" , "koekjes" , "xbox" , "koek" , "pan" ,
        "spelletjes", "achterlijk" , "test" , "opa" , "oma"};
    String huidigwoord = woordenLijst[(int)(Math.random() * 9) + 0];
    boolean[] geradencheck;
    String letter;
    int beurt = 0;

    public boolean isGeraden(){
        boolean geraden = false;
        int testGetal = 0 ;
        for (int i = 0 ; i < huidigwoord.length() ; i++){
            testGetal++;
        }
        return testGetal == huidigwoord.length();

    }

    public String gok(char letter){
        for ( int i = 0 ; i < huidigwoord.length() ; i++) {
            if (huidigwoord.charAt(i) == letter){
                geradencheck[i] = true;
            }
            else geradencheck[i] = false;
        }
        return mmoi,
    }


    public String Proficiat(){
        if (beurt == 1){
            return "Proficiat, je vond het woord in " + beurt + " beurt";
        }
        else {
            return "Proficiat, je vond het woord in " + beurt + " beurten";
        }
    }
}
