package BarChart;
/**
 * Dit programma leest gegevens in van een demoprogramma en geeft het terug als een grafiek.
 * 
 * @version 07/01/2019
 * @author Elian Van Cutsem
 */
public class BarChart {
    //initialiseren
    /**
     * bevat de titel van de grafiek
     */
    public final String TITLE;
    /**
     * bevat het max aantal groepen
     */
    public final int NRGROUPS;
    /**
     * een array met alle categoriën
     */
    public String[] categories;
    /**
     * een 2dim array met data om een grafiek te maken
     */
    public int[][] data;
    /**
     * een array met alle groepen
     */
    public String[] groups;
    /**
     * een array met alle symbolen bijhorend bij de groepen
     */
    public char[] symbols;
    /**
     * Dit is de barchart voor 1 groep.
     * @param title de titel van van de grafiek.
     * @param categories de categoriën van de grafiek.
     * @param groupName de naam van de groep.
     * @param symbol het symbool bijpassend aan de groep.
     * @param data hoeveel een groep op een bepaalde categorie stemt.
     */
    public BarChart(String title, String[] categories, String groupName, char symbol, int[] data) {
        this.TITLE = title; //de titel van deze chart declareren
        this.NRGROUPS = 1; //maar 1 groep dus dit is zoiso 1
        this.categories = categories; //declareren van categorie StringArray
        this.groups = new String[NRGROUPS]; //array lengte declareren: 1 
        this.groups[0] = groupName; //de groepnaam bepalen van de array ( we hebben maar 1 rij )
        this.symbols = new char[NRGROUPS]; //array lengte declareren: 1 
        this.symbols[0] = symbol; //het symbool bepalen van de array (we hebben maar 1 symbool)
        this.data = new int[NRGROUPS][categories.length]; //declareren van lengte van data
        this.data[0] = data; //data array invullen 1dim (we hebben maar 1 rij)
    }
    /**
     * dit is de barchart voor meerdere groepen.
     * @param title de titel van de grafiek
     * @param maximum het maximum aantal gegevens en groepen.
     * @param categoriën de categoriën van de grafiek.
     */
    public BarChart(String title, int maximum, String[] categoriën) {
        this.TITLE = title; //titel declareren
        this.NRGROUPS = maximum; //max aantal groepen declareren
        this.categories = categoriën; //aantal categoriën declareren
        this.data = new int[NRGROUPS][categoriën.length];
        this.groups = new String[NRGROUPS]; //lengte van de array groups bepalen
        this.symbols = new char[NRGROUPS];
    }
    /**
     * showData toont de bijkomende data van groepen en categoriën
     * @return geeft de data van alle groepen en categoriën
     */
    public String showData() { //deze weergeeft alle data van de chart
        String result;//lege string
        result = "Title : " + TITLE + "\nData : \n" ; // titel aanvullen
        result += "\t" ; //zet een tab
        for (int i = 0 ; i < NRGROUPS ; i++) { //lus die max groepen afgaat
            result += groups[i] + "\t" ; //groep aanvullen
        }
        result += '\n'; //een return
        for (int i = 0 ; i < categories.length ; i++) { //gaat de lengte van array af
            result += categories[i] + "\t" ; //print een tab
            for (int j = 0 ; j < NRGROUPS ; j++) { //lus die max groepen afgaat
                result += data[j][i] + "\t"; // schrijft data erbij
            }
            result += '\n';  //zet een return
        }
        return result; //geeft de opgevulde String terug
    }
    /**
     * showLegend geeft de legende van categoriën en hun symbolen
     * @return geeft de legende van categoriën en hun symbolen
     */
    public String showLegend() { //legende
        String result; //lege String
        result = "Legend: " ; //symbolen + groups
        for (int i = 0 ; i < NRGROUPS ; i++) { //loopt de groepen af
            result += symbols[i] + "(" + groups[i] + ") " ; //plaatst de naam en het symbool
        }
        return result += '\n' ; //geeft de String terug
    }
    /**
     * makeChart een methode om te bepalen welke grafiek moet gebruikt worden.
     * @param orientation geeft aan of de grafiek georienteerd is.
     * @param stacked geeft aan of de grafiek gestacked moet zijn.
     * @return verwijzen naar een methode om een chart te maken.
     */
    public String makeChart(char orientation, boolean stacked) { //maakt de structuur van de barchart
        String result; //lege string
        result = "Title : " + TITLE + '\n'; //print de titel
        System.out.println(result);// print de string
        if (orientation == 'H') { //kijkt welke barchart je nodig hebt
            if (!stacked) { //welke horizontale je nodig hebt
                return displayHorizontalFalse();//horizontale met stacking
            } else if (stacked) { //welke horizontale je nodig hebt
                return displayHorizontalTrue();//horizontale zonder stacking
            }
        } else if (orientation == 'V') { //welke horizontale je nodig hebt
            if (NRGROUPS == 1) { //als je één groep hebt:
                return displayVerticalOneGroup(); //verticale met 1 groep  
            }
            if (NRGROUPS > 1) { //als je meer dan 1 groep hebt:
                return displayVerticalMoreGroups();//verticale met meer groepen
            }
        }
        return result;//geeft de titel 
    }
    /**
     * highestNumber berekend het hoogste nummer in de data array.
     * @return geeft het hoogste nummer.
     */
    public int highestNumber() {//methode om te berekenen wat de hoogste waarde is in een int array
        int highNumber = 0; // hoogste nr is 0
        for (int j = 0; j < NRGROUPS; j++) { //gaat alle groepen af
            for (int i = 0; i < categories.length; i++) { //gaat de lengte van de categoriën af
                if (data[j][i] > highNumber) { //als deze waarde hoger is dan int highNumber:
                    highNumber = data[j][i]; //veranderd de waarde van int highNumber naar deze waarde
                }
            }
        }
        return highNumber; //geeft de waarde van het hoogste nr door.
    }
    /**
     * displayHorizontalTrue (geeft een chart horizontale zonder stacking)
     * @return de chart
     */
    public String displayHorizontalTrue() { //horizontale barchart zonder stacking
        String result = ""; //lege String
        for (int i = 0 ; i < categories.length ; i++) { //gaat de lengte van array af
            result = categories[i] + "\t"; //vult String met categorie en tab
            for (int l = 0 ; l < NRGROUPS ; l++) { //loopt de groepen af
                for (int j = 0 ; j < data[l][i] ; j++) { //for loop die data afgaat
                    result += symbols[l]; //result aanvullen met symbool
                }
            }
            result += '\n'; //result aanvulen met 2 returns
        }
        return result + '\n' + showLegend(); //result aanvullen met legende
    }
    /**
     * dispayHorizontalFalse (geeft een chart horizontale zonder stacking)
     * @return de chart
     */
    public String displayHorizontalFalse() { //horizontale barchart met stacking
        String result = ""; //lege String
        for (int i = 0; i < categories.length; i++) { //gaat lengte van de array af
            result += categories[i] + "\t"; //vult result aan met categorie en tab
            for (int l = 0; l < NRGROUPS; l++) {
                for (int j = 0; j < data[l][i]; j++) { //for loop die data afgaat
                    result += symbols[l]; //result aanvullen met symbool
                }
                result += "\n\t";//print een return en tab
            }
            result += '\n'; //vult result aan met return
        }
        return result + showLegend(); //result aanvullen met de legende
    }
    /**
     * displayVerticalOneGroup maakt een verticale grafiek voor één groep.
     * @return de chart
     */
    public String displayVerticalOneGroup() { //verticale barchart
        String result = ""; //lege String

        for (int i = highestNumber(); i > -1; i--) {
            for (int k = 0; k < NRGROUPS; k++) { //doorloop
                for (int j = 0; j < categories.length; j++) { //doorloopt elke categorie            
                    if (data[0][j] > i) { //als data groter is dan i
                        result += symbols[0] + "\t\t"; //zet 2tabs
                    }
                    else { //als data niet hoger is:
                        result += "\t\t"; //als het resultaat niet hoger is, zet dan tab
                    }
                }
                result += "\t\t"; //geeft 2 tabs tussen grafiek
            }
            result += '\n'; //maakt een nieuwe lijn
        }
        for (String categorie : categories) { //loopt grafiek af
            result += categorie + "\t\t"; //zet 2tabs
        }
        return result + "\n\n" + showLegend(); //zet 2 returns en toont de legende
    }
    /**
     * displayVerticalMoreGroups maakt een verticale grafiek voor meerdere groepen.
     * @return de chart
     */
    public String displayVerticalMoreGroups() { //verticale barchart
        String result = ""; //lege String
        int count; //counter initialiseren
        for (int i = highestNumber() ; i > -1 ; i--) { //loopt af van hoogste nummer tot out of bounds
            for (int k = 0 ; k < NRGROUPS ; k++) { //oopt de max groepen af
                count = 0 ; //zet de counter op 0
                for (int j = 0 ; j < categories.length ; j++) {//doorloopt elke groep            
                    if (data[j][k] > i) { //als data groter is dan i:
                        result += symbols[count] + " "; //plaatst het symbool
                    } else { //als data kleiner is dan i:
                        result += "  "; // 2 lege spaties om een symbool te counteren
                    }
                    count++;//de counter +1 om een symbool te veranderen
                }
                result += "\t\t";//2 tabs tussen de grafieken
            }
            result += '\n'; //zet een return
        }
        for (String categorie : categories) { //loopt de categorien af
            result += categorie + "\t\t"; //plaatst 2 tabs tussen de categoriën
        }
        return result + "\n\n" + showLegend(); //zet 2 returns en toont de legende.
    }
    /**
     * putGroupData geeft data van meerdere groepen
     * @param groupName de naam van verschillende groepen
     * @param symbol het symbool om groepen en categoriën weer te geven.
     * @param data houd de cijfers van alle groupen en categoriën in
     * @return datasheet met een matrix van gegevens
     */
    public boolean putGroupData(String groupName, char symbol, int[] data) {
        boolean result = false; //nieuwe boolean
        for (int i = 0; i < categories.length; i++) { //gaat de categorien af
            if (groupName.equals(this.groups[i]) || symbol == this.symbols[i]) {// als er al dezelfde naam of symbool inzit:
                return result; //geeft deze false terug.
            }
        }
        for (int i = 0; i < categories.length; i++) { //gaat de categoriën af
            for (int j = 0; j < NRGROUPS; j++) { //gaat de groepen af
                if (this.data[j][i] == 0) { //als plaatsje in data geen waarde heeft
                    result = true; //geeft true aan boolean
                    if (result) { //als result true is:
                        this.data[j][i] = data[i]; //veranderd data in huidige waarde
                        this.groups[j] = groupName; //veranderd group in groepnaam
                        this.symbols[j] = symbol; //veranderd symbols in het symbool bij de groepsnaam
                    }
                    break; //stopt if
                }
            }
        }
        return result; //geeft de boolean terug
    }
}
