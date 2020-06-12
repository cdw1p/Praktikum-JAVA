package employee;

/**
 *
 * @author CahyoDwi
 */
public class TestManager {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 5000000, "Financial");
        System.out.println("Name : " + manager.GetName());
        System.out.println("Salary : " + manager.GetSalary());
        System.out.println("Dept : " + manager.GetDept());
        
        manager = new Manager("Michael", "Accounting");
        System.out.println("Name : " + manager.GetName());
        System.out.println("Salary : " + manager.GetSalary());
        System.out.println("Dept : " + manager.GetDept());
    }
}
