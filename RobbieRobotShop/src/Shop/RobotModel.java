/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * @author christian
 */

import java.util.ArrayList;

public class RobotModel {
    private String name;
    private int modelNumber;
    private double price;
    private ArrayList<RobotPart> robotParts;
    private int numRobotParts;
    private static int numRobots = 0;
    
    public RobotModel()
    {
        name = String.format("Robot%4d", numRobots);
        price = 200;
        modelNumber = numRobots++;
        robotParts = new ArrayList<>();
    }
    
    public RobotModel(String name, int modelNumber, double price, ArrayList<RobotPart> robotParts)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.robotParts = robotParts;
        numRobotParts = robotParts.size();
        numRobots++;
    }
    
    public RobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1)
    {
        this.name = name;                                   // Constructor for a robot with 1 battery and 1 arm
        this.modelNumber = numRobots++;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(arm1);
        numRobotParts = 5;
    }
    
    public RobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1, Arm arm2)
    {
        this.name = name;                                   // Constructor for a robot with 1 battery and 2 arm
        this.modelNumber = numRobots++;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(arm1);
        robotParts.add(arm2);
        numRobotParts = 6;
    }
    
    public RobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1)
    {
        this.name = name;                                   // Constructor for a robot with 2 battery and 1 arm
        this.modelNumber = numRobots++;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(arm1);
        numRobotParts = 6;
    }
    
    public RobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1, Arm arm2)
    {
        this.name = name;                                   // Constructor for a robot with 2 battery and 2 arm
        this.modelNumber = numRobots++;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(arm1);
        robotParts.add(arm2);
        numRobotParts = 7;
    }
    
    public RobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1)
    {
        this.name = name;                                   // Constructor for a robot with 3 battery and 1 arm
        this.modelNumber = numRobots++;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(b3);
        robotParts.add(arm1);
        numRobotParts = 7;
    }
    
    public RobotModel(String name, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1, Arm arm2)
    {
        this.name = name;                                   // Constructor for a robot with 3 battery and 2 arm
        this.modelNumber = numRobots++;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(b3);
        robotParts.add(arm1);
        robotParts.add(arm2);
        numRobotParts = 8;
    }
    
    // This is missing RobotPart[] - Ody
    
    public String getName()
    {
        return name;
    }
    
    public int getModelNumber()
    {
        return modelNumber;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public ArrayList<RobotPart> getRobotParts()
    {
        return robotParts;
    }
    
    public int getNumRobots()
    {
        return numRobots;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setModelNumber(int modelNumber)
    {
        this.modelNumber = modelNumber;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setRobotParts(ArrayList<RobotPart> robotParts)
    {
        this.robotParts = robotParts;
    }
    
    public double componentCost()
    {
        int i = 0;
        double cost = 0;
        while(i < robotParts.size())
        {
            cost += robotParts.get(i).getCost();
            i++;
        }
        return cost;
    }
    
    public double maxSpeed()
    {
        int sum = 0;
        for(RobotPart r: robotParts)
            sum += r.getWeight();
        
        return 500/ (sum/robotParts.size());
    }
    
    public String shortPrint()
    {
        return String.format("Name: %25s \t Model Number: %d", name, modelNumber);
    }
    
    @Override
    public String toString()
    {
        String results = "\nName: " + name;
        results += "\nModel Number: " + modelNumber;
        results += "\nPrice: " + price;
        results += "\nRobot Parts:\n";
        int i = 0;
        while(i < robotParts.size())
        {
            results += String.format("\t%d) %s\n", i, robotParts.get(i).shortPrint());
            i++;
        }
        
        return results;
    }
    
    public String save()
    {
        if(numRobotParts == 5)
            return String.format("5//%s//%.2f//%d//%d//%d//%d//%d\n", name, price, robotParts.get(0).getPartNumber(), robotParts.get(1).getPartNumber(), robotParts.get(2).getPartNumber(), robotParts.get(3).getPartNumber(), robotParts.get(4).getPartNumber());
        else if(numRobotParts == 6)
        {
            if( ((Torso)robotParts.get(2)).getBatteryCompartments() == 1)
                return String.format("6//1//%s//%.2f//%d//%d//%d//%d//%d//%d\n", name, price, robotParts.get(0).getPartNumber(), robotParts.get(1).getPartNumber(), robotParts.get(2).getPartNumber(), robotParts.get(3).getPartNumber(), robotParts.get(4).getPartNumber(), robotParts.get(5).getPartNumber());
            else if( ((Torso)robotParts.get(2)).getBatteryCompartments() == 2)
                return String.format("6//2//%s//%.2f//%d//%d//%d//%d//%d//%d\n", name, price, robotParts.get(0).getPartNumber(), robotParts.get(1).getPartNumber(), robotParts.get(2).getPartNumber(), robotParts.get(3).getPartNumber(), robotParts.get(4).getPartNumber(), robotParts.get(5).getPartNumber());
            else
                return "Error";
        }
        else if(numRobotParts == 7)
        {
            if( ((Torso)robotParts.get(2)).getBatteryCompartments() == 2)
                return String.format("7//2//%s//%.2f//%d//%d//%d//%d//%d//%d//%d\n", name, price, robotParts.get(0).getPartNumber(), robotParts.get(1).getPartNumber(), robotParts.get(2).getPartNumber(), robotParts.get(3).getPartNumber(), robotParts.get(4).getPartNumber(), robotParts.get(5).getPartNumber(), robotParts.get(6).getPartNumber());
            else if( ((Torso)robotParts.get(2)).getBatteryCompartments() == 3)
                return String.format("7//3//%s//%.2f//%d//%d//%d//%d//%d//%d//%d\n", name, price, robotParts.get(0).getPartNumber(), robotParts.get(1).getPartNumber(), robotParts.get(2).getPartNumber(), robotParts.get(3).getPartNumber(), robotParts.get(4).getPartNumber(), robotParts.get(5).getPartNumber(), robotParts.get(6).getPartNumber());
            else
                return "Error";
        }
        else if(numRobotParts == 8)
        {
            return String.format("8//%s//%.2f//%d//%d//%d//%d//%d//%d//%d//%d\n", name, price, robotParts.get(0).getPartNumber(), robotParts.get(1).getPartNumber(), robotParts.get(2).getPartNumber(), robotParts.get(3).getPartNumber(), robotParts.get(4).getPartNumber(), robotParts.get(5).getPartNumber(), robotParts.get(6).getPartNumber(), robotParts.get(7).getPartNumber());
        }
        else
            return "Error";
    }
    
}
