/**
 * 
 */
package com.app.springcore.ref;

/**
 * Depends on B
 * @author garvitkhandelwal
 *
 */
public class A {
	

	private B obj ;
	private int x;
	
	
	
	/**
	 * 
	 */
	public A() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
	
	
}
