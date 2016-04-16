/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * @author Kallippso
 */

import java.awt.image.RenderedImage;

public class Battery extends RobotPart{

    private double energy;
    private double maxPower;
    private String name;
    private int partNumber;
    private ComponentType componentType = new ComponentType("Battery", this.getClass());
    private double weight;
    private double cost;
    private String description;
    private RenderedImage image;
    private static int numBatteries = 0;
    
    public Battery(){
        this.partNumber = numBatteries++;
        energy = -1;
        maxPower = -1;
}
    public Battery (double energy, double maxPower){
        this.partNumber = numBatteries++;
        this.energy = energy;
        this.maxPower = maxPower;
    }
    
    public Battery(String name, ComponentType componentType, double weight, double cost, String description, RenderedImage image)
    {
        this.name = name;
        this.partNumber = numBatteries++;
        this.componentType = componentType;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
        this.energy = 0;
        this.maxPower = 0;
    }
    
    public Battery(String name, int num, ComponentType componentType, double weight, double cost, String description, RenderedImage image)
    {
        this.name = name;
        this.partNumber = num;
        this.componentType = componentType;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
        this.energy = 0;
        this.maxPower = 0;
        numBatteries++;
    }
    
    public Battery(String name, int num, ComponentType componentType, double weight, double cost, String description, double energy, double maxPower)
    {
        this.name = name;
        this.partNumber = num;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.energy = energy;
        this.maxPower = maxPower;
        numBatteries++;
    }
    
    public Battery(String name, int num, ComponentType componentType, double weight, double cost, String description, RenderedImage image, double energy, double maxPower)
    {
        this.name = name;
        this.partNumber = num;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
        this.energy = energy;
        this.maxPower = maxPower;
        numBatteries++;
    }
    
    public Battery(String name, int num, String type, double weight, double cost, String description, double energy, double power)
    {
        this.name = name;
        this.partNumber = num;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.energy = energy;
        this.maxPower = power;
        numBatteries++;
    }
    
    public Battery(String name, int partNumber, double weight, double cost, String description, double energy, double power)
    {
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.energy = energy;
        this.maxPower = power;
        numBatteries++;
    }
    
    public Battery(String name, double weight, double cost, String description, double energy, double power)
    {
        this.name = name;
        this.partNumber = numBatteries++;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        this.energy = energy;
        this.maxPower = power;
    }
    
    public double getEnergy(){
        return energy;
    }
    public double getMaxPower(){
        return maxPower;
    }
    public void setEnergy(double energy)
    {
        this.energy = energy;
    }
    public void setMaxPower(double power)
    {
        this.maxPower = power;
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
