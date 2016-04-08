
package j1613;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the class defining an Order
 */

public class Order {
    
    // private instance variables
    private int orderNumber;
    Date date;
    Customer customer;
    SalesAssoc salesAssoc;
    RobotModel robotModel;
    Status status;
    
    // constructors
    public Order()
    {
        orderNumber = -1;
        date = new Date(1, 1, 2000);
        customer = new Customer();
        salesAssoc = new SalesAssoc();
        robotModel = new RobotModel();
        status = "processing";
    }
    
    public Order(int num, Customer cust, SalesAssoc staff, RobotModel model, Status stat)
    {
        orderNumber = num;
        customer = cust;
        salesAssoc = staff;
        robotModel = model;
        status = stat;
    }
    
    // getters
    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public SalesAssoc getSalesAssoc() {
        return salesAssoc;
    }

    public RobotModel getRobotModel() {
        return robotModel;
    }

    public Status getStatus() {
        return status;
    }
    
    // methods
    public double robotPrice()
    {
        return robotModel.getPrice();
    }
    
    public double calculateShipping()
    {
        double shipping;
        if (this.robotPrice() >= 50)
            shipping = 10.99;
        else
            shipping = 10.99;
        return shipping;  
    }
    
    public double calculateTax()
    {
        return this.robotPrice()*0.825;
    }
    
    public double totalPrice()
    {
        return this.robotPrice() + this.calculateShipping() + this.calculateTax();
    }
}
