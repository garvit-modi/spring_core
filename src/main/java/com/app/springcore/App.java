package com.app.springcore;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
 
        
       Student studentOne=  (Student) context.getBean("studentOne");
       Student studentTwo=  (Student) context.getBean("studentTwo");
       
       
       System.out.println(studentOne.toString());
       System.out.println(studentTwo.toString());
    }
}
