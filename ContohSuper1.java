package contohsuper1;

/**
 *
 * @author 1337
 */
public class ContohSuper1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
    }
}

class Person {
    public Person() {
        System.out.println("Eksekusi konstruktor Person()");
    }
}

class Employee extends Person {
    public Employee() {
        super();
        System.out.println("Ekekusi konstruktor Employee()");
    }
}
