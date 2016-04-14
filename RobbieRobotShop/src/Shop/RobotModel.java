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
    int numRobotParts;
    
    public RobotModel()
    {
        name = String.format("Robot%4d", numRobotParts++);
        price = 200;
        modelNumber = 1;
    }
    
    public RobotModel(String name, int modelNumber, double price, RobotPart[] robotParts)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.robotParts = robotParts;
        numRobotParts++;
    }
    
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
