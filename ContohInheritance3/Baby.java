package contohinheritance3;

/**
 *
 * @author CahyoDwi
 */
class Baby extends Parent {
    String babyName;

    public Baby(String parentName) {
        super(parentName);
        System.out.println("Konstruktor Baby");
        this.babyName = babyName;
    }
    
    public void Cry() {
        System.out.println("Owek Owek");
    }
}
