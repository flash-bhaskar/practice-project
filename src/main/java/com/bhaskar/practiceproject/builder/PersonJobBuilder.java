/**
 * 
 */
package com.bhaskar.practiceproject.builder;

/**
 * @author Bhaskara S
 *
 */
public class PersonJobBuilder extends PersonBuilder {

	public PersonJobBuilder(Person person) {
		this.person = person;
	}

	public PersonJobBuilder at(String companyName) {
		person.companyName = companyName;
		return this;
	}

	public PersonJobBuilder asA(String position) {
		person.position = position;
		return this;
	}

	public PersonJobBuilder earn(int income) {
		person.income = income;
		return this;
	}

}
