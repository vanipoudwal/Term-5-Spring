
package ICHD_Bank;

public class FundTransfer
{
    private double Amount;
    private String TransactionPassword;
    private String ToAccount;
    
    public FundTransfer() {}

    public FundTransfer(double Amount)
    {
        this.Amount = Amount;
        this.TransactionPassword = TransactionPassword;
        this.ToAccount = ToAccount;
    }
    
    public double getAmount()
    {
        return Amount;
    }
    public void setAmount(double Amount)
    {
        this.Amount = Amount;
    }
    
    public String getTransactionPassword()
    {
        return TransactionPassword;
    }
    public void setTransactionPassword(String TransactionPassword)
    {
        this.TransactionPassword = TransactionPassword;
    }
    
    public String getToAccount()
    {
        return ToAccount;
    }
    public void setToAccount(String ToAccount)
    {
        this.ToAccount = ToAccount;
    }

    @Override
    public String toString()
    {
        return "FundTransfer{" + "Amount=" + Amount + ", TransactionPassword=" + TransactionPassword + ", ToAccount=" + ToAccount + '}';
    }

    public Double getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
