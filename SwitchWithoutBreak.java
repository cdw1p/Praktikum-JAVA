package switchwithoutbreak;

/**
 *
 * @author 1337
 */
public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char hurufInisial = (char)-1;
        System.out.print("Inisial Nama Kamu : ");
        
        try {
            hurufInisial = (char)System.in.read();
        } catch (Exception e) {
            System.out.print("Error: "+e.toString());
        }

        switch(hurufInisial) {
            case 'a':
                System.out.println("Nama kamu pasti Ali");
            case 'b':
                System.out.println("Nama kamu pasti Brodin");
            case 'c':
                System.out.println("Nama kamu pasti Cahyo");
            default:
                System.out.println("Saya tidak dapat menebak nama kamu");
        }
    }
}
