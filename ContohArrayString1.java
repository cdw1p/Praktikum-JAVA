package contoharraystring1;

/**
 *
 * @author 1337
 */
public class ContohArrayString1 {
    public static void main(String[] args) {
        String[] anArray = {"String one", "String two", "String three"};
        
        for (int i=0; i<anArray.length; i++) {
            System.out.println(anArray[i].toLowerCase());
        }
    }
}
