As
package j1613;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: A program for Group J1613's Robot Project
 */
public class J1613 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void createPart(String name, int num, ComponentType type, double weight, double cost, String description)
    {
        robotParts.add(new RobotPart(name, num, type, weight, cost, description));
    }
    public void createPart(String name, int num, ComponentType type, double weight, double cost, String description, int value)
    {
        robotParts.add(new RobotPart(name, num, type, weight, cost, description, value));
    }
    public void createPart(String name, int num, ComponentType type, double weight, double cost, String description, double energy, double power)
    {
        robotParts.add(new RobotPart(name, num, type, weight, cost, description, energy, power));
    }
    
    public void createRobotModel(Head head, Locomotor motor, Torso body, Battery b1, Arm arm1)
    {
        robotModels.add(new RobotModel(head, motor, body, b1, arm1));
    }
    public void createRobotModel(Head head, Locomotor motor, Torso body, Battery b1, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(head, motor, body, b1, arm1, arm2));
    }
    public void createRobotModel(Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1)
    {
        robotModels.add(new RobotModel(head, motor, body, b1, b2, arm1));
    }
    public void createRobotModel(Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(head, motor, body, b1, b2, arm1, arm2));
    }
    public void createRobotModel(Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1)
    {
        robotModels.add(new RobotModel(head, motor, body, b1, b2, b3, arm1));
    }
    public void createRobotModel(Head head, Locomotor motor, Torso body, Battery b1,Battery b2, Battery b3, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(head, motor, body, b1, b2, b3, arm1, arm2));
    }
    
    public void placeOrder(int num, Date date, Customer cust, SalesAssoc sales, RobotModel model, Status status)
    {
        orders.add(new Order(num, date, cust, sales, model, status));
    }
    
    public void newCustomer(String name, int num)
    {
        customers.add(new Customer(name, num));
    }
    
    public void newSalesAssoc(String name, int num)
    {
        salesAssoc.add(new SalesAssoc(name, num));
    }
    
}
