/**
 * 
 */
package com.bhaskar.practiceproject.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Bhaskara S
 *
 */
public class CheckMap {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setName("test1");
		s2.setName("test2");
		s3.setName("test3");
		s1.setMarks(12);
		s2.setMarks(13);
		s3.setMarks(14);
		
		List<Student> st =new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		List<String> collect = st.stream()
				.filter(s -> s.getMarks() >= 13)
				.map(student -> {
					return student.getName();
				})
					.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
		
}
