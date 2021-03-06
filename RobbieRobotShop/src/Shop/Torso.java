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
public class Torso extends RobotPart{
    private final int batteryCompartments;
    private Head head;
    private Arm[] arms;
    private Locomotor locomotor;
    private Battery[] batteries;
    
    private int numTorsos = 1;
    private String name;
    private int partNumber;
    private ComponentType componentType;
    private double weight;
    private double cost;
    private String description;
    private RenderedImage image;
    private static int numTorsos2 = 0;
    
    public Torso()
    {
        batteryCompartments = 2;
        head = null;
        arms = null;
        locomotor = null;
        batteries = null;
        name = "Torso #" + numTorsos;
        partNumber = 50000 + numTorsos++;
        weight = 40;
        cost = 200;
        description = "The body of the system and unit where all other parts are connected.";
        image = null;
        componentType = new ComponentType("Torso", this.getClass());
    }
    
    public Torso(int batteryCompartments, Head head, Arm[] arms, Locomotor locomotor, Battery[] batteries, String name, ComponentType componentType, double weight, double cost, String description, RenderedImage image)
    {
        this.batteryCompartments = batteryCompartments;
        this.batteries = batteries;
        this.arms = arms;
        this.head = head;
        this.locomotor = locomotor;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = image;
        this.componentType = componentType;
        numTorsos2++;
    }
    
    public Torso(String name, int partNumber, double weight, double cost, String description, int value)
    {
        this.name = name;
        this.partNumber = partNumber;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        batteryCompartments = value;
        head = null;
        arms = new Arm[2];
        locomotor = null;
        batteries = new Battery[value];
        numTorsos2++;
    }
    
    public Torso(String name, double weight, double cost, String description, int value)
    {
        this.name = name;
        this.partNumber = numTorsos2++;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
        this.image = null;
        batteryCompartments = value;
        head = null;
        arms = new Arm[2];
        locomotor = null;
        batteries = new Battery[value];
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
    
    public int getBatteryCompartments()
    {
        return batteryCompartments;
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
    
    public Head getHead()
    {
        return head;
    }
    
    public Arm[] getArms()
    {
        return arms;
    }
    
    public Battery[] getBatteries()
    {
        return batteries;
    }
    
    public Locomotor getLocomotor()
    {
        return locomotor;
    }
    
    protected void setHead(Head head)
    {
        this.head = head;
    }
    
    protected void setArms(Arm[] arms)
    {
        this.arms = arms;
    }
    
    protected void setBatteries(Battery[] batteries)
    {
        this.batteries = batteries;

    }
    
    protected void setLocomotor(Locomotor locomotor)
    {
        this.locomotor = locomotor;
    }
    
    @Override
    public String shortPrint()
    {
        return String.format("[Torso]\tName: %15s \t Part Number: %d", name, partNumber);
    }
    
    @Override
    public String toString()
    {
        String results = "\nName: " + name;
        results += "\nComponent Type: torso";
        results += "\nPart Number: " + partNumber;
        results += "\nWeight: " + weight;
        results += "\nCost: " + cost;
        results += "\nBattery Compartments: " + batteryCompartments;
        results += "\nDescription: " + description;
        
        return results;
    }
    
    public String save()
    {
        return String.format("%s//%f//%.2f//%s//%d\n", name, weight, cost, description, batteryCompartments);
    }
   
}
