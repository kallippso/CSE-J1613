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
    private ArrayList<Order> orders; 
    
    
    public Customer()
    {
    }
    
    public Customer(String name, int customerNumber, double wallet, ArrayList<Order> orders)
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
    
    public void viewBill()
    {
    int i = 0;
    double total = 0;
    while(orders.get(i) != null)
    {
     System.out.println("\nCost of Order " + orders.get(i).getOrderNumber() + ": " + orders.get(i).totalPrice());
     total +=  orders.get(i).totalPrice();
     i++;
    }
     System.out.println("Total Bill: " + total);
    }
}
