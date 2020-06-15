package contohinheritance2;

/**
 *
 * @author CahyoDwi
 */
class InheritExample {
    public static void main(String args[]) {
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();
        
        objectBapak.a = 1;
        objectBapak.b = 2;
        System.out.println("Object Bapak (SuperClass) :");
        objectBapak.show_variabel();
        
        objectAnak.c = 5;
        System.out.println("Object Anak (SubClass dari Bapak) :");
        objectAnak.show_variabel();
    }
}
