/**
 * 
 */
package com.app.springcore.ref;

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
	
	
	void init()
	{
		System.out.println("init call");
	}
	
	
	void destroy() {
		System.out.println("destroy call");
	}

}
