package moodyobject;

/**
 *
 * @author CahyoDwi
 */
public class HappyObject extends MoodyObject {
    protected String getMood() {
        return "Happy";
    }
    
    public void laugh() {
        System.out.println("Ha ha ha ha");
    }
}
