package com.te.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
       Salary bean = applicationContext.getBean(Salary.class);
       System.out.println(bean);
    }
}
