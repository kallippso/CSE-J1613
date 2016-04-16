/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.awt.image.RenderedImage;
import java.util.ArrayList;

/**
 * Description: For Group J1613's Robot Project - the class defining a Shop
 */

public class Shop {

    //private instance variables
    private ArrayList<RobotModel> robotModels;
    private ArrayList<Order> orders;
    private ArrayList<Customer> customers;
    private ArrayList<SalesAssoc> salesAssoc;
    private ArrayList<Head> headList;
    private ArrayList<Locomotor> locomotorList;
    private ArrayList<Torso> torsoList;
    private ArrayList<Battery> batteryList;
    private ArrayList<Arm> armList;
    
    // constructors
    public Shop()
    {
        robotModels = new ArrayList<>();
        orders = new ArrayList<>();
        customers = new ArrayList<>();
        salesAssoc = new ArrayList<>();
        headList = new ArrayList<>();
        locomotorList = new ArrayList<>();
        torsoList = new ArrayList<>();
        batteryList = new ArrayList<>();
        armList = new ArrayList<>();
    }
    
    // methods
        // getters
    public ArrayList<Arm> getArmList()
    {
        return armList;
    }
    
    public ArrayList<Battery> getBatteryList()
    {
        return batteryList;
    }
    
    public ArrayList<Head> getHeadList()
    {
        return headList;
    }
    
    public ArrayList<Locomotor> getLocomotorList()
    {
        return locomotorList;
    }
    
    public ArrayList<Torso> getTorsoList()
    {
        return torsoList;
    }
    
    public int getNumArms()
    {
        return armList.size();
    }
    
    public int getNumHeads()
    {
        return headList.size();
    }
    
    public int getNumBatts()
    {
        return batteryList.size();
    }
    
    public int getNumMotors()
    {
        return locomotorList.size();
    }
    
    public int getNumTorsos()
    {
        return torsoList.size();
    }
    
    public ArrayList<RobotModel> getModels()
    {
        return robotModels;
    }
    
    public int getNumModels()
    {
        return robotModels.size();
    }
    
