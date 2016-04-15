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
    
    
    public SalesAssoc()
    {
        name = "test";
        employeeNumber = -1;
        orders = new ArrayList<>();
    }
    
    public SalesAssoc(String name)
    {
        this.name = name;
        employeeNumber = 0;
        orders = new ArrayList<>();
    }
    
    public SalesAssoc(String name, int employeeNumber)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        orders = new ArrayList<>();
    }   
    
    public SalesAssoc(String name, int employeeNumber, ArrayList<Order> orders)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
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
}
    