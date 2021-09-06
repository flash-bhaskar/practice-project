/**
 * 
 */
package com.bhaskar.practiceproject.specificationPattern;

import java.util.List;

/**
 * @author Bhaskara S
 *
 */
public interface Filter<T> {

	List<T> filter(List<T> items, Specification<T> spec);
}
