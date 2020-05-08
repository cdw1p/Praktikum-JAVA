package contoharray1;

/**
 *
 * @author 1337
 */
public class ContohArray1 {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];

        for (int i=0; i<anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " "); 
        }
        
        System.out.println();
    }
}
