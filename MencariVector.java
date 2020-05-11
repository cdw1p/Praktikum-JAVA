package mencarivector;
import java.util.Vector;

/**
 *
 * @author 1337
 */
public class MencariVector {
    public static void main(String[] args) {
        String data[] = {"Java", "Source", "and", "Support", ".", "Java"};
        
        Vector v = new Vector();
        int n = data.length;
        for (int i=0; i<n; i++) {
            v.add(data[i]);
        }
        
        System.out.println(v);
        System.out.println("Contains Java : " + v.contains("Java"));
        System.out.println("Contains Java2s : " + v.contains("Java2s"));
        System.out.println("Where's and : " + v.indexOf("and"));
        System.out.println("Where's Source : " + v.indexOf("Source"));
        System.out.println("Where's Java from Begin : " + v.indexOf("Java"));
        System.out.println("Where's Java from End : " + v.lastIndexOf("Java"));
    }
}
