package menghapusvector;
import java.util.Vector;

/**
 *
 * @author 1337
 */
public class MenghapusVector {
    static boolean removeAll(Vector v, Object e) {
        Vector v1 = new Vector(); 
        v1.add(e);
        return v.removeAll(v1);
    }
    
    public static void main(String[] args) {
        Vector v = new Vector();

        int n = args.length;
        for (int i=0; i<n; i++) {
            v.add(args[i]);
        }
        
        System.out.println(v);
        System.out.println(removeAll(v, args[0]));
        System.out.println(v);
    }
}
