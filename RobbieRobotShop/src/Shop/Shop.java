/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.awt.image.RenderedImage;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

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
    
    private File file;
    private String fileName = "RobotShopData.txt";
    
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
    
    public Order getOrder(int index)
    {
        if(index < getNumOrders() && index >= 0)
            return orders.get(index);
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
<<<<<<< HEAD
               //headList.add(new Head(name, num, weight, cost, description));
=======
               headList.add(new Head(name, weight, cost, description));
>>>>>>> origin/master
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
<<<<<<< HEAD
               //torsoList.add(new Torso(name, num, type, weight, cost, description, value));
               break;
           case "locomotor"://add to shop's data structure
               //locomotorList.add(new Locomotor(name, num, type, weight, cost, description, value));
=======
               torsoList.add(new Torso(name, weight, cost, description, value));
               break;
           case "locomotor"://add to shop's data structure
               locomotorList.add(new Locomotor(name, weight, cost, description, value));
>>>>>>> origin/master
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
<<<<<<< HEAD
               //batteryList.add(new Battery(name, num, type, weight, cost, description, energy, power));;
=======
               batteryList.add(new Battery(name, weight, cost, description, energy, power));
>>>>>>> origin/master
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
<<<<<<< HEAD
        //robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, arm1, arm2));
=======
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, arm1, arm2));
>>>>>>> origin/master
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1)
    {
<<<<<<< HEAD
        //robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, arm1));
=======
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, arm1));
>>>>>>> origin/master
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1, Arm arm2)
    {
<<<<<<< HEAD
        //robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, arm1, arm2));
=======
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, arm1, arm2));
>>>>>>> origin/master
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1)
    {
<<<<<<< HEAD
        //robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, b3, arm1));
=======
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, b3, arm1));
>>>>>>> origin/master
    }
    
    public void createRobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1,Battery b2, Battery b3, Arm arm1, Arm arm2)
    {
<<<<<<< HEAD
        //robotModels.add(new RobotModel(name, num, price, head, motor, body, b1, b2, b3, arm1, arm2));
=======
        robotModels.add(new RobotModel(name, price, head, motor, body, b1, b2, b3, arm1, arm2));
>>>>>>> origin/master
    }

        // other methods
    public void newCustomer(String name, int num)
    {
        //customers.add(new Customer(name, num));
    }
    
    public void newCustomer(String name)
    {
        customers.add(new Customer(name));
    }
    
    public void newCustomer(String name, double wallet)
    {
        customers.add(new Customer(name, wallet));
    }
    
    public void newSalesAssoc(String name, int num)
    {
        //salesAssoc.add(new SalesAssoc(name, num));
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
    
    public void placeOrder(Date date, int cust, int sales, RobotModel model, Status status)
    {   
        Customer customer = customers.get(cust);
        SalesAssoc employee = salesAssoc.get(sales);
        Order order = new Order(date, customer, employee, model, status);
        orders.add(order);
        customer.addOrder(order);
        employee.addOrder(order);
    }
    
    public void viewOrders()
    {
        System.out.println("Orders:");
        int i = 0;
        while(i < orders.size())
        {
            System.out.printf("%d) %s\n", i, orders.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewCustomers()
    {
        System.out.println("Customers:");
        int i = 0;
        while(i < customers.size())
        {
            System.out.printf("%d) %s\n", i, customers.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewStaff()
    {
        System.out.println("Sales Associates:");
        int i = 0;
        while(i < salesAssoc.size())
        {
            System.out.printf("%d) %s\n", i, salesAssoc.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewModels()
    {
        System.out.println("Robot Models:");
        int i = 0;
        while(i < robotModels.size())
        {
            System.out.printf("%d) %s\n", i, robotModels.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewHeads()
    {
        System.out.println("Heads:");
        int i = 0;
        while(i < headList.size())
        {
            System.out.printf("%d) %s\n", i, headList.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewArms()
    {
        System.out.println("Arms:");
        int i = 0;
        while(i < armList.size())
        {
            System.out.printf("%d) %s\n", i, armList.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewMotors()
    {
        System.out.println("Locomotors:");
        int i = 0;
        while(i < locomotorList.size())
        {
            System.out.printf("%d) %s\n", i, locomotorList.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewTorsos()
    {
        System.out.println("Torsos:");
        int i = 0;
        while(i < torsoList.size())
        {
            System.out.printf("%d) %s\n", i, torsoList.get(i).shortPrint());
            i++;
        }
    }
    
    public void viewBatteries()
    {
        System.out.println("Batteries:");
        int i = 0;
        while(i < batteryList.size())
        {
            System.out.printf("%d) %s\n", i, batteryList.get(i).shortPrint());
            i++;
        }
    }
    
    public void runReport()
    {

    }

    public void save() throws IOException
    {
        FileWriter outfile = new FileWriter(fileName);
        String data = String.format("ARMS\n");
	for (int i = 0; i < armList.size(); i++)
	{
            data += armList.get(i).save();
	}
        data += String.format("HEADS\n");
	for (int i = 0; i < headList.size(); i++)
	{
            data += headList.get(i).save();
	}
        data += String.format("TORSOS\n");
        for (int i = 0; i < torsoList.size(); i++)
	{
            data += torsoList.get(i).save();
	}
        data += String.format("LOCOMOTORS\n");
        for (int i = 0; i < locomotorList.size(); i++)
	{
            data += locomotorList.get(i).save();
	}
        data += String.format("BATTERIES\n");
        for (int i = 0; i < batteryList.size(); i++)
	{
            data += batteryList.get(i).save();
	}
        data += String.format("ROBOT MODELS\n");
        for (int i = 0; i < robotModels.size(); i++)
	{
            data += robotModels.get(i).save();
	}
        data += String.format("SALES ASSOCIATES\n");
        for (int i = 0; i < salesAssoc.size(); i++)
	{
            data += salesAssoc.get(i).save();
	} 
        data += String.format("CUSTOMERS\n");
        for (int i = 0; i < customers.size(); i++)
	{
            data += customers.get(i).save();
	}
        data += String.format("ORDERS\n");
        for (int i = 0; i < orders.size(); i++)
	{
            data += orders.get(i).save();
	}
        data += String.format("END OF FILE\n");
	outfile.write(data);
	outfile.close();
        System.out.println("\nThe data has been successfully saved to the file.\n");
    }
    
    public void load() throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        Scanner inputFile = null;
        System.out.print("Enter the filename of the file: ");
        try{
            fileName = keyboard.next();
            file = new File(fileName);
            inputFile = new Scanner(file);
            
            inputFile.useDelimiter("\n");
            String line = "", name, date, description;
            int number, customerNum, salesNum, modelNum, status, speed, batteries;
            double cost, wallet, weight, energy, power; 
            Arm arm1, arm2;
            Battery battery1, battery2, battery3;
            Head head;
            Locomotor motor;
            Torso torso;
            while(inputFile.hasNext())
            {
                line = inputFile.next();
                if(line.equals("ARMS"))
                {
                    line = inputFile.next();
                    while(!line.equals("HEADS"))
                    {
                        String[] data = line.split("//");
                        name = data[0];
                        weight = Double.parseDouble(data[1]);
                        cost = Double.parseDouble(data[2]);
                        description = data[3];
                        createPart(name, "arm", weight, cost, description);
                        line = inputFile.next();
                    }
                }
                if(line.equals("HEADS"))
                {
                    line = inputFile.next();
                    while(!line.equals("TORSOS"))
                    {
                        String[] data = line.split("//");
                        name = data[0];
                        weight = Double.parseDouble(data[1]);
                        cost = Double.parseDouble(data[2]);
                        description = data[3];
                        createPart(name, "head", weight, cost, description);
                        line = inputFile.next();
                    }
                }
                if(line.equals("TORSOS"))
                {
                    line = inputFile.next();
                    while(!line.equals("LOCOMOTORS"))
                    {
                        String[] data = line.split("//");
                        name = data[0];
                        weight = Double.parseDouble(data[1]);
                        cost = Double.parseDouble(data[2]);
                        description = data[3];
                        batteries = Integer.parseInt(data[4]);
                        createPart(name, "torso", weight, cost, description, batteries);
                        line = inputFile.next();
                    }
                }
                if(line.equals("LOCOMOTORS"))
                {
                    line = inputFile.next();
                    while(!line.equals("BATTERIES"))
                    {
                        String[] data = line.split("//");
                        name = data[0];
                        weight = Double.parseDouble(data[1]);
                        cost = Double.parseDouble(data[2]);
                        description = data[3];
                        speed = Integer.parseInt(data[4]);
                        createPart(name, "locomotor", weight, cost, description, speed);
                        line = inputFile.next();
                    }
                }
                if(line.equals("BATTERIES"))
                {
                    line = inputFile.next();
                    while(!line.equals("ROBOT MODELS"))
                    {
                        String[] data = line.split("//");
                        name = data[0];
                        weight = Double.parseDouble(data[1]);
                        cost = Double.parseDouble(data[2]);
                        description = data[3];
                        energy = Double.parseDouble(data[4]);
                        power = Double.parseDouble(data[5]);
                        createPart(name, "battery", weight, cost, description, energy, power);
                        line = inputFile.next();
                    }
                }
                if(line.equals("ROBOT MODELS"))
                {
                    line = inputFile.next();
                    while(!line.equals("SALES ASSOCIATES"))
                    {
                        String[] data = line.split("//");
                        number = Integer.parseInt(data[0]);
                        if(number == 5)
                        {
                            name = data[1];
                            cost = Double.parseDouble(data[2]);
                            head = headList.get(Integer.parseInt(data[3]));
                            motor = locomotorList.get(Integer.parseInt(data[4]));
                            torso = torsoList.get(Integer.parseInt(data[5]));
                            battery1 = batteryList.get(Integer.parseInt(data[6]));
                            arm1 = armList.get(Integer.parseInt(data[7]));
                            createRobotModel(name, cost, head, motor, torso, battery1, arm1);
                        }
                        else if(number == 6)
                        {
                            batteries = Integer.parseInt(data[1]);
                            if(batteries == 1)
                            {
                                name = data[2];
                                cost = Double.parseDouble(data[3]);
                                head = headList.get(Integer.parseInt(data[4]));
                                motor = locomotorList.get(Integer.parseInt(data[5]));
                                torso = torsoList.get(Integer.parseInt(data[6]));
                                battery1 = batteryList.get(Integer.parseInt(data[7]));
                                arm1 = armList.get(Integer.parseInt(data[8]));
                                arm2 = armList.get(Integer.parseInt(data[9]));
                                createRobotModel(name, cost, head, motor, torso, battery1, arm1, arm2);
                            }
                            else if(batteries == 2)
                            {
                                name = data[2];
                                cost = Double.parseDouble(data[3]);
                                head = headList.get(Integer.parseInt(data[4]));
                                motor = locomotorList.get(Integer.parseInt(data[5]));
                                torso = torsoList.get(Integer.parseInt(data[6]));
                                battery1 = batteryList.get(Integer.parseInt(data[7]));
                                battery2 = batteryList.get(Integer.parseInt(data[8]));
                                arm1 = armList.get(Integer.parseInt(data[9]));
                                createRobotModel(name, cost, head, motor, torso, battery1, battery2, arm1);
                            }
                        }
                        else if(number == 7)
                        {
                            batteries = Integer.parseInt(data[1]);
                            if(batteries == 2)
                            {
                                name = data[2];
                                cost = Double.parseDouble(data[3]);
                                head = headList.get(Integer.parseInt(data[4]));
                                motor = locomotorList.get(Integer.parseInt(data[5]));
                                torso = torsoList.get(Integer.parseInt(data[6]));
                                battery1 = batteryList.get(Integer.parseInt(data[7]));
                                battery2 = batteryList.get(Integer.parseInt(data[8]));
                                arm1 = armList.get(Integer.parseInt(data[9]));
                                arm2 = armList.get(Integer.parseInt(data[10]));
                                createRobotModel(name, cost, head, motor, torso, battery1, battery2, arm1, arm2);
                            }
                            else if(batteries == 3)
                            {
                                name = data[2];
                                cost = Double.parseDouble(data[3]);
                                head = headList.get(Integer.parseInt(data[4]));
                                motor = locomotorList.get(Integer.parseInt(data[5]));
                                torso = torsoList.get(Integer.parseInt(data[6]));
                                battery1 = batteryList.get(Integer.parseInt(data[7]));
                                battery2 = batteryList.get(Integer.parseInt(data[8]));
                                battery3 = batteryList.get(Integer.parseInt(data[9]));
                                arm1 = armList.get(Integer.parseInt(data[10]));
                                createRobotModel(name, cost, head, motor, torso, battery1, battery2, battery3, arm1);
                            }
                        }
                        else if(number == 8)
                        {
                            name = data[1];
                            cost = Double.parseDouble(data[2]);
                            head = headList.get(Integer.parseInt(data[3]));
                            motor = locomotorList.get(Integer.parseInt(data[4]));
                            torso = torsoList.get(Integer.parseInt(data[5]));
                            battery1 = batteryList.get(Integer.parseInt(data[6]));
                            battery2 = batteryList.get(Integer.parseInt(data[7]));
                            battery3 = batteryList.get(Integer.parseInt(data[8]));
                            arm1 = armList.get(Integer.parseInt(data[9]));
                            arm2 = armList.get(Integer.parseInt(data[10]));
                            createRobotModel(name, cost, head, motor, torso, battery1, battery2, battery3, arm1, arm2);
                        }
                        line = inputFile.next();
                    }
                }
                if(line.equals("SALES ASSOCIATES"))
                {
                    line = inputFile.next();
                    while(!line.equals("CUSTOMERS"))
                    {
                        newSalesAssoc(line);
                        line = inputFile.next();
                    }
                }
                if(line.equals("CUSTOMERS"))
                {
                    line = inputFile.next();
                    while(!line.equals("ORDERS"))
                    {
                        String[] data = line.split("//");
                        name = data[0];
                        wallet = Double.parseDouble(data[1]);
                        newCustomer(name, wallet);
                        line = inputFile.next();
                    }
                }
                if(line.equals("ORDERS"))
                {
                    line = inputFile.next();
                    while(!line.equals("END OF FILE"))
                    {
                        String[] data = line.split("//");
                        date = data[0];
                        customerNum = Integer.parseInt(data[1]);
                        salesNum = Integer.parseInt(data[2]);
                        modelNum = Integer.parseInt(data[3]);
                        status = Integer.parseInt(data[4]);
                        placeOrder(new Date(date), customerNum, salesNum, robotModels.get(modelNum), new Status(status));
                        line = inputFile.next();
                    }
                }
                if(line.equals("END OF FILE"))
                {
                    System.out.println("\nFile has successfully loaded.\n");
                    break;
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File does not exist: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("IO Error - the file does not fit the program's expected format: " + e.getMessage());
        }
        finally{
            try{
                inputFile.close();
            } catch (NullPointerException e){}
        }
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
    
    
    