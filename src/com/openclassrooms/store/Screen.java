package com.openclassrooms.store;

/**
 * Creates a Screen item
 *
 */
public class Screen extends Item {

	private String resolution;

	/**
	 * @return resolution the string resolution
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * @param resolution the resolution as a string
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**
	 * @param brand      the Brand for the item
	 * @param price      the item's price
	 * @param resolution the resolution as a string
	 */
	public Screen(Brand brand, double price, String resolution) {
		super(brand, price);
		this.setResolution(resolution);
	}

	@Override
	public String toString() {
		return "Screen{" + super.toString() + ", resolution='" + resolution + '\'' + '}';
	}

}
