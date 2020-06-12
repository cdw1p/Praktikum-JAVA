package moodyobject;

/**
 *
 * @author CahyoDwi
 */
public class MoodyObject {
    protected String getMood() {
        return "Moody";
    }
    
    public void speak() {
        System.out.println("I am " + getMood());
    }

    void laugh() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void cry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
