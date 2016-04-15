/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.awt.image.RenderedImage;

/**
 *
 * @author christian
 */
public class Head extends RobotPart
{
    private int numHeads = 1;
    private String name;
    private int partNumber;
    private ComponentType componentType;
    private double weight;
    private double cost;
    private String description;
    private RenderedImage image;
    
    public Head()
    {
        name = "Head #" + numHeads;
        partNumber = 10000 + numHeads++;
        weight = 40;
        cost = 200;
        description = "Housing the main processing unit of the robot, the head is truly an innovative and impressive part.";
        image = null;
        componentType = new ComponentType("Head", this.getClass());
    }
    
    public Head(String name, ComponentType componentType, double weight, double cost, String description, RenderedImage image)
    {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
        this.componentType = componentType;
    }
    
    public Head(String name, int partNumber, double weight, double cost, String description)
    {
        this.name = name;
        this.partNumber = partNumber;
        this.componentType = new ComponentType("Head", this.getClass());
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
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
}
