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
    private int numRobots;
    
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
    
    // This is missing RobotPart[] - Ody
    
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
