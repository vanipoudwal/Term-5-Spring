
package ICHD_Bank;

public class Account
{
    private String AccountNumber;
    private String AccountCreationDate;
    private double Balance;
    private String AccountType;
    
    public Account() {}

    public Account(String AccountNumber, String AccountCreationDate, double Balance, String AccountType)
    {
        this.AccountNumber = AccountNumber;
        this.AccountCreationDate = AccountCreationDate;
        this.Balance = Balance;
        this.AccountType = AccountType;
    }

    public String getAccountNumber()
    {
        return AccountNumber;
    }
    public void setAccountNumber(String AccountNumber)
    {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountCreationDate()
    {
        return AccountCreationDate;
    }
    public void setAccountCreationDate(String AccountCreationDate)
    {
        this.AccountCreationDate = AccountCreationDate;
    }

    public double getBalance()
    {
        return Balance;
    }
    public void setBalance(double Balance) 
    {
        this.Balance = Balance;
    }

    public String getAccountType() 
    {
        return AccountType;
    }
    public void setAccountType(String AccountType) 
    {
        this.AccountType = AccountType;
    }

    @Override
    public String toString()
    {
        return "Account{" + "AccountNumber = " + AccountNumber + ", AccountCreationDate = " + AccountCreationDate + ", Balance = " + Balance + ", AccountType = " + AccountType + '}';
    }
}
