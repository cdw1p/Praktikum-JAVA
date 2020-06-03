package classvehiclewithoutencapsulation;

/**
 *
 * @author CahyoDwi
 */
public class ClassVehicleWithoutEncapsulation {
    public static void main(String[] args) {
        System.out.println("Creating a vehicle with a 10,000kg maximum load.");
        Vehicle vehicle = new Vehicle(10000.0);
        
        System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500.0));
        System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250.0));
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000.0));
        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000.0));
        System.out.println("Add box #5 (4000kg) : " + vehicle.addBox(300.0));
        
        System.out.println("Vehicle load is " + vehicle.getLoad() + "kg");
    }
}

class Vehicle {
    private double Load, MaxLoad;

    public Vehicle(double val) {
        ClassVehicleWithoutEncapsulation classVehicle = new ClassVehicleWithoutEncapsulation();
        this.MaxLoad = val;
    }
    
    public double getLoad() {
        return this.Load;
    }
    
    public double getMaxLoad() {
        return this.MaxLoad;
    }
    
    public boolean addBox(double val) {
        if ((this.Load + val) > 10000) {
            return false;
        } else {
            this.Load = this.Load + val;
            return true;
        }
    }
}

