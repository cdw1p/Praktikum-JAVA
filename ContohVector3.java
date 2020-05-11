package contohvector3;
import java.util.Vector;

/**
 *
 * @author 1337
 */
public class ContohVector3 {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(new Integer(20));
        v.add(new Long(1000000L));
        v.add(new Float(123.44f));
        v.add(new Double(123.333333132321));
        System.out.println(v);

        v.add(2, new String("Ini Array Ke 2"));
        System.out.println(v);

        v.add(3, new String("Ini Array Ke 3"));
        System.out.println(v);
    }
}
