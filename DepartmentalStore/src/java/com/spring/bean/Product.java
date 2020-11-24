
package com.spring.bean;

public class Product
{
    private String ProductID;
    private String ProductName;
    private int ProductQty;
    private int ProductPrice;
    
    public Product() {}

    public Product(String ProductID, String ProductName, int ProductQty, int ProductPrice)
    {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductQty = ProductQty;
        this.ProductPrice = ProductPrice;
    }

    public String getProductID()
    {
        return ProductID;
    }
    public void setProductID(String ProductID)
    {
        this.ProductID = ProductID;
    }

    public String getProductName()
    {
        return ProductName;
    }
    public void setProductName(String ProductName)
    {
        this.ProductName = ProductName;
    }

    public int getProductQty()
    {
        return ProductQty;
    }
    public void setProductQty(int ProductQty)
    {
        this.ProductQty = ProductQty;
    }

    public int getProductPrice()
    {
        return ProductPrice;
    }
    public void setProductPrice(int ProductPrice)
    {
        this.ProductPrice = ProductPrice;
    }

    @Override
    public String toString()
    {
        return "Product{" + "ProductID = " + ProductID + ", ProductName = " + ProductName + ", ProductQty = " + ProductQty + ", ProductPrice = " + ProductPrice + '}';
    }
}
