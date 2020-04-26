package contohconstructor;

/**
 *
 * @author 1337
 */
public class ContohConstructor {
    public static void main(String[] args) {
        // Buat Objek dari class Percetakan
        // Dengan membuat objek dari class Percetakan berarti,
        // sekaligus memanggil konstruktor dari class tersebut.
        Percetakan cetak = new Percetakan();

        //  Buat Objek dari class Belajar
        Belajar pelajar = new Belajar(3, "Saya belajar Konstruktor di Java");
    }
}

class Percetakan {
    //  Konstruktor class Percetakan
    public Percetakan() {
        System.out.println("Hello World!");
    }
}

class Belajar {
    //  Konstruktor dengan parameter
    public Belajar(int a, String str) {
        for(int x = 1; x <= a; x++)
            System.out.println(str);
    }
}
