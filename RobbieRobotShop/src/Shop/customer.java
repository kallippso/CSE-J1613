/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.ArrayList;

/**

 */
public class Customer
{
   
    private String name;
    private int customerNumber;
    private double wallet;
<<<<<<< HEAD
    private Order[] orders; 
=======
    private ArrayList<Order> orders; 
>>>>>>> origin/master
    
    
    public Customer()
    {
<<<<<<< HEAD
        name = null;
        customernumber = -1;
        wallet = -1;
        orders = null;
    }
    
    public customer(String name, int customerNumber, double wallet, Orders[] orders)
=======
    }
    
    public Customer(String name, int customerNumber, double wallet, ArrayList<Order> orders)
>>>>>>> origin/master
    {
        this.name = name;
        this.customerNumber = customerNumber;
        this.wallet = wallet;
        this.orders = orders;
    }
   
    public String getName()
    {
        return name;
    }
    
    public int getcustomerNumber()
    {
        return customerNumber;
    }
    
    public double getwallet()
    {
        return wallet;
    }
    
    public ArrayList<Order> getOrder()
    {
        return orders;
    }
 
    
    
    protected void setName(String name)
    {
        this.name = name;
    }
    
    protected void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
    protected void setWallet(double wallet)
    {
        this.wallet = wallet;
    }
    
    protected void setOrders(ArrayList<Order> orders)
    {
        this.orders = orders;
    }
}
