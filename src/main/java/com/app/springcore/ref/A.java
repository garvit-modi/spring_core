/**
 * 
 */
package com.app.springcore.ref;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Depends on B
 * 
 * @author garvitkhandelwal
 *
 */
public class A implements InitializingBean, DisposableBean {
	// Implementing bean life cycle using interfaces

	private B obj;
	private int x;

	/**
	 * 
	 */
	public A() {
		super();
		
	}

	/**
	 * @param obj
	 * @param x
	 */
	public A(B obj, int x) {
		super();
		this.obj = obj;
		this.x = x;
	}

	/**
	 * @return the obj
	 */
	public B getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(B obj) {
		this.obj = obj;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "A [obj=" + obj + ", x=" + x + "]";
	}

//	work as init method
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class A ->init method call using interface");

	}

//	work as destroy method
	public void destroy() throws Exception {
		System.out.println("Class A ->destroy method call using interface");

	}

}
