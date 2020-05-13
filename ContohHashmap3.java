package contohhashmap3;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author 1337
 */
public class ContohHashmap3 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("One", new Integer(1));
        map.put("Two", new Integer(2));
        map.put("Three", new Integer(3));
        
        if (map.containsValue(new Integer(1))) {
            System.out.println("Hashmap contains 1 as value");
        } else {
            System.out.println("Hashmap doest't contains 1 as value");
        }
        
        if (map.containsValue("One")) {
            System.out.println("Hashmap contains One as value");
        } else {
            System.out.println("Hashmap doest't contains One as value");
        }
    }
}
