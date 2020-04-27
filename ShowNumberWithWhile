package shownumberwithwhile;

/**
 *
 * @author 1337
 */
public class ShowNumberWithWhile {
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
            int i=1;
            while(i<=numToCount) {
                System.out.println(i);
                i++;
            }
        } else {
            System.out.print("Angka yang dimasukkan bukan diantara 0-10.");
        }
    }
}
