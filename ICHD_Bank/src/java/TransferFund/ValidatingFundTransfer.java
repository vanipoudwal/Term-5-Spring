
package TransferFund;

public class ValidatingFundTransfer
{
    static public String staticPasswordStatus;
    static public String staticAmountStatus;
    static public String staticBalanceStatus;
    static public Double staticNewBalanceStatus;
    
    public ValidatingFundTransfer() {}
    
    public void ValidateAmount(Double Amount, Double Balance)
    {
        if(staticPasswordStatus.compareTo("Valid")==0)
        {
            if(Amount>0)
            {
                if(Amount>Balance)
                {
                    staticAmountStatus="Insufficient Funds";
                }
                else
                {
                    staticAmountStatus="Sufficient Funds";
                }
            }
            else
            {
                staticAmountStatus="Illegal Value";
            }
        }
    }
    
    public void ValidatePassword(String trnPassword)
    {
        if(trnPassword.compareTo("trn0001")==0)
        {
            staticPasswordStatus="Valid";
        }
        else
        {
            staticPasswordStatus="Invalid";
        }
    }
    
    public void UpdateBalance(Double Amount, Double Balance)
    {
        if(staticPasswordStatus.compareTo("Valid") == 0  &&  staticAmountStatus.compareTo("Sufficient Funds") == 0)
        {
            staticNewBalanceStatus = Balance - Amount;
        }
    }
}
