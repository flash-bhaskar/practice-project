/**
 * 
 */
package com.bhaskar.practiceproject.builder;

/**
 * @author Bhaskara S
 *
 */
public class MailClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonBuilder obj = new PersonBuilder();
		Person person = obj.lives()
				.in("banglore")
				.inState("karnataka")
				.withPincode("562106")
			.works()
				.at("arraigntech")
				.asA("java developer")
				.earn(26000)
			.build();
		System.out.println(person);

	}

}
