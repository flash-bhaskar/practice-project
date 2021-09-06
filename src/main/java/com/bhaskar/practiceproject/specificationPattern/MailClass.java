/**
 * 
 */
package com.bhaskar.practiceproject.specificationPattern;

import java.util.List;

/**
 * @author Bhaskara S
 *
 */
public class MailClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
	    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
	    Product house = new Product("House", Color.BLUE, Size.LARGE);

	    List<Product> products = List.of(apple, tree, house);

	    FilterClass fc = new FilterClass();
	    fc.filter(products, new SizeSpecification(Size.SMALL)).forEach(i -> System.out.println(i.name + " " + i.size));
	    
	   fc.filter(products, new FilterCombine<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE))).forEach(i -> System.out.println(i.name + " " + i.size));
	    
	}

}
