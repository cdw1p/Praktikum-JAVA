package contohhashmap1;
import java.util.HashMap;

/**
 *
 * @author 1337
 */
public class ContohHashmap1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("One", new Integer(1));
        map.put("Two", new Integer(2));
        
        Object obj = map.get("One");
        System.out.println(obj);
        
        obj = map.get("Two");
        System.out.println(obj);
    }
}
