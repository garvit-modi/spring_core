/**
 * 
 */
package com.app.springcore.ref;

import javax.annotation.*;

/**
 * @author garvitkhandelwal
 *
 */
public class B {

	private int y;

	
	
	/**
	 * 
	 */
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param y
	 */
	public B(int y) {
		
		super();
		System.out.println("Class B ->Setting values");
		this.y = y;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		System.out.println("Setting values");
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
	
	
	//Implementing bean life cycle using xml
	void init()
	{
		System.out.println("Class B ->init call call using xml");
	}
	
	//Implementing bean life cycle using xml
	void destroy() {
		System.out.println("Class B ->destroy call using xml");
	}
	
	
	

	
	//Implementing bean life cycle using annotation
	@PostConstruct
	void start()
	{
		System.out.println("Class B ->init call call using annotation");
	}
	
	//Implementing bean life cycle using annotation
	@PreDestroy
	void end() {
		System.out.println("Class B ->destroy call using annotation");
	}
	
	
	
	

}
