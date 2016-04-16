
package Shop;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the class defining a robot Arm
 */

import java.awt.image.RenderedImage;

public class Arm extends RobotPart{
    
    //private instance variables
    private final ComponentType componentType = new ComponentType("Arm", this.getClass());
    private String name, description;
    private int partNumber;
    private double weight, cost;
    private RenderedImage image;
    
    //constructors
    public Arm(){
        name = "ARMin";
        partNumber = -1;
        weight = -1;
        cost = -1;
        description = "An arm.";
        image = null;
    }
    
    public Arm(String name, int partNumber, double weight, double cost){
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        description = "An arm.";
        image = null;
    }
    public Arm(String name, int partNumber, double weight, double cost, String description){
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        image = null;
    }
    
    public Arm(String name, ComponentType type, int partNumber, double weight, double cost, String description){
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        image = null;
    }

    //methods
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPartNumber(int num)
    {
        this.partNumber = num;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setDescription(String details)
    {
        this.description = details;
    }
    public void setImage(RenderedImage image)
    {
        this.image = image;
    }
    public String getName()
    {
        return name;
    }
    public ComponentType getComponentType()
    {
        return componentType;
    }
    public int getPartNumber()
    {
        return partNumber;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getCost()
    {
        return cost;
    }
    public String getDescription()
    {
        return description;
    }
    public RenderedImage getImage()
    {
        return image;
    }
    
    int powerConsumed(int speed){
        int time = 1;
        int watts = speed*time;
        return watts;
    }
    
    //insert method to override from abstract class RobotPart here...
    
    public static void main()
    {
        Arm testArm = new Arm();
        
    }
}
