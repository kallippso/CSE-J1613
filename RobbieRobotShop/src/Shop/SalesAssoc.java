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
    private static int numEmployees;
    
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
}
    