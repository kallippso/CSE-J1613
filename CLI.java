
package j1613;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the Command Line Interface for the Robot Shop
 */

import java.util.Scanner;

public class CLI {
    
    Scanner keyboard = new Scanner(System.in);
    int choice;
    //Shop robotShop = new Shop();
    
    public CLI()
    {
        
    }
    
    public void startCLI(){
        choice = 0;
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
                    System.out.println("This option has not been implemented in the current build.");
                    break;
                case 3:
                    System.out.println("This option has not been implemented in the current build.");
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
                    System.out.println("This functionality has not been implemented in the current build.");
                    break;
                case 2:
                    System.out.println("This functionality has not been implemented in the current build.");
                    break;
                case 3:
                    System.out.println("This functionality has not been implemented in the current build.");
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
        int partNum, speed, batts;
        double weight, cost, energy, power;
        System.out.print("What kind of component would you like to make?\n > ");
        reply = keyboard.next();
        switch(reply.toLowerCase())
        {
            case "head":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the part number of the robot part: ");
                partNum = keyboard.nextInt();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                System.out.print("Enter a description for the robot part: ");
                keyboard.nextLine(); //buffer
                details = keyboard.nextLine();
                //robotShop.createPart(name, partNum, "head", weight, cost, details);
                System.out.println("\nA head with name: " + name + ", part number: " + partNum + ", weight: " + weight + ", cost: " + cost + ", and description: \"" + details + "\" has been created.");
                break;
            case "locomotor":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the part number of the robot part: ");
                partNum = keyboard.nextInt();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                System.out.print("Enter a description for the robot part: ");
                keyboard.nextLine(); //buffer
                details = keyboard.nextLine();
                System.out.print("Enter the max speed of the locomotor: ");
                speed = keyboard.nextInt();
                //robotShop.createPart(name, partNum, "locomotor", weight, cost, details, speed);
                System.out.println("\nA locomotor with name: " + name + ", part number: " + partNum + ", weight: " + weight + ", cost: " + cost + ", description: \"" + details + "\", and max speed: " + speed + " has been created.");
                break;
            case "torso":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the part number of the robot part: ");
                partNum = keyboard.nextInt();
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
                //robotShop.createPart(name, partNum, "torso", weight, cost, details, batts);
                System.out.println("\nA torso with name: " + name + ", part number: " + partNum + ", weight: " + weight + ", cost: " + cost + ", description: \"" + details + "\", and battery compartments: " + batts + " has been created.");
                break;
            case "battery":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the part number of the robot part: ");
                partNum = keyboard.nextInt();
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
                //robotShop.createPart(name, partNum, "battery", weight, cost, details, energy, power);
                System.out.println("\nA batttery with name: " + name + ", part number: " + partNum + ", weight: " + weight + ", cost: " + cost + ", description: \"" + details + "\", energy: " + energy + ", and max power: " + power + " has been created.");
                break;
            case "arm":
                keyboard.nextLine(); //buffer
                System.out.print("Enter the name of the robot part: ");
                name = keyboard.nextLine();
                System.out.print("Enter the part number of the robot part: ");
                partNum = keyboard.nextInt();
                System.out.print("Enter the weight of the robot part: ");
                weight = keyboard.nextDouble();
                System.out.print("Enter the cost of the robot part: ");
                cost = keyboard.nextDouble();
                keyboard.nextLine(); //buffer
                System.out.print("Enter a description for the robot part: ");
                details = keyboard.nextLine();
                //robotShop.createPart(name, partNum, "arm", weight, cost, details);
                System.out.println("\nAn arm with name: " + name + ", part number: " + partNum + ", weight: " + weight + ", cost: " + cost + ", and description: \"" + details + "\" has been created.");
                break;
            default:
                System.out.println("\nThat is not one of the supported component types.");
                break;
        }    
        
    }
    
