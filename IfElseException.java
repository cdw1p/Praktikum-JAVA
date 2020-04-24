package ifelseexception;

/**
 *
 * @author 1337
 */
public class IfElseException {
    public static void main(String[] args) {
        char hurufInisial = (char)-1;
        System.out.print("Inisial Nama Kamu : ");
        
        try {
            hurufInisial = (char)System.in.read();
        } catch (Exception e) {
            System.out.print("Error: "+e.toString());
        }

        if (hurufInisial == 'a')
            System.out.println("Nama kamu pasti Ali");
        else if (hurufInisial == 'b')
            System.out.println("Nama kamu pasti Brodin");
        else if (hurufInisial == 'c')
            System.out.println("Nama kamu pasti Cahyo");
        else
            System.out.println("Saya tidak dapat menebak nama kamu");
    }
}
