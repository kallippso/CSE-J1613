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
    //public void getPart(ComponentType type, int search)
    
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
    
    public void createPart(String name, int num, String type, double weight, double cost, String description)    // only heads and arms fit this constructor
    {
       switch(type)
       {
           case "head": //add to shop's data structure
               headList.add(new Head(name, num, weight, cost, description));
               break;
           case "arm"://add to shop's data structure
               armList.add(new Arm(name, num, weight, cost, description));
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
    public void createPart(String name, int num, String type, double weight, double cost, String description, int value) // only torsos and locomotors fit this constructor
    {
       switch(type)
       {
           case "torso": //add to shop's data structure
               torsoList.add(new Torso(name, num, weight, cost, description, value));
               break;
           case "locomotor"://add to shop's data structure
               locomotorList.add(new Locomotor(name, num, weight, cost, description, value));
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
    public void createPart(String name, int num, String type, double weight, double cost, String description, double energy, double power)   // only batteries fit this constructor
    {
        switch(type)
       {
           case "battery": //add to shop's data structure
               batteryList.add(new Battery(name, num, weight, cost, description, energy, power));
               break;
           default:
               System.out.println("Component name not recognized.");
               break;        
       }
    }
    
        // create RobotModel methods
    public void createRobotModel(String name, double price, int num, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1)
    {
        robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, arm1));
    }
    
    public void createRobotModel(String name, double price, int num, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, arm1, arm2));
    }
    
    public void createRobotModel(String name, double price, int num, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1)
    {
        robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, arm1));
    }
    
    public void createRobotModel(String name, double price, int num, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, arm1, arm2));
    }
    
    public void createRobotModel(String name, double price, int num, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1)
    {
        robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, b3, arm1));
    }
    
    public void createRobotModel(String name, double price, int num, Head head, Locomotor motor, Torso body, Battery b1,Battery b2, Battery b3, Arm arm1, Arm arm2)
    {
        robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, b3, arm1, arm2));
    }

        // other methods
    public void newCustomer(String name, int num)
    {
        customers.add(new Customer(name, num));
    }
    
    public void newSalesAssoc(String name, int num)
    {
        salesAssoc.add(new SalesAssoc(name, num));
    }
    
    public void placeOrder(int num, Date date, Customer cust, SalesAssoc sales, RobotModel model, Status status)
    {   
        Order order = new Order(num, date, cust, sales, model, status);
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

    }
}
    
    
    