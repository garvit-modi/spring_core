/**
 * 
 */
package com.app.springcore.ref;

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
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/app/springcore/ref/refconfig.xml");
		B obj1 = (B) context.getBean("bref");
		A obj = (A) context.getBean("aref");
		
		//Construction DI
		B obj2 = (B) context.getBean("brefOne");
		A obj3 = (A) context.getBean("arefOne");
	
//		System.out.println(obj.getObj().toString());
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		System.out.println(obj.toString());
		System.out.println(obj3.toString());

		
	}

}
