package menghitungluastrapesium;

/**
 *
 * @author 1337
 */
public class MenghitungLuasTrapesium {
    public static void main(String[] args) {
        MenghitungTrapesium hitung = new MenghitungTrapesium();
    }
}

class MenghitungTrapesium {
    public MenghitungTrapesium() {
        int s1=10,s2=10,t=10;
        float st=0.5f, l;
        l=(s1+s2)*(st*t);
        
        System.out.println("Program Menghitung Luas Trapesium");
        System.out.println("by Cahyo Dwi Putro - 1461900333\n");
        System.out.println("Sisi AB  = "+s1);
        System.out.println("Sisi DC  = "+s2);
        System.out.println("Tinggi   = "+t);
        System.out.println("Luas = AB + DC x t  : 2");
        System.out.println("     = 10 + 10 x 10 : 2");
        System.out.println("     = "+l);
    }
}
