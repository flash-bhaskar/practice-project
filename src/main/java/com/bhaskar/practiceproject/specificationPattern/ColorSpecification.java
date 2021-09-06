/**
 * 
 */
package com.bhaskar.practiceproject.specificationPattern;

/**
 * @author Bhaskara S
 *
 */
public class ColorSpecification implements Specification<Product> {

	private Color color;

	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.color == color;
	}

}
