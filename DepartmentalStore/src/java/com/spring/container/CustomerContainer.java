
package com.spring.container;

import com.spring.bean.Customer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class CustomerContainer
{
    public static void main(String[] args)
    {
        // create the resource
        Resource resource = new ClassPathResource("com/spring/bean/Beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Customer customer1 = (Customer) factory.getBean("Customer1");
        System.out.println(customer1);
        Customer customer2 = (Customer) factory.getBean("Customer2");
        System.out.println(customer2);
        Customer customer3 = (Customer) factory.getBean("Customer3");
        System.out.println(customer3);
        Customer customer4 = (Customer) factory.getBean("Customer4");
        System.out.println(customer4);
        Customer customer5 = (Customer) factory.getBean("Customer5");
        System.out.println(customer5);
    }
}
