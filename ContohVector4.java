package contohvector4;
import java.util.*;

/**
 *
 * @author 1337
 */
public class ContohVector4 {
    public static void main(String[] args) {
        Vector v = new Vector();
        int primitiveType = 0;
        Integer wrapperType = new Integer(20);
        String str = "Kimo Chi";
        
        v.add(primitiveType);
        v.add(wrapperType);
        v.add(str);
        v.add(2, new Integer(30));
        
        System.out.println("Element vector : " + v);
        System.out.println("Size of vector are : " + v.size());
        System.out.println("Element at position 2 : " + v.elementAt(2));
        System.out.println("First element of vector : " + v.firstElement());
        System.out.println("Last element of vector : " + v.lastElement());
        
        v.removeElementAt(2);
        Enumeration e = v.elements();
        System.out.println("Element vector : " + v);
        
        while (e.hasMoreElements()) {
            System.out.println("The elements are : " + e.nextElement());
        }
    }
}
