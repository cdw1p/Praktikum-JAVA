package contohvector2;
import java.util.Vector;
import java.util.ListIterator;

/**
 *
 * @author 1337
 */
public class ContohVector2 {
    public static void main(String[] args) {
        Vector theVector = new Vector();
        for (int i=0; i<=10; i++) {
            theVector.add(new Integer(i));
        }

        System.out.println("Isi Vector : " + theVector.toString());
        System.out.println("Ukuran : " + theVector.size());
        System.out.println("Masing-masing element vector : ");
        ListIterator iter = theVector.listIterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
