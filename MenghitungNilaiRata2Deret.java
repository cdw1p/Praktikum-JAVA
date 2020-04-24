package menghitungnilairata2deret;
import java.util.*;

/**
 *
 * @author 1337
 */
public class MenghitungNilaiRata2Deret {
    Stack<Integer> dataDeret = new Stack<Integer>(); 
    protected int dataTotalDeret = 0;
    
   public void generateDataDeret(int batasBil) {
        for(int a=1, b=1; a<batasBil; a=a+b++) {
           this.dataDeret.push(a);
        }
    }
   
    public void dataTotalDeret() {
        for(int i=0; i<this.dataDeret.size(); i++) {
            this.dataTotalDeret = this.dataTotalDeret + this.dataDeret.get(i);
        }
    }

    public void totalRataRata() {
        System.out.println("Data Bilangan : "+this.dataDeret);
        System.out.println("Total Bilangan : "+this.dataTotalDeret);
        System.out.println("Rata - Rata : "+(this.dataTotalDeret/this.dataDeret.size()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membaca input berupa angka (Integer)
        System.out.print("[+] Masukan Bilangan : ");
        int batasBil = sc.nextInt();
        
        // Melempar nilai input ke method class MenghitungNilaiRata2Deret
        MenghitungNilaiRata2Deret classProgram = new MenghitungNilaiRata2Deret();
        classProgram.generateDataDeret(batasBil);
        classProgram.dataTotalDeret();
        classProgram.totalRataRata();
    }
}
