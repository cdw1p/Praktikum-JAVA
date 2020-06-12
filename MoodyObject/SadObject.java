package moodyobject;

/**
 *
 * @author CahyoDwi
 */
public class SadObject extends MoodyObject {
    protected String getMood() {
        return "Sad";
    }
    
    public void cry() {
        System.out.println("Boo hoooo");
    }
}
