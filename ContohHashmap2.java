package contohhashmap2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author 1337
 */
public class ContohHashmap2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");
        System.out.println("Size hashmap : " + map.size());
        
        Object obj = map.remove("2");
        System.out.println("Size hashmap after remove : " + map.size());
        
        Collection c = map.values();
        Iterator itr = c.iterator();
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
