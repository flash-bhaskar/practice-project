/**
 * 
 */
package com.bhaskar.practiceproject.builder;

/**
 * @author Bhaskara S
 *
 */
public class PersonAddressBuilder extends PersonBuilder {

	public PersonAddressBuilder(Person person) {
		this.person = person;
	}

	public PersonAddressBuilder in(String city) {
		person.city = city;
		return this;
	}

	public PersonAddressBuilder inState(String state) {
		person.state = state;
		return this;
	}

	public PersonAddressBuilder withPincode(String pincode) {
		person.pincode = pincode;
		return this;
	}

}
