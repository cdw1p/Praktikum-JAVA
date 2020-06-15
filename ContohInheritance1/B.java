package contohinheritance;

/**
 *
 * @author CahyoDwi
 */
public class B extends A {
    B() {
        System.out.println("Konstruktor B Dijlankan");
        var_a = "var_a dari class B";
        var_b = "var_b dari class B";
    }
    
    public static void main(String args[]) {
        System.out.println("-- Obyek A Dibuat");
        A aa = new A();
        System.out.println("Menampilkan Semua Variabel Obyek aa :");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);
        System.out.println(aa.var_d);
        System.out.println("");
        
        System.out.println("-- Obyek B Dibuat");
        B bb = new B();
        System.out.println("Menampilkan Semua Variabel Obyek bb :");
        System.out.println(bb.var_a);
        System.out.println(bb.var_b);
        System.out.println(bb.var_c);
        System.out.println(bb.var_d);
    }
}
