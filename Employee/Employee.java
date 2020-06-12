package employee;
import java.util.Date;

/**
 *
 * @author CahyoDwi
 */
public class Employee {
    private static final double BASE_SALARY = 15000.00;
    private String Name = "";
    private double Salary = 0.0;
    private Date birthDate;
    
    public Employee() {}
    
    public Employee(String name, double salary, Date DoB) {
        this.Name = name;
        this.Salary = salary;
        this.birthDate = DoB;
    }
    
    public Employee(String name, double salary) {
        this(name, salary, null);
    }
    
    public Employee(String name, Date DoB) {
        this(name, BASE_SALARY, DoB);
    }
    
    public Employee(String name) {
        this(name, BASE_SALARY);
    }
    
    public String GetName() {
        return Name;
    }
    
    public double GetSalary() {
        return Salary;
    }
    
    public static void main(String[] args) {
    }
}
