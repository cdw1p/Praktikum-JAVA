package employee;
import employee.Employee;

/**
 *
 * @author CahyoDwi
 */
public class Manager extends Employee {
    private String department;
    
    public Manager(String name, double salary, String dept) {
        super(name, salary);
        department = dept;
    }
    
    public Manager(String n, String dept) {
        super(n);
        department = dept;
    }
    
    public Manager(String dept) {
        super();
        department = dept;
    }
    
    public String GetDept() {
        return department;
    }
}

