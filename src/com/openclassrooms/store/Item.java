package com.openclassrooms.store;

/**
 * 
 * This is an abstract class, it cannot be used directly. You must invoke one of
 * its subclasses to use it.
 * 
 * @author Abdallah Mansour
 *
 */
public class Item {

	protected Brand brand;
	protected double price;

	/**
	 * @param brand the brand for the article item
	 * @param price the price must be a double
	 */
	public Item(Brand brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	/**
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "brand=" + brand.toString() + ", price='" + price + '\'';
	}
}
