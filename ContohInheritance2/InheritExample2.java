package contohinheritance2;

/**
 *
 * @author CahyoDwi
 */
class InheritExample {
    public static void main(String args[]) {
        Bapak objectBapak = new Bapak();        
        objectBapak.a = 1;
        objectBapak.b = 2;
        System.out.println("Object Bapak (SuperClass) :");
        objectBapak.show_variabel();
        
        System.out.println("Object Anak (SubClass dari Bapak) :");
        Anak objectAnak = new Anak(objectBapak.a, objectBapak.b, 5);
    }
}
