package contohoverride1;

/**
 *
 * @author 1337
 */
public class ContohOverride1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.data();
    }
}

class Mahasiswa {	 	 
  public void data(){	 	 
    System.out.println("Nama Saya Adalah Cahyo");	 	 
  }	 	 
}
