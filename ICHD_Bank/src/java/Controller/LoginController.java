
package Controller;

import ICHD_Bank.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Service.*;

@Controller
@RequestMapping(value="/loginView.htm")
public class LoginController
{
    LoginService LoginService;
    
    public void setLoginService(LoginService LoginService)
    {
        this.LoginService = LoginService;
    }
    
    @RequestMapping(method=RequestMethod.GET)
   
    public String showLoginView(ModelMap model)
    {
        Customer Customer = new Customer();
        model.addAttribute("CUSTOMER", Customer);
        return "loginView";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String processForm(@ModelAttribute(value="CUSTOMER")Customer Customer, ModelMap model)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ICHD_Bank/Spring-Config.xml");
        Account act = (Account) ac.getBean("AccountBean");
        String str1 = "Account Number :: "+ act.getAccountNumber();
        model.addAttribute("AccountNumber", str1);
        String str2 = "Balance ($) :: "+ act.getBalance();
        model.addAttribute("Account Balance", str2);
        model.addAttribute("Hello Message", LoginService.sayHello(Customer.getUserName()));
        return "UserAccount";
    }
}
