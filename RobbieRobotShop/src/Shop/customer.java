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
        name = "test";
        customerNumber = -1;
        wallet = 0;
        orders = new ArrayList<>();
    }
    
    public Customer(String name)
    {
        this.name = name;
        customerNumber = 0;
        wallet = 0;
        orders = new ArrayList<>();
    }
    
    public Customer(String name, int customerNumber)
    {
        this.name = name;
        this.customerNumber = customerNumber;
        wallet = 0;
        orders = new ArrayList<>();
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
    
    public int getCustomerNumber()
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
    
    public void addOrder(Order order)
    {
        orders.add(order);
    }
    
    public void viewBill()
    {
    int i = 0;
    double total = 0;
    while(i < orders.size())
    {
     System.out.println("\nCost of Order " + orders.get(i).getOrderNumber() + ": " + orders.get(i).totalPrice());
     total +=  orders.get(i).totalPrice();
     i++;
    }
     System.out.println("Total Bill: " + total);
    }
    
    public static void main(String [] args)
    {
        Customer test = new Customer(); 
        test.viewBill();
    }
}
