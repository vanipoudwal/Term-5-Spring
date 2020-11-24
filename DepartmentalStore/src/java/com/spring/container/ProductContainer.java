
package com.spring.container;

import com.spring.bean.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class ProductContainer
{
    public static void main(String[] args)
    {
        // create the resource
        Resource resource = new ClassPathResource("com/spring/bean/Beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Product product1 = (Product) factory.getBean("Product1");
        System.out.println(product1);
        Product product2 = (Product) factory.getBean("Product2");
        System.out.println(product2);
        Product product3 = (Product) factory.getBean("Product3");
        System.out.println(product3);
        Product product4 = (Product) factory.getBean("Product4");
        System.out.println(product4);
        Product product5 = (Product) factory.getBean("Product5");
        System.out.println(product5);
    }
}
