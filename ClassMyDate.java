package latihan1.mydate;
import java.util.Date;

/**
 *
 * @author CahyoDwi
 */
public class Latihan1MyDate {
    private int Day, Month, Year;

    public static void main(String[] args) {
        Latihan1MyDate classDate = new Latihan1MyDate();
        MyDate date = new MyDate(classDate.Day, classDate.Month, classDate.Year);
    }
    
    public void SetDay(int val) {
       if (val > 31) {
            System.out.println("[*] Error : Tanggal tidak boleh lebih dari 31");
       } else {
            this.Day = val;
       }
    }
    
    public void SetMonth(int val) {
       if (val > 12) {
            System.out.println("[*] Error : Range angka bulan hanya dari 1-12");
       } else {
            this.Month = val;
       }
    }
    
    public void SetYear(int val) {
       if (val > 2020) {
            System.out.println("[*] Error : Tahun tidak boleh lebih dari 2020");
       } else {
            this.Year = val;
       }
    }
    
    public void GetDate() {
        if (this.Day == 0 || this.Month == 0 || this.Year == 0) {
            // Error
        } else {
            String output = this.Day + "-" + this.Month + "-" + this.Year;
            System.out.println(output);
        }
    }
}

class MyDate {    
    public MyDate(int Day, int Month, int Year) {
        Latihan1MyDate testMyDate = new Latihan1MyDate();
        testMyDate.SetDay(20);
        testMyDate.SetMonth(8);
        testMyDate.SetYear(2020);
        testMyDate.GetDate();
    }
}
