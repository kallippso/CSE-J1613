/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;
/**
 *
 * @author Kallippso
 */
public class Shop {

    private Order[] orders;
    private RobotModel[] robotModels;
    private Customer[] customers;
    private SalesAssoc[] salesAssoc;
    
    public Shop(){
        orders = null;
        robotModels = null;
        customers= null;
        salesAssoc = null;
    }
    public Shop()
    {
        orders = orders;
        robotModels = robotModels;
        customers = customers;
        salesAssoc = salesAssoc;
    }
    public Orders[] getOrders()
    {
        return orders;
    }
    public RobotModel[] getRobotModels()
    {
        return robotModels;
    }
    public Customers[] getCustomers()
    {
        return customers;
    }
    public SalesAssoc[] getSalesAssoc()
    {
        return salesAssoc;
    }
    
    public void createRobotModel()
    {
    }
    public void newCustomer()
    {
    }
    public void placeOrder()
    {    
    }
    
}
    
    
    