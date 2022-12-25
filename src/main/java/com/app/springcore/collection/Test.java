/**
 * 
 */
package com.app.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.springcore.Student;

/**
 * @author garvitkhandelwal
 *
 */
public class Test {

	
	
	public static void main(String[] args)
	{
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/app/springcore/collection/collectionconfig.xml");
		  
	        
	       Employee studentOne=  (Employee) context.getBean("empOne");
	       
	       System.out.println(studentOne.toString());
	}
	
}
