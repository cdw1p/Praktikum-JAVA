package contohvector1;
import java.util.Vector;

/**
 *
 * @author 1337
 */
public class ContohVector1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        for (int i=0; i<=100; i++) {
            System.out.println("Size : " + v.size());
            System.out.println("Capacity : " + v.capacity());
            v.add("Hello");
        }
        
        Vector w = new Vector();
        for (int i=0; i<=100; i++) {
            System.out.println("Size : " + w.size());
            System.out.println("Capacity : " + w.capacity());
            w.add("Hello");
        }
    }
}
