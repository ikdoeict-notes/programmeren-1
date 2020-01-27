package lab.pkg4;
import java.util.Random;
/**
 *
 * @author elian.vancutsem
 */
public class WillekeurigGetal {
    public static void main (String args []) {
        int willekeurigGetal = (int) (Math.random() * (100 - 50));
        System.out.println("Dit is je getal : " + willekeurigGetal);
    }

}
