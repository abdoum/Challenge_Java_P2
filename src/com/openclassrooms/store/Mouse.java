package com.openclassrooms.store;

/**
 * Creates a Mouse Item
 * 
 */
public class Mouse extends Item {

	/**
	 * @param brand the mouse brand
	 * @param price the mouse price
	 */
	public Mouse(Brand brand, double price) {
		super(brand, price);
	}

	@Override
	public String toString() {
		return "Mouse{" + super.toString() + "}";
	}


}
