
package com.spring.bean;

public class Customer
{
    private String CustomerID;
    private String CustomerName;
    private String CustomerAddress;
    
    public Customer() {}

    public Customer(String CustomerID, String CustomerName, String CustomerAddress)
    {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerAddress = CustomerAddress;
    }

    public String getCustomerID()
    {
        return CustomerID;
    }
    public void setCustomerID(String CustomerID)
    {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName()
    {
        return CustomerName;
    }
    public void setCustomerName(String CustomerName)
    {
        this.CustomerName = CustomerName;
    }

    public String getCustomerAddress()
    {
        return CustomerAddress;
    }
    public void setCustomerAddress(String CustomerAddress)
    {
        this.CustomerAddress = CustomerAddress;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "CustomerID = " + CustomerID + ", CustomerName = " + CustomerName + ", CustomerAddress = " + CustomerAddress + '}';
    }
}
