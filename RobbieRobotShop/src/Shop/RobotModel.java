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
public class RobotModel {
    private String name;
    int modelNumber;
    double price;
    RobotPart[] robotParts;
    int numRobots;
    
    public RobotModel()
    {
        name = String.format("Robot%4d", numRobots++);
        price = 200;
        modelNumber = 1;
    }
    
    public RobotModel(String name, int modelNumber, double price, RobotPart[] robotParts)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.robotParts = robotParts;
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
