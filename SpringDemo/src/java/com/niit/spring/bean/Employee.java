
package com.niit.spring.bean;

public class Employee
{
    private int ID;
    private String Name;
    private String Email;
    private int Age;
    private long Phone;
    
    public Employee() {}

    public Employee(int ID, String Name, String Email, int Age, long Phone)
    {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Age = Age;
        this.Phone = Phone;
    }

    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public long getPhone()
    {
        return Phone;
    }
    public void setPhone(long Phone)
    {
        this.Phone = Phone;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "ID = " + ID + ", Name = " + Name + ", Email = " + Email + ", Age = " + Age + ", Phone = " + Phone + '}';
    }
}
