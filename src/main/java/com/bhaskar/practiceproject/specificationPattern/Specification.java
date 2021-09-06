/**
 * 
 */
package com.bhaskar.practiceproject.specificationPattern;

/**
 * @author Bhaskara S
 *
 */
public interface Specification<T> {

	boolean isSatisfied(T item);
}
