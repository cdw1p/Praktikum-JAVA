package contoharraycopy2;

/**
 *
 * @author 1337
 */
public class ContohArrayCopy2 {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];
        char[] coba = new char[20];
        coba = copyFrom;
        coba[0] = 't';
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        System.out.println(new String(coba));
    }
}
