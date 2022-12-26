/**
 * 
 */
package com.app.springcore.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.springcore.ref.B;

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
				"com/app/springcore/autowiring/autowiringconfig.xml");

		// Setter DI
		Emp obj1 = (Emp) context.getBean("emp");
		
		System.out.println(obj1.toString());

	}

}
