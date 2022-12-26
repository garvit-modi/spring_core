/**
 * 
 */
package com.app.springcore.autowiring;

/**
 * @author garvitkhandelwal
 *
 */
public class Address {
	
	private String name;

	
	
	
	@Override
	public String toString() {
		return "Address [name=" + name + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
