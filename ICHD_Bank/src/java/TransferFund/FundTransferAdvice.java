
package TransferFund;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class FundTransferAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice
{
    private ValidatingFundTransfer ValidateFundTransfer;
    
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable
    {
        ValidateFundTransfer.ValidatePassword(args[0].toString());
        System.out.println(args[3]);
        ValidateFundTransfer.ValidateAmount(Double.parseDouble(args[2].toString()), Double.parseDouble(args[3].toString()));
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable
    {
        ValidateFundTransfer.UpdateBalance(Double.parseDouble(args[2].toString()), Double.parseDouble(args[3].toString()));
    }
    
    public void afterThrowing(Throwable Throwable) {}
   
    public void setValidateFundTransfer(ValidatingFundTransfer ValidateFundTransfer)
    {
        this.ValidateFundTransfer = ValidateFundTransfer;
    }
}
