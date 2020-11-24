
package com.emporg.bean;

public class Employee
{
    private String EmpID;
    private String EmpName;
    private int EmpAge;
    private String EmpAddress;
    private String EmpQualification;
    
    public Employee() {}

    public Employee(String EmpID, String EmpName, int EmpAge, String EmpAddress, String EmpQualification)
    {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpAge = EmpAge;
        this.EmpAddress = EmpAddress;
        this.EmpQualification = EmpQualification;
    }

    public String getEmpID()
    {
        return EmpID;
    }
    public void setEmpID(String EmpID)
    {       
        this.EmpID = EmpID;
    }

    public String getEmpName()
    {
        return EmpName;
    }
    public void setEmpName(String EmpName)
    {
        this.EmpName = EmpName;
    }

    public int getEmpAge()
    {
        return EmpAge;
    }
    public void setEmpAge(int EmpAge)
    {
        this.EmpAge = EmpAge;
    }

    public String getEmpAddress()
    {
        return EmpAddress;
    }
    public void setEmpAddress(String EmpAddress)
    {
        this.EmpAddress = EmpAddress;
    }

    public String getEmpQualification()
    {
        return EmpQualification;
    }
    public void setEmpQualification(String EmpQualification)
    {
        this.EmpQualification = EmpQualification;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "EmpID = " + EmpID + ", EmpName = " + EmpName + ", EmpAge = " + EmpAge + ", EmpAddress = " + EmpAddress + ", EmpQualification = " + EmpQualification + '}';
    }    
}
