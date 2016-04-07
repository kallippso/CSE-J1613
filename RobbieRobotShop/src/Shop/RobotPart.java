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
public abstract class RobotPart {
    private String name;
    private int partNumber;
    private ComponentType componentType;
    private double weight;
    private double cost;
    private String description;
    private RenderedImage image;
    
    public RobotPart()
    {
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
