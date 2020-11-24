
package ICHD_Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanWiring
{
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ICHD_Bank/Spring-Config.xml");
        Customer cust = (Customer) ac.getBean("CustomerBean");
        
        System.out.println("The values are :: ");
        System.out.println(cust.getFirstName());
        System.out.println(cust.getMiddleName());
        System.out.println(cust.getLastName());
    }
}
