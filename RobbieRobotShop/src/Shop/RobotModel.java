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
    private static int numRobots;
    
    public RobotModel()
    {
        name = String.format("Robot%4d", numRobots++);
        price = 200;
        modelNumber = 1;
        robotParts = new ArrayList<>();
    }
    
    public RobotModel(String name, int modelNumber, double price, ArrayList<RobotPart> robotParts)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.robotParts = robotParts;
        numRobots++;
    }
    
    public RobotModel(String name, int modelNumber, double price, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1)
    {
        this.name = name;                                   // Constructor for a robot with 1 battery and 1 arm
        this.modelNumber = modelNumber;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(arm1);
        numRobots++;
    }
    
    public RobotModel(String name, int modelNumber, double price, Head head, Locomotor motor, Torso body, Battery b1, Arm arm1, Arm arm2)
    {
        this.name = name;                                   // Constructor for a robot with 1 battery and 2 arm
        this.modelNumber = modelNumber;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(arm1);
        robotParts.add(arm2);
        numRobots++;
    }
    
    public RobotModel(String name, int modelNumber, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1)
    {
        this.name = name;                                   // Constructor for a robot with 2 battery and 1 arm
        this.modelNumber = modelNumber;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(arm1);
        numRobots++;
    }
    
    public RobotModel(String name, int modelNumber, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Arm arm1, Arm arm2)
    {
        this.name = name;                                   // Constructor for a robot with 2 battery and 2 arm
        this.modelNumber = modelNumber;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(arm1);
        robotParts.add(arm2);
        numRobots++;
    }
    
    public RobotModel(String name, int modelNumber, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1)
    {
        this.name = name;                                   // Constructor for a robot with 3 battery and 1 arm
        this.modelNumber = modelNumber;
        this.price = price;
        robotParts = new ArrayList<>();
        robotParts.add(head);
        robotParts.add(motor);
        robotParts.add(body);
        robotParts.add(b1);
        robotParts.add(b2);
        robotParts.add(b3);
        robotParts.add(arm1);
        numRobots++;
    }
    
    public RobotModel(String name, int modelNumber, double price, Head head, Locomotor motor, Torso body, Battery b1, Battery b2, Battery b3, Arm arm1, Arm arm2)
    {
        this.name = name;                                   // Constructor for a robot with 3 battery and 2 arm
        this.modelNumber = modelNumber;
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
        numRobots++;
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
  
    
    
}
