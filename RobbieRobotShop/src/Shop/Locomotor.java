/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.awt.image.RenderedImage;

/**
 *
 * @author Kallippso
 */
public class Locomotor extends RobotPart{
    private int maxSpeed;
    private String name;
    private int partNumber;
    private ComponentType componentType = new ComponentType("Locomotor", this.getClass());
    private double weight;
    private double cost;
    private String description;
    private RenderedImage image;
    
    public Locomotor() {
        maxSpeed = -1;
    }
    
    public Locomotor(String name, double weight, double cost, String description, int speed)
    {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.maxSpeed = speed;
    }
    
    public Locomotor(String name, ComponentType componentType, double weight, double cost, String description, int speed)
    {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.maxSpeed = speed;
    }
    
    public Locomotor(String name, ComponentType componentType, double weight, double cost, String description, RenderedImage image)
    {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
    }
    
    public Locomotor(String name, ComponentType componentType, double weight, double cost, String description, RenderedImage image, int speed)
    {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
        this.maxSpeed = speed;
    }
    
    public Locomotor(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public Locomotor(String name, int partNumber, double weight, double cost, String description, int value)
    {
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.maxSpeed = value;
    }
    
    public int getMaxSpeed(){
        return maxSpeed; 
    }
    
    public void setMaxSpeed(int speed){
        this.maxSpeed = speed;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPartNumber()
    {
        return partNumber;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public ComponentType getComponentType()
    {
        return componentType;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public RenderedImage getImage()
    {
        return image;
    }
    
    
    protected void setName(String name)
    {
        this.name = name;
    }
    
    protected void setPartNumber(int partNumber)
    {
        this.partNumber = partNumber;
    }
    
    protected void setDescription(String description)
    {
        this.description = description;
    }
    
    protected void setComponentType(ComponentType componentType)
    {
        this.componentType = componentType;
    }
    
    protected void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    protected void setCost(double cost)
    {
        this.cost = cost;
    }
    
    protected void setImage(RenderedImage image)
    {
        this.image = image;
    }
    
    public int powerComsumed(int speed){
        speed = speed;
        return speed;
     }
}