    private void createRobotModel()
    {
        String reply;
        String name;
        int num, search, batts;
        double price;
        boolean okay;
        //Head head;
        //Locomotor motor;
        //Torso body;
        //Battery battery1, battery2, battery3;
        //Arm arm1, arm2;
        keyboard.nextLine(); //buffer
        System.out.print("Enter the name of the robot model: ");
        name = keyboard.nextLine();
        System.out.print("Enter the model number of the robot model: ");
        num = keyboard.nextInt();
        System.out.print("Enter the price of the robot model: ");
        price = keyboard.nextDouble();
        okay = true;
        while(okay)
        {
            System.out.print("Enter the part number of the head that the robot model will use: ");
            search = keyboard.nextInt();
            /*if(robotShop.getRobotPart(search) != null)
                head = robotShop.getRobotPart(search);
            else
            {
                System.out.println("\nA head with that part number could not be found in the shop.");
                okay = false;
                break;
            }*/
            System.out.print("Enter the part number of the locomotor that the robot model will use: ");
            search = keyboard.nextInt();
            /*if(robotShop.getRobotPart(search) != null)
                motor = robotShop.getRobotPart(search);
            else
            {
                System.out.println("\nA locomotor with that part number could not be found in the shop.");
                okay = false;
                break;
            }*/
            System.out.print("Enter the part number of the torso that the robot model will use: ");
            search = keyboard.nextInt();
            /*if(robotShop.getRobotPart(search) != null)
                body = robotShop.getRobotPart(search);
            else
            {
                System.out.println("\nA torso with that part number could not be found in the shop.");
                okay = false;
                break;
            }*/
            //batts = body.getBatteryCompartments();
            batts = 3;
            if (batts >= 1)
            {
                System.out.print("Enter the part number of the battery that the robot model will use: ");
                search = keyboard.nextInt();
                /*if(robotShop.getRobotPart(search) != null)
                    battery1 = robotShop.getRobotPart(search);
                else
                {
                    System.out.println("\nA battery with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }*/
            }
            if (batts >= 2)
            {
                System.out.print("Enter the part number of the second battery that the robot model will use: ");
                search = keyboard.nextInt();
                /*if(robotShop.getRobotPart(search) != null)
                    battery2 = robotShop.getRobotPart(search);
                else
                {
                    System.out.println("\nA battery with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }*/
            }
            if (batts >= 3)
            {
                System.out.print("Enter the part number of the third battery that the robot model will use: ");
                search = keyboard.nextInt();
                /*if(robotShop.getRobotPart(search) != null)
                    battery3 = robotShop.getRobotPart(search);
                else
                {
                    System.out.println("\nA battery with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }*/
            }
            System.out.print("Enter the part number of the arm that the robot model will use: ");
            search = keyboard.nextInt();
            /*if(robotShop.getRobotPart(search) != null)
                arm1 = robotShop.getRobotPart(search);
            else
            {
                System.out.println("\nAn arm with that part number could not be found in the shop.");
                okay = false;
                break;
            }*/
            System.out.print("Enter the part number of the second arm that the robot model will use (or enter '-1' to not have a second arm): ");
            search = keyboard.nextInt();
            /*if(search != -1)
            {
                if(robotShop.getRobotPart(search) != null)
                    arm2 = robotShop.getRobotPart(search);
                else
                {
                    System.out.println("\nAn arm with that part number could not be found in the shop.");
                    okay = false;
                    break;
                }
            }*/
            if(search == -1)
            {
                switch(batts){
                    case 1:
                        //robotShop.createRobotModel(name, num, price, head, motor, body, battery1, arm1);
                        break;
                    case 2:
                        //robotShop.createRobotModel(name, num, price, head, motor, body, battery1, battery2, arm1);
                        break;
                    case 3:
                        //robotShop.createRobotModel(name, num, price, head, motor, body, battery1, battery2, battery3, arm1);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + num + ", price: " + price + ", a head, a locomotor, a torso with 3 battery compartments, and 1 arm has been created.");
                        break;
                }
            }
            else
            {
                switch(batts){
                    case 1:
                        //robotShop.createRobotModel(name, num, price, head, motor, body, battery1, arm1, arm2);
                        break;
                    case 2:
                        //robotShop.createRobotModel(name, num, price, head, motor, body, battery1, battery2, arm1, arm2);
                        break;
                    case 3:
                        //robotShop.createRobotModel(name, num, price, head, motor, body, battery1, battery2, battery3, arm1, arm2);
                        System.out.println("\nA robot model with name: " + name + ", model number: " + num + ", price: " + price + ", a head, a locomotor, a torso with 3 battery compartments, and 2 arms has been created.");
                        break;
                }
            }
            okay = false;
        }
    }
    
    public static void main(String [] args)
    {
        CLI test = new CLI();
        test.startCLI();
    }
    
}
