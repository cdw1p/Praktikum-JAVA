package switchifelse;

/**
 *
 * @author 1337
 */
public class SwitchIfElse {
    public static void main(String[] args) {
        int bulan = 2;
        int tahun = 2000;
        int totalHari = 0;
        
        switch(bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                totalHari = 31;
                break;
            case 4: case 6: case 9: case 11:
                totalHari = 30;
                break;
            case 2:
                if (((tahun%4==0) && !(tahun%100==0)) || (tahun%400==0)) {
                    totalHari = 29;
                } else {
                    totalHari = 28;
                }
                break;
            default:
                System.out.println("Bulan Tidak Valid.");
                break;
        }
        
        System.out.println("Total hari adalah = " + totalHari);
    }
}
