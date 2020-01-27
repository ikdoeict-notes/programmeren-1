package lab10;

/**
 *
 * @author elian.vancutsem
 */

public class Rechthoek{
    int xcoordinaat;
    int ycoordinaat;
    int lengte;
    int breedte;

    public boolean isVierkant(){
        return (lengte == breedte);
    }

    public int berekenOmtrek(){
        return ((lengte*2) + (breedte*2));
    }

    public int berekenOpp(){
        return (lengte * breedte);
    }

    public boolean isIn(int puntxcoordinaat, int puntycoordinaat){
        if (puntxcoordinaat <= xcoordinaat+breedte && puntxcoordinaat >= xcoordinaat){
            if (puntycoordinaat <= ycoordinaat+lengte && puntycoordinaat >= ycoordinaat){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
