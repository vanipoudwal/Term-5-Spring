
package com.niit.spring.container;

import com.niit.spring.bean.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class EmployeeContainer
{
    public static void main(String[] args)
    {
        // create the resource
        Resource resource = new ClassPathResource("com/niit/spring/bean/beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee employee = (Employee) factory.getBean("Employee");
        System.out.println(employee);
    }
}
