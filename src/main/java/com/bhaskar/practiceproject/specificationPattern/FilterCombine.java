/**
 * 
 */
package com.bhaskar.practiceproject.specificationPattern;

/**
 * @author Bhaskara S
 *
 */
public class FilterCombine<T> implements Specification<T> {

	private Specification<T> first, second;

	public FilterCombine(Specification<T> first, Specification<T> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}

}
