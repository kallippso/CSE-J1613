
package Shop;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the class defining an Order
 */

public class Order {
    
    // private instance variables
    private int orderNumber;
    private Date date;
    private Customer customer;
    private SalesAssoc salesAssoc;
    private RobotModel robotModel;
    private Status status;
    private static int numOrders = 0;
    
    // constructors
    public Order()
    {
        orderNumber = numOrders++;
        date = new Date(1, 1, 2000);
        customer = new Customer();
        salesAssoc = new SalesAssoc();
        robotModel = new RobotModel();
        status = new Status(0);
    }
    
    public Order(int num, Date date, Customer cust, SalesAssoc staff, RobotModel model, Status stat)
    {
        this.orderNumber = num;
        this.date = date;
        this.customer = cust;
        this.salesAssoc = staff;
        this.robotModel = model;
        this.status = stat;
        numOrders++;
    }
    
    public Order(int num, Date date, Customer cust, SalesAssoc staff, RobotModel model, int stat)
    {
        this.orderNumber = num;
        this.date = date;
        this.customer = cust;
        this.salesAssoc = staff;
        this.robotModel = model;
        this.status = new Status(stat);
        numOrders++;
    }
    
    public Order(Date date, Customer cust, SalesAssoc staff, RobotModel model, Status stat)
    {
        this.orderNumber = numOrders++;
        this.date = date;
        this.customer = cust;
        this.salesAssoc = staff;
        this.robotModel = model;
        this.status = stat;
    }
    
    public Order(Date date, Customer cust, SalesAssoc staff, RobotModel model, int stat)
    {
        this.orderNumber = numOrders++;
        this.date = date;
        this.customer = cust;
        this.salesAssoc = staff;
        this.robotModel = model;
        this.status = new Status(stat);
    }
    
    // getters and setters
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

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSalesAssoc(SalesAssoc salesAssoc) {
        this.salesAssoc = salesAssoc;
    }

    public void setRobotModel(RobotModel robotModel) {
        this.robotModel = robotModel;
    }

    public void setStatus(Status status) {
        this.status = status;
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
            shipping = 4.99;
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
    
    public String save()
    {
        return String.format("%s//%d//%d//%d//%d\n", date, customer.getCustomerNumber(), salesAssoc.getEmployeeNumber(), robotModel.getModelNumber(), status.getStatus());
    }
    
    public String shortPrint()
    {
        return String.format("Order Number: %5d \t Date: %s", orderNumber, date);
    }
    
    @Override
    public String toString()
    {
        String results = "\nOrder Number: " + orderNumber;
        results += "\nDate: " + date;
        results += "\nCustomer: " + customer.getName();
        results += "\nSales Associate: " + salesAssoc.getName();
        results += "\nRobot Model: " + robotModel.getName() + " [" + robotModel.getModelNumber() + "]";
        results += "\nStatus: " + status + "\n";
        
        return results;
    }
}
