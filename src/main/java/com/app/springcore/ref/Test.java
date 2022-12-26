/**
 * 
 */
package com.app.springcore.ref;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author garvitkhandelwal
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/app/springcore/ref/refconfig.xml");

		// Setter DI
		B obj1 = (B) context.getBean("bref");
		A obj = (A) context.getBean("aref");
		

		System.out.println(obj1.toString());
		System.out.println(obj.toString());

		// Construction DI
//		B obj2 = (B) context.getBean("brefOne");
//		A obj3 = (A) context.getBean("arefOne");
//		
//		System.out.println(obj3.toString());
//		System.out.println(obj2.toString());

////		This interface contains registerShutdownHook method
//		AbstractApplicationContext contextOne = new ClassPathXmlApplicationContext("com/app/springcore/ref/refconfig.xml");
//		B obj4 = (B) contextOne.getBean("brefOne");
//		A obj5 = (A) contextOne.getBean("arefOne");
//		
//		//To destroy object
//		contextOne.registerShutdownHook();

	}

}
