package moodyobject;

/**
 *
 * @author CahyoDwi
 */
public class MoodyTest {
    public static void main(String args[]) {
        MoodyObject m = new MoodyObject();
        m.speak();
        
        m = new HappyObject();
        m.laugh();
        
        m = new SadObject();
        m.cry();
    }
}
