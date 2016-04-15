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
<<<<<<< HEAD
    int modelNumber;
    double price;
    RobotPart[] robotParts;
    int numRobotParts;
=======
    private int modelNumber;
    private double price;
    private ArrayList<RobotPart> robotParts;
    private int numRobots;
>>>>>>> origin/master
    
    public RobotModel()
    {
        name = String.format("Robot%4d", numRobotParts++);
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
        numRobotParts++;
    }
    
<<<<<<< HEAD
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
    
    public RobotPart[] getRobotParts()
    {
        return robotParts;
    }
    
    public int getNumRobotParts()
    {
        return numRobotParts;
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
    
    public void setRobotParts(RobotPart[] robotParts)
    {
        this.robotParts = robotParts;
    }
=======
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
    
    // This is missing RobotPart[] - Ody
>>>>>>> origin/master
    
    public double componentCost()
    {
        return price/robotParts.length;
    }
    
    public double maxSpeed()
    {
        int sum = 0;
        for(RobotPart r: robotParts)
            sum += r.getWeight();
        
        return 500/ (sum/robotParts.length);
    }
  
    
    
}
