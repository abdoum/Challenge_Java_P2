package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Creates and updates the inventory
 * 
 * @author Abdallah Mansour
 *
 */
public class Inventory {

	/**
	 * Creates the empty inventory
	 */
	public Map<Item, Integer> items = new HashMap<Item, Integer>();

	/**
	 * @param newItem  the item to add or update
	 * @param quantity the quantity to add
	 * @return quantity the added or updated Item's quantity
	 */
	public int addOrUpdateItem(Item newItem, int quantity) {
		this.items.put(newItem, items.containsKey(newItem) ? (items.get(newItem) + quantity) : quantity);
		return items.get(newItem);
    }

	/**
	 * @param item               the item to whom we decrease to quantity
	 * @param quantityToSubtract the quantity to subtract
	 * @throws NullPointerException if the Item is not found in the inventory
	 */
	public void decreaseItemQuantity(Item item, int quantityToSubtract) {
		try {
			Integer existingQuantity = items.get(item);
			this.items.put(item, (quantityToSubtract < existingQuantity) ? existingQuantity - quantityToSubtract : 0);
		} catch (NullPointerException e) {
			System.out.println("item not found");
		}
    }

	/**
	 * Prints the inventory
	 * 
	 */
	public void displayInventoryOnConsole() {
		for (Entry<Item, Integer> item : items.entrySet()) {
			System.out.println(
					(item.getClass().getSimpleName() + " - " + item.getKey().getBrand() + ":" + item.getValue()));
		}
	}

	/**
	 * Prints the inventory items without quantity
	 * 
	 */
	public void displayItemsOnConsole() {
		items.forEach((item, quantity) -> System.out.println(item));
	}
}
