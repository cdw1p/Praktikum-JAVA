package mengubahuppercase.count;
import java.util.*;

/**
 *
 * @author 1337
 */
public class MengubahUppercaseCount {
    protected String[] arrayKalimat;
    
    public void splitKalimat(String inputKalimat) {
        this.arrayKalimat = inputKalimat.split(" ");
    } // NBI : 1461900333
    
    public void menghitungKata() {
        System.out.println("Frequensi dari : ");
        for(int i=0; i<this.arrayKalimat.length; i++) {
            System.out.println(arrayKalimat[i].toUpperCase() + "\t\t" + arrayKalimat[i].length());
        }
    } // NBI : 1461900333

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membaca input berupa kalimat (String)
        System.out.print("[+] Masukan Kalimat : ");
        String inputKalimat = sc.nextLine();
        
        // Melempar nilai input ke method class MengubahUppercaseCount
        MengubahUppercaseCount classProgram = new MengubahUppercaseCount();
        classProgram.splitKalimat(inputKalimat);
        classProgram.menghitungKata();
    }
}
