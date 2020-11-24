
package com.emporg.container;

import com.emporg.bean.Employee;
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
        Resource resource = new ClassPathResource("com/emporg/bean/SpringXMLConfig.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee employee1 = (Employee) factory.getBean("Employee1");
        System.out.println(employee1);
        Employee employee2 = (Employee) factory.getBean("Employee2");
        System.out.println(employee2);
        Employee employee3 = (Employee) factory.getBean("Employee3");
        System.out.println(employee3);
        Employee employee4 = (Employee) factory.getBean("Employee4");
        System.out.println(employee4);
        Employee employee5 = (Employee) factory.getBean("Employee5");
        System.out.println(employee5);
        Employee employee6 = (Employee) factory.getBean("Employee6");
        System.out.println(employee6);
    }
}