    public ArrayList<Order> getOrders()
    {
        return orders;
    }
    
    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }
    
    public ArrayList<SalesAssoc> getStaff()
    {
        return salesAssoc;
    }
    
    public int getNumOrders()
    {
        return orders.size();
    }
    
    public int getNumCustomers()
    {
        return customers.size();
    }
    
    public int getNumStaff()
    {
        return salesAssoc.size();
    }
    
    public Head getHead(int index)
    {
        if(index < getNumHeads() && index >= 0)    
            return headList.get(index);
        else
            return null;
    }
    
    public Locomotor getLocomotor(int index)
    {
        if(index < getNumMotors() && index >= 0)
            return locomotorList.get(index);
        else
            return null;
    }
    
    public Torso getTorso(int index)
    {
        if(index < getNumTorsos() && index >= 0)
            return torsoList.get(index);
        else
            return null;
    }
    
    public Battery getBattery(int index)
    {
        if(index < getNumBatts() && index >= 0)
            return batteryList.get(index);
        else
            return null;
    }
    
    public Arm getArm(int index)
    {
        if(index < getNumArms() && index >= 0)
            return armList.get(index);
        else
            return null;
    }
    
    public Customer getCustomer(int index)
    {
        if(index < getNumCustomers() && index >= 0)
            return customers.get(index);
        else
            return null;
    }
    
    public SalesAssoc getSalesAssoc(int index)
    {
        if(index < getNumStaff() && index >= 0)
            return salesAssoc.get(index);
        else
            return null;
    }
    
    public RobotModel getRobotModel(int index)
    {
        if(index < getNumModels() && index >= 0)
            return robotModels.get(index);
        else
            return null;
    }
    
        // createPart methods
    public void createPart(ComponentType componentName, String name, double weight, double cost, String description, RenderedImage image)
    {
       RobotPart newModel;
       switch(componentName.getTypeName())
       {
           case "Head": //add to shop's data structure
               newModel = new Head(name, componentName, weight, cost, description, image);
               //headList.add(newModel);
               break;
           case "Torso"://add to shop's data structure
               //createTorso()
               //torsoList.add(newModel);
               break;
           case "Locomotor"://add to shop's data structure
               newModel = new Locomotor(name, componentName, weight, cost, description, image);
               //locomotorList.add(newModel);
               break;
           case "Battery"://add to shop's data structure
               newModel = new Battery(name, componentName, weight, cost, description, image);
               //batteryList.add(newModel);
               break;
           case "Arm"://add to shop's data structure
               newModel = new Arm(name, componentName, weight, cost, description, image);
               //armList.add(newModel);
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
    public void createPart(String name, String type, double weight, double cost, String description)    // only heads and arms fit this constructor
    {
       switch(type)
       {
           case "head": //add to shop's data structure
               headList.add(new Head(name, weight, cost, description));
               break;
           case "arm"://add to shop's data structure
               armList.add(new Arm(name, weight, cost, description));
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
    public void createPart(String name, String type, double weight, double cost, String description, int value) // only torsos and locomotors fit this constructor
    {
       switch(type)
       {
           case "torso": //add to shop's data structure
               torsoList.add(new Torso(name, weight, cost, description, value));
               break;
           case "locomotor"://add to shop's data structure
               locomotorList.add(new Locomotor(name, weight, cost, description, value));
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
    public void createPart(String name, String type, double weight, double cost, String description, double energy, double power)   // only batteries fit this constructor
    {
        switch(type)
       {
           case "battery": //add to shop's data structure
               batteryList.add(new Battery(name, weight, cost, description, energy, power));
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
        // create RobotModel methods
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1)
    {
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, arm1));
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, arm1, arm2));
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1)
    {
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, arm1));
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, arm1, arm2));
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1)
    {
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, b3, arm1));
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1,Battery b2, Battery b3, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, b3, arm1, arm2));
    }

        // other methods
    public void newCustomer(String name, int num)
    {
        customers.add(new Customer(name, num));
    }
    
    public void newCustomer(String name)
    {
        customers.add(new Customer(name));
    }
    
    public void newSalesAssoc(String name, int num)
    {
        salesAssoc.add(new SalesAssoc(name, num));
    }
    
    public void newSalesAssoc(String name)
    {
        salesAssoc.add(new SalesAssoc(name));
    }
    
    public void placeOrder(int num, Date date, Customer cust, SalesAssoc sales, RobotModel model, Status status)
    {   
        Order order = new Order(num, date, cust, sales, model, status);
        orders.add(order);
        cust.addOrder(order);
        sales.addOrder(order);
    }
    
    public void placeOrder(Date date, Customer cust, SalesAssoc sales, RobotModel model, Status status)
    {   
        Order order = new Order(date, cust, sales, model, status);
        orders.add(order);
        cust.addOrder(order);
        sales.addOrder(order);
    }
    
    public void viewOrders()
    {
        System.out.println("Orders:");
        int i = 0;
        while(i < orders.size())
        {
            System.out.println(orders.get(i));
            i++;
        }
    }
    
    public void runReport()
    {

    }

    public void save()
    {

    }
     
    public static void main(String[] args) {
        Shop testShop = new Shop();
        Customer test1 = new Customer("Person");
        SalesAssoc sales1 = new SalesAssoc("Worker");
        Customer test2 = new Customer("Boy");
        SalesAssoc sales2 = new SalesAssoc("WORKER");
        Customer test3 = new Customer("Girl");
        SalesAssoc sales3 = new SalesAssoc("worker");
        testShop.placeOrder(new Date("1/1/2016"), test1, sales1, new RobotModel(), new Status(1));
        testShop.placeOrder(new Date("2/2/2016"), test2, sales3, new RobotModel(), new Status(2));
        testShop.placeOrder(new Date("3/3/2016"), test3, sales2, new RobotModel(), new Status(3));
        testShop.viewOrders();
    }
}
    
    
    