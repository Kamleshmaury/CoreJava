package com.hops;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s1 =(Student) context.getBean("std1");
        System.out.println(s1);
        
        Student s2 =(Student) context.getBean("std2");
        System.out.println(s2);
        
        Student s3 =(Student) context.getBean("std3");
        System.out.println(s3);
    }
}
