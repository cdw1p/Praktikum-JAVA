package contohoverloading1;

/**
 *
 * @author 1337
 */
public class ContohOverloading1 {
    public static void main(String[] args) {
        Penggunaan co  = new Penggunaan();        
        co.jumlah(83,32);
        co.jumlah(34,454,432);
        co.jumlah(34.43,34);
        co.jumlah(28,33.23);
    }
}

class Penggunaan {
    public void jumlah (int a, int b) {
        System.out.println("Jumlah 2 angka = "+ (a + b));
    } 
    // Oveloading perbedaan jumlah parameter
    public void jumlah (int a, int b, int c){
        System.out.println("Jumlah 3 angka = " + (a + b + c));
    }
    // Overloading perbedaan tipe data parameter
    public void jumlah (double a, int b){
        System.out.println("Jumlah 2 angka (double+int) = "+ (a + b));
    }
    // Overloading perbedaan urutan tipe data parameter
    public void jumlah (int b, double a){
        System.out.println("Jumlah 2 angka (int+double) = "+ (a + b));
    }
}
