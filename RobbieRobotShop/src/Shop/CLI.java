
package Shop;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the Command Line Interface for the Robot Shop
 */

import java.io.IOException;
import java.util.Scanner;

public class CLI {
    
    Scanner keyboard = new Scanner(System.in);
    int choice;
    Shop robotShop = new Shop();
    
    public CLI()
    {
        
    }
    
    public void startCLI() throws IOException{
        choice = 0;
        String reply;
        System.out.print("Would you like to load a file? (Y/N): ");
        reply = keyboard.next();
        if(reply.toLowerCase().equals("y"))
        {
            robotShop.load();
        }
        while(choice != 4)
        {
            mainMenu();
            choice = keyboard.nextInt();
            while(choice > 4 || choice < 1)
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
                System.out.println(" Please input a number between 1-4.");
                System.out.print(" > ");
                choice = keyboard.nextInt();
            }
            switch(choice)
            {
                case 1:
                    createMenu();
                    break;
                case 2:
                    reportMenu();
                    break;
                case 3:
                    robotShop.save();
                    break;
                case 4:
                    break;
            }
        }
    }
    
    private void mainMenu(){
        System.out.println("\n ===== Main Menu =====");
        System.out.println("  1) Create");
        System.out.println("  2) Report");
        System.out.println("  3) Save");
        System.out.println("  4) Quit");
        System.out.println(" =====================");
        System.out.println(" Select an option by inputting the corresponding number.");
        System.out.print(" > ");
    }
    
    private void createMenu(){
        int choice2;
        choice2 = 0;
        while(choice2 != 6)
        {
            System.out.println("\n ===== Create Menu =====");
            System.out.println("  1) Order");
            System.out.println("  2) Customer");
            System.out.println("  3) Sales Associate");
            System.out.println("  4) Robot Model");
            System.out.println("  5) Robot Component");
            System.out.println("  6) Return to Main Menu");
            System.out.println(" =======================");
            System.out.println(" Select an option by inputting the corresponding number.");
            System.out.print(" > ");
            choice2 = keyboard.nextInt();
            while(choice2 > 6 || choice2 < 1)
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
                System.out.println(" Please input a number between 1-6.");
                System.out.print(" > ");
                choice2 = keyboard.nextInt();
            }
            switch(choice2)
            {
                case 1:
                    createOrder();
                    break;
                case 2:
                    createCustomer();
                    break;
                case 3:
                    createSalesAssoc();
                    break;
                case 4:
                    createRobotModel();
                    break;
                case 5:
                    createRobotPart();
                    break;
                case 6:
                    break;
            }
        }  
    }
    
    private void createRobotPart()
    {
        String reply;
        String name, details;
        int speed, batts;
        double weight, cost, energy, power;
        System.out.print("What kind of component would you like to make?\n > ");
        reply = keyboard.next();
        switch(reply.toLowerCase())
        {
            case "head":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                System.out.print("Enter a description for the robot part: ");
                keyboard.nextLine(); //buffer
                details = keyboard.nextLine();
                robotShop.createPart(name, "head", weight, cost, details);
                System.out.println("\nA head with name: " + name + ", part number: " + (robotShop.getNumHeads()-1) + ", weight: " + weight + ", cost: " + cost + ", and description: \"" + details + "\" has been created.");
                break;
            case "locomotor":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                System.out.print("Enter a description for the robot part: ");
                keyboard.nextLine(); //buffer
                details = keyboard.nextLine();
                System.out.print("Enter the max speed of the locomotor: ");
                speed = keyboard.nextInt();
                robotShop.createPart(name, "locomotor", weight, cost, details, speed);
                System.out.println("\nA locomotor with name: " + name + ", part number: " + (robotShop.getNumMotors()-1) + ", weight: " + weight + ", cost: " + cost + ", description: \"" + details + "\", and max speed: " + speed + " has been created.");
                break;
            case "torso":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                keyboard.nextLine(); //buffer
                System.out.print("Enter a description for the robot part: ");
                details = keyboard.nextLine();
                System.out.print("Enter the number of battery compartments (1 to 3) in the torso: ");
                batts = keyboard.nextInt();
                while(batts > 3 || batts < 1)
                {
                    System.out.print("Not within range. Specify 1 to 3 battery compartments: ");
                    batts = keyboard.nextInt();
                }
                robotShop.createPart(name, "torso", weight, cost, details, batts);
                System.out.println("\nA torso with name: " + name + ", part number: " + (robotShop.getNumTorsos()-1) + ", weight: " + weight + ", cost: " + cost + ", description: \"" + details + "\", and battery compartments: " + batts + " has been created.");
                break;
            case "battery":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                keyboard.nextLine(); //buffer
                System.out.print("Enter a description for the robot part: ");
                details = keyboard.nextLine();
                System.out.print("Enter the energy of the battery: ");
                energy = keyboard.nextDouble();
                System.out.print("Enter the max power of the battery: ");
                power = keyboard.nextDouble();
                robotShop.createPart(name, "battery", weight, cost, details, energy, power);
                System.out.println("\nA batttery with name: " + name + ", part number: " + (robotShop.getNumBatts()-1) + ", weight: " + weight + ", cost: " + cost + ", description: \"" + details + "\", energy: " + energy + ", and max power: " + power + " has been created.");
                break;
            case "arm":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                keyboard.nextLine(); //buffer
                System.out.print("Enter a description for the robot part: ");
                details = keyboard.nextLine();
                robotShop.createPart(name, "arm", weight, cost, details);
                System.out.println("\nAn arm with name: " + name + ", part number: " + (robotShop.getNumArms()-1) + ", weight: " + weight + ", cost: " + cost + ", and description: \"" + details + "\" has been created.");
                break;
            default:
                System.out.println("\nThat is not one of the supported component types.");
                break;
        }    
        
    }
    
    private void createRobotModel()
    {
        String name;
        int search, batts;
        double price;
        boolean okay;
        Head head;
        Locomotor motor;
        Torso body;
        Battery battery1 = null, battery2 = null, battery3 = null;
        Arm arm1, arm2 = null;
        keyboard.nextLine(); //buffer
        System.out.print("Enter the name of the robot model: ");
        name = keyboard.nextLine();
        System.out.print("Enter the price of the robot model: ");
        price = keyboard.nextDouble();
        okay = true;
        while(okay)
        {
            System.out.print("Enter the part number of the head that the robot model will use: ");
            search = keyboard.nextInt();
            if(robotShop.getHead(search) != null)
                head = robotShop.getHead(search);
            else
            {
                System.out.println("\nA head with that part number could not be found in the shop.");
                okay = false;
                break;
            }
            System.out.print("Enter the part number of the locomotor that the robot model will use: ");
            search = keyboard.nextInt();
            if(robotShop.getLocomotor(search) != null)
                motor = robotShop.getLocomotor(search);
            else
            {
                System.out.println("\nA locomotor with that part number could not be found in the shop.");
                okay = false;
                break;
            }
            System.out.print("Enter the part number of the torso that the robot model will use: ");
            search = keyboard.nextInt();
            if(robotShop.getTorso(search) != null)
                body = robotShop.getTorso(search);
            else
            {
                System.out.println("\nA torso with that part number could not be found in the shop.");
                okay = false;
                break;
            }
            batts = body.getBatteryCompartments();
            if (batts >= 1)
            {
                System.out.print("Enter the part number of the battery that the robot model will use: ");
                search = keyboard.nextInt();
                if(robotShop.getBattery(search) != null)
                    battery1 = robotShop.getBattery(search);
                else
                {
                    System.out.println("\nA battery with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }
            }
            if (batts >= 2)
            {
                System.out.print("Enter the part number of the second battery that the robot model will use: ");
                search = keyboard.nextInt();
                if(robotShop.getBattery(search) != null)
                    battery2 = robotShop.getBattery(search);
                else
                {
                    System.out.println("\nA battery with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }
            }
            if (batts >= 3)
            {
                System.out.print("Enter the part number of the third battery that the robot model will use: ");
                search = keyboard.nextInt();
                if(robotShop.getBattery(search) != null)
                    battery3 = robotShop.getBattery(search);
                else
                {
                    System.out.println("\nA battery with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }
            }
            System.out.print("Enter the part number of the arm that the robot model will use: ");
            search = keyboard.nextInt();
            if(robotShop.getArm(search) != null)
                arm1 = robotShop.getArm(search);
            else
            {
                System.out.println("\nAn arm with that part number could not be found in the shop.");
                okay = false;
                break;
            }
            System.out.print("Enter the part number of the second arm that the robot model will use (or enter '-1' to not have a second arm): ");
            search = keyboard.nextInt();
            if(search != -1)
            {
                if(robotShop.getArm(search) != null)
                    arm2 = robotShop.getArm(search);
                else
                {
                    System.out.println("\nAn arm with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }
            }
            if(search == -1)
            {
                switch(batts){
                    case 1:
                        robotShop.createRobotModel(name, price, head, motor, body, battery1, arm1);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + (robotShop.getNumModels()-1) + ", price: " + price + ", a head, a locomotor, a torso with 1 battery compartment, and 1 arm has been created.");
                        break;
                    case 2:
                        robotShop.createRobotModel(name, price, head, motor, body, battery1, battery2, arm1);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + (robotShop.getNumModels()-1) + ", price: " + price + ", a head, a locomotor, a torso with 2 battery compartments, and 1 arm has been created.");
                        break;
                    case 3:
                        robotShop.createRobotModel(name, price, head, motor, body, battery1, battery2, battery3, arm1);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + (robotShop.getNumModels()-1) + ", price: " + price + ", a head, a locomotor, a torso with 3 battery compartments, and 1 arm has been created.");
                        break;
                }
            }
            else
            {
                switch(batts){
                    case 1:
                        robotShop.createRobotModel(name, price, head, motor, body, battery1, arm1, arm2);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + (robotShop.getNumModels()-1) + ", price: " + price + ", a head, a locomotor, a torso with 1 battery compartment, and 2 arms has been created.");
                        break;
                    case 2:
                        robotShop.createRobotModel(name, price, head, motor, body, battery1, battery2, arm1, arm2);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + (robotShop.getNumModels()-1) + ", price: " + price + ", a head, a locomotor, a torso with 2 battery compartments, and 2 arms has been created.");
                        break;
                    case 3:
                        robotShop.createRobotModel(name, price, head, motor, body, battery1, battery2, battery3, arm1, arm2);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + (robotShop.getNumModels()-1) + ", price: " + price + ", a head, a locomotor, a torso with 3 battery compartments, and 2 arms has been created.");
                        break;
                }
            }
            okay = false;
        }
    }
    
    public void createOrder()
    {
        String reply;
        boolean okay;
        final int MIN_YEAR = 2000, MAX_YEAR = 2020;
        int m, d, y, search, s;
        Date date;
        Customer cust;
        SalesAssoc sales;
        RobotModel model;
        Status status;
        
        System.out.print("Do you want to use today's date for the order? (Y/N): ");
        reply = keyboard.next();
        if(reply.toLowerCase().equals("y"))
        {
            date = new Date();
        }
        else
        {
            System.out.print("Enter the number of month of the order: ");
            m = keyboard.nextInt();
            while(m > 12 || m < 1)
            {
                System.out.print("Invalid month. Enter an integer between 1 and 12 (inclusive): ");
                m = keyboard.nextInt();
            }
            System.out.print("Enter the day of the order: ");
            d = keyboard.nextInt();
            while(d > 31 || d < 1)
            {
                System.out.print("Invalid day. Enter an integer between 1 and 31 (inclusive): ");
                d = keyboard.nextInt();
            }
            System.out.print("Enter the year of the order: ");
            y = keyboard.nextInt();
            while(y > MAX_YEAR || y < MIN_YEAR)
            {
                System.out.printf("Invalid year. Enter a integer between %d and %d (inclusive): ", MIN_YEAR, MAX_YEAR);
                y = keyboard.nextInt();
            }
            date = new Date(m, d, y);
        }
        okay = true;
        while(okay)
        {
            System.out.print("Enter the customer number of the customer associated with the order: ");
            search = keyboard.nextInt();
            if(robotShop.getCustomer(search) != null)
                cust = robotShop.getCustomer(search);
            else
            {
                System.out.println("\nA customer with that customer number could not be found in the shop.");
                okay = false;
                break;
            }
            System.out.print("Enter the employee number of the sales associate associated with the order: ");
            search = keyboard.nextInt();
            if(robotShop.getSalesAssoc(search) != null)
                sales = robotShop.getSalesAssoc(search);
            else
            {
                System.out.println("\nA sales associate with that employee number could not be found in the shop.");
                okay = false;
                break;
            }
            System.out.print("Enter the model number of the robot model associated with the order: ");
            search = keyboard.nextInt();
            if(robotShop.getRobotModel(search) != null)
                model = robotShop.getRobotModel(search);
            else
            {
                System.out.println("\nA robot model with that model number could not be found in the shop.");
                okay = false;
                break;
            }
            System.out.print("Enter the status of the order (0 - Processing, 1 - Working, 2 - Ready, 3 - Shipping, 4 - Completed): ");
            s = keyboard.nextInt();
            while(s > 4 || s < 0)
            {
                System.out.print("Invalid status. Enter an integer between 0 and 4 (inclusive): ");
                s = keyboard.nextInt();
            }
            status = new Status(s);
            robotShop.placeOrder(date, cust, sales, model, status);
            System.out.println("\nOrder number " + (robotShop.getNumOrders()-1) + " for robot model " + model.getModelNumber() + " has been placed on " + date + " by a sales associate for a customer.\nThe status of the order is: " + status);
            okay = false;
        }
    }
    
    public void createCustomer()
    {
        String name;
        
        keyboard.nextLine(); //buffer
        System.out.print("Enter the name of the customer: ");
        name = keyboard.nextLine();
        robotShop.newCustomer(name);
        System.out.println("\nA customer of name " + name + " and number " + (robotShop.getNumCustomers()-1) + " has been added to the shop.");
    }
    
    public void createSalesAssoc()
    {
        String name;
        
        keyboard.nextLine(); //buffer
        System.out.print("Enter the name of the sales associate: ");
        name = keyboard.nextLine();
        robotShop.newSalesAssoc(name);
        System.out.println("\nA sales associate of name " + name + " and employee number " + (robotShop.getNumStaff()-1) + " has been added to the shop.");
    }
    
    private void reportMenu(){
        int choice3;
        choice3 = 0;
        while(choice3 != 6)
        {
            System.out.println("\n ===== Report Menu =====");
            System.out.println("  1) Order");
            System.out.println("  2) Customers");
            System.out.println("  3) Sales Associates");
            System.out.println("  4) Robot Models");
            System.out.println("  5) Robot Parts");
            System.out.println("  6) Return to Main Menu");
            System.out.println(" =======================");
            System.out.println(" Select an option by inputting the corresponding number.");
            System.out.print(" > ");
            choice3 = keyboard.nextInt();
            while(choice3 > 6 || choice3 < 1)
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
                System.out.println(" Please input a number between 1-6.");
                System.out.print(" > ");
                choice3 = keyboard.nextInt();
            }
            switch(choice3)
            {
                case 1:
                    viewOrders();
                    break;
                case 2:
                    viewCustomers();
                    break;
                case 3:
                    viewSalesAssocs();
                    break;
                case 4:
                    viewRobotModels();
                    break;
                case 5:
                    viewRobotParts();
                    break;
                case 6:
                    break;
            }
        }  
    }
    
    public void viewOrders()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewOrders();
            System.out.println("=======================");
            System.out.println(" View an order by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumOrders())
            {
                System.out.println(robotShop.getOrder(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewCustomers()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewCustomers();
            System.out.println("=======================");
            System.out.println(" View a customer by inputting their corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumCustomers())
            {
                System.out.println(robotShop.getCustomer(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewSalesAssocs()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewStaff();
            System.out.println("=======================");
            System.out.println(" View a sales associate by inputting their corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumStaff())
            {
                System.out.println(robotShop.getSalesAssoc(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewRobotModels()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewModels();
            System.out.println("=======================");
            System.out.println(" View a robot by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumModels())
            {
                System.out.println(robotShop.getRobotModel(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    private void viewRobotParts(){
        int choice4;
        choice4 = 0;
        while(choice4 != 6)
        {
            System.out.println("\n ===== View Robot Parts =====");
            System.out.println("  1) Heads");
            System.out.println("  2) Locomotors");
            System.out.println("  3) Torsos");
            System.out.println("  4) Batteries");
            System.out.println("  5) Arms");
            System.out.println("  6) Return to Report Menu");
            System.out.println(" =======================");
            System.out.println(" Select an option by inputting the corresponding number.");
            System.out.print(" > ");
            choice4 = keyboard.nextInt();
            while(choice4 > 6 || choice4 < 1)
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
                System.out.println(" Please input a number between 1-6.");
                System.out.print(" > ");
                choice4 = keyboard.nextInt();
            }
            switch(choice4)
            {
                case 1:
                    viewHeads();
                    break;
                case 2:
                    viewMotors();
                    break;
                case 3:
                    viewTorsos();
                    break;
                case 4:
                    viewBatteries();
                    break;
                case 5:
                    viewArms();
                    break;
                case 6:
                    break;
            }
        }  
    }
    
    public void viewHeads()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewHeads();
            System.out.println("=======================");
            System.out.println(" View a head by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumHeads())
            {
                System.out.println(robotShop.getHead(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewArms()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewArms();
            System.out.println("=======================");
            System.out.println(" View an arm by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumArms())
            {
                System.out.println(robotShop.getArm(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewMotors()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewMotors();
            System.out.println("=======================");
            System.out.println(" View a locomotor by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumMotors())
            {
                System.out.println(robotShop.getLocomotor(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewTorsos()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewTorsos();
            System.out.println("=======================");
            System.out.println(" View a torso by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumTorsos())
            {
                System.out.println(robotShop.getTorso(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public void viewBatteries()
    {
        int num = 0;
        while(num != -1)
        {
            System.out.println("=======================");
            robotShop.viewBatteries();
            System.out.println("=======================");
            System.out.println(" View a battery by inputting its corresponding number. (Input '-1' to exit.)");
            System.out.print(" > ");
            num = keyboard.nextInt();
            if(num == -1)
                break;
            else if(num >= 0 && num < robotShop.getNumBatts())
            {
                System.out.println(robotShop.getBattery(num));
            }
            else
            {
                System.out.println("\n The number inputted does not exist within the range of the options.");
            }       
        }
    }
    
    public static void main(String [] args) throws IOException
    {
        CLI test = new CLI();
        test.startCLI();
    }
    
}
