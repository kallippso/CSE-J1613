/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.ArrayList;

public class SalesAssoc
{
   
    private String name;
    private int employeeNumber;
    private ArrayList<Order> orders; 
    private static int numEmployees = 0;
    
    public SalesAssoc()
    {
        name = "test";
        employeeNumber = numEmployees++;
        orders = new ArrayList<>();
    }
    
    public SalesAssoc(String name)
    {
        this.name = name;
        employeeNumber = numEmployees++;
        orders = new ArrayList<>();
    }
    
    public SalesAssoc(String name, int employeeNumber)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        orders = new ArrayList<>();
        numEmployees++;
    }   
    
    public SalesAssoc(String name, int employeeNumber, ArrayList<Order> orders)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.orders = orders;
        numEmployees++;
    }
    
    public SalesAssoc(String name, ArrayList<Order> orders)
    {
        this.name = name;
        this.employeeNumber = numEmployees++;
        this.orders = orders;
    }

    public String getName()
    {
        return name;
    }
    
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    public ArrayList<Order> getOrders()
    {
        return orders;
    }
    
    public void addOrder(Order order)
    {
        orders.add(order);
    }
    
    public String shortPrint()
    {
        return String.format("Name: %25s \t Employee Number: %d", name, employeeNumber);
    }
    
    @Override
    public String toString()
    {
        String results = "\nName: " + name;
        results += "\nCustomer Number: " + employeeNumber;
        results += "\nOrders:\n";
        int i = 0;
        while(i < orders.size())
        {
            results += String.format("\t%d) %s\n", i, orders.get(i).shortPrint());
            i++;
        }
        
        return results;
    }
    
    public String save()
    {
        return String.format("%s\n", name);
    }
}
    