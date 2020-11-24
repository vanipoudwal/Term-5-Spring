
package Controller;
import ICHD_Bank.Account;
import ICHD_Bank.FundTransfer;
import TransferFund.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/FundTransfer.htm")

public class FundTransferController
{
    private ValidatingFundTransfer ValidatingFundTransfer;
    
    @RequestMapping(method=RequestMethod.GET)
    
    public String showLoginView(ModelMap model)
    {
        FundTransfer ft = new FundTransfer();
        model.addAttribute("TransferAccount", ft);
        return "FundTransfer";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    
    public String ProcessForm(@ModelAttribute(value="TransferAccount") FundTransfer act, ModelMap model)
    {
        String Message ="";
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ICHD_Bank/Spring-Config");
        FundTransferApp ft = (FundTransferApp) ctx.getBean("TransferProxy");
        Account acc = (Account) ctx.getBean("AccountBean");
        ft.TransferAmount(act.getTransactionPassword(), act.getToAccount(), act.getAmount(), act.getBalance());
        
        if(ValidatingFundTransfer.staticPasswordStatus.compareTo("Valid")==0)
        {
            if(ValidatingFundTransfer.staticAmountStatus.compareTo("Illegal Value")==0)
            {
                Message = "Please enter the amount greater than 0";
            }
            else if(ValidatingFundTransfer.staticAmountStatus.compareTo("Insufficient Funds")==0)
            {
                Message = "You don't have sufficient funds";
            }
            else
            {
                Message = "Transaction Successful";
                Message = Message + "<p>Amount of $" + act.getAmount() + "has been transferrred. Your current balance is :: $" + ValidatingFundTransfer.staticNewBalanceStatus;
            }
        }
        else
        {
            Message = "You have entered an invalid transaction password";
        }
        model.addAttribute("Message", Message);
        return "Transfer";
    }
    
    public void setValidatingFundTransfer (ValidatingFundTransfer ValidatingFundTransfer)
    {
        this.ValidatingFundTransfer = ValidatingFundTransfer;
    }
}
