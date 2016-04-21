
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
    private static int numArms = 0;
    
    //constructors
    public Arm(){
        name = "ARMin";
        partNumber = numArms++;
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
        numArms++;
    }
    public Arm(String name, int partNumber, double weight, double cost, String description){
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        numArms++;
    }
    
    public Arm(String name, ComponentType type, double weight, double cost, String description, RenderedImage image){
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        image = image;
        numArms++;
    }
    
    public Arm(String name, double weight, double cost, String description){
        this.name = name;
        this.partNumber = numArms++;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
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
    
    public int powerConsumed(int speed){
        int time = 1;
        int watts = speed*time;
        return watts;
    }
    
    @Override
    public String shortPrint()
    {
        return String.format("[Arm]\tName: %15s \t Part Number: %d", name, partNumber);
    }
    
    @Override
    public String toString()
    {
        String results = "\nName: " + name;
        results += "\nComponent Type: arm";
        results += "\nPart Number: " + partNumber;
        results += "\nWeight: " + weight;
        results += "\nCost: " + cost;
        results += "\nDescription: " + description;
        
        return results;
    }
    
    public String save()
    {
        return String.format("%s//%f//%.2f//%s\n", name, weight, cost, description);
    }
    
    public static void main()
    {
        Arm testArm = new Arm();
        
    }
}
