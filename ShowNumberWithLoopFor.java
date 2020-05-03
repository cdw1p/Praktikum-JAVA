package shownumberwithloopfor;

/**
 *
 * @author 1337
 */
public class ShowNumberWithLoopFor {
    public static void main(String[] args) {
        char input = (char)-1;
        int numToCount;
        
        System.out.print("Inputkan nomor 0-10 : ");
        try {
            input = (char)System.in.read();
        } catch (Exception e) {
            System.out.print("Error: "+e.toString());
        }
        
        numToCount = Character.digit(input, 10);
        if ((numToCount>0) && (numToCount<10)) {
            for (int i=1; i<=numToCount; i++) {
               System.out.println(i);
            }
        } else {
            System.out.print("Angka yang dimasukkan bukan diantara 0-10.");
        }
    }
}
