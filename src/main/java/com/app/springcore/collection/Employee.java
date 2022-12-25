/**
 * 
 */
package com.app.springcore.collection;

import java.util.*;

/**
 * @author garvitkhandelwal
 *
 */
public class Employee {
	private String name ;
	private List<String> phone;
	private Set<String> address;
	private Map<String , String> course;
	private Properties props ;
	
	
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param name
	 * @param phone
	 * @param address
	 * @param course
	 */
	public Employee(String name, List<String> phone, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
	}



	/**
	 * @param name
	 * @param phone
	 * @param address
	 * @param course
	 * @param props
	 */
	public Employee(String name, List<String> phone, Set<String> address, Map<String, String> course,
			Properties props) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
		this.props = props;
	}



	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}



	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
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



	/**
	 * @return the phone
	 */
	public List<String> getPhone() {
		return phone;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}



	/**
	 * @return the address
	 */
	public Set<String> getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(Set<String> address) {
		this.address = address;
	}



	/**
	 * @return the course
	 */
	public Map<String, String> getCourse() {
		return course;
	}



	/**
	 * @param course the course to set
	 */
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + ", course=" + course
				+ ", props=" + props + "]";
	}
	
	
	
	

}
