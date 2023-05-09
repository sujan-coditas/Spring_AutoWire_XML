package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Ref-ByType.xml");
        Employee emp= (Employee) ac.getBean("employee", Employee.class);
        System.out.println(emp);    }
}
