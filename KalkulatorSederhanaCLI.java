package pbo.day7;
import java.util.Scanner;

/**
 *
 * @author 1337
 */
public class PBODay7 {
    static float total=0, bil1=1, bil2=1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[+] Inputkan Kalkulasi : ");
        int bil1 = scanner.nextInt();
        String op = scanner.next();
        int bil2 = scanner.nextInt();
        System.out.println("Hasil = "+menghitung(bil1, op, bil2));
    }
    
    private static int menghitung(int bil1, String op, int bil2) {
        switch (op.charAt(0)) {
        case '+':
            return bil1 + bil2;
        case '-':
            return bil1 - bil2;
        case '*':
            return bil1 * bil2;
        case '/':
            return bil1 / bil2;
        case '%':
            return bil1 % bil2;
        case '&':
            return bil1 & bil2;
        case '|':
            return bil1 | bil2;
        }
        throw new IllegalArgumentException("Operator tidak ditemukan : " + op);
    }
}
