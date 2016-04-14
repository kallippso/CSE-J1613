/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

public class SalesAssoc
{
   
    private String name;
    private int employeeNumber;
    private Order orders; 
    
    
    public SalesAssoc()
    {
    }
    
    public SalesAssoc(String name, int employeeNumber, Order orders)
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
    
    public Order getOrders()
    {
        return orders;
    }
}
    