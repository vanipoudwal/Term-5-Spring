
package ICHD_Bank;

public class Customer
{
    private String AccountName;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String DateOfBirth;
    private String MonthOfBirth;
    private String YearOfBirth;
    private String FatherName;
    private String EmailID;
    private String Gender;
    private String MaritalStatus;
    private String HouseNo;
    private String StreetName;
    private String State;
    private String City;
    private String PinCode;
    private String Phone;
    private String UserName;
    private String Password;
    
    public Customer() {}

    public Customer(String AccountName, String FirstName, String MiddleName, String LastName, String DateOfBirth, String MonthOfBirth, String YearOfBirth, String FatherName, String EmailID, String Gender, String MaritalStatus, String HouseNo, String StreetName, String State, String City, String PinCode, String Phone, String UserName, String Password)
    {
        this.AccountName = AccountName;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.MonthOfBirth = MonthOfBirth;
        this.YearOfBirth = YearOfBirth;
        this.FatherName = FatherName;
        this.EmailID = EmailID;
        this.Gender = Gender;
        this.MaritalStatus = MaritalStatus;
        this.HouseNo = HouseNo;
        this.StreetName = StreetName;
        this.State = State;
        this.City = City;
        this.PinCode = PinCode;
        this.Phone = Phone;
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getAccountName()
    {
        return AccountName;
    }
    public void setAccountName(String AccountName)
    {
        this.AccountName = AccountName;
    }

    public String getFirstName()
    {
        return FirstName;
    }
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }

    public String getMiddleName()
    {
        return MiddleName;
    }
    public void setMiddleName(String MiddleName)
    {
        this.MiddleName = MiddleName;
    }

    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }

    public String getDateOfBirth()
    {
        return DateOfBirth;
    }
    public void setDateOfBirth(String DateOfBirth)
    {
        this.DateOfBirth = DateOfBirth;
    }

    public String getMonthOfBirth()
    {
        return MonthOfBirth;
    }
    public void setMonthOfBirth(String MonthOfBirth)
    {
        this.MonthOfBirth = MonthOfBirth;
    }

    public String getYearOfBirth()
    {
        return YearOfBirth;
    }
    public void setYearOfBirth(String YearOfBirth)
    {
        this.YearOfBirth = YearOfBirth;
    }

    public String getFatherName()
    {
        return FatherName;
    }
    public void setFatherName(String FatherName)
    {
        this.FatherName = FatherName;
    }

    public String getEmailID()
    {
        return EmailID;
    }
    public void setEmailID(String EmailID)
    {
        this.EmailID = EmailID;
    }

    public String getGender()
    {
        return Gender;
    }
    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }

    public String getMaritalStatus()
    {
        return MaritalStatus;
    }
    public void setMaritalStatus(String MaritalStatus)
    {
        this.MaritalStatus = MaritalStatus;
    }

    public String getHouseNo()
    {
        return HouseNo;
    }
    public void setHouseNo(String HouseNo)
    {
        this.HouseNo = HouseNo;
    }

    public String getStreetName()
    {
        return StreetName;
    }
    public void setStreetName(String StreetName)
    {
        this.StreetName = StreetName;
    }

    public String getState()
    {
        return State;
    }
    public void setState(String State)
    {
        this.State = State;
    }

    public String getCity()
    {
        return City;
    }
    public void setCity(String City)
    {
        this.City = City;
    }

    public String getPinCode()
    {
        return PinCode;
    }
    public void setPinCode(String PinCode)
    {
        this.PinCode = PinCode;
    }

    public String getPhone()
    {
        return Phone;
    }
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }

    public String getUserName()
    {
        return UserName;
    }
    public void setUserName(String UserName)
    {
        this.UserName = UserName;
    }

    public String getPassword()
    {
        return Password;
    }
    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "AccountName = " + AccountName + ", FirstName = " + FirstName + ", MiddleName = " + MiddleName + ", LastName = " + LastName + ", DateOfBirth = " + DateOfBirth + ", MonthOfBirth = " + MonthOfBirth + ", YearOfBirth = " + YearOfBirth + ", FatherName = " + FatherName + ", EmailID = " + EmailID + ", Gender = " + Gender + ", MaritalStatus = " + MaritalStatus + ", HouseNo = " + HouseNo + ", StreetName = " + StreetName + ", State = " + State + ", City = " + City + ", PinCode = " + PinCode + ", Phone = " + Phone + ", UserName = " + UserName + ", Password = " + Password + '}';
    }
}
