/**
 * 
 */
package com.bhaskar.practiceproject.builder;

/**
 * @author Bhaskara S
 *
 */
public class Person {

	public String city, state, pincode;

	public String position, companyName;
	public int income;

	@Override
	public String toString() {
		return "Person [city=" + city + ", state=" + state + ", pincode=" + pincode + ", position=" + position
				+ ", companyName=" + companyName + ", income=" + income + "]";
	}

}
