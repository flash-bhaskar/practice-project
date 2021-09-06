/**
 * 
 */
package com.bhaskar.practiceproject.specificationPattern;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Bhaskara S
 *
 */
public class FilterClass implements Filter<Product>{

	@Override
	public List<Product> filter(List<Product> items, Specification<Product> spec) {
		List<Product> resultList = items.stream().filter(p -> spec.isSatisfied(p)).collect(Collectors.toList());
		return resultList;
	}

}
