package com.openclassrooms;

import com.openclassrooms.store.Brand;
import com.openclassrooms.store.Inventory;
import com.openclassrooms.store.Mouse;
import com.openclassrooms.store.Screen;

/**
 * 
 * Application entry point
 * 
 * @author Abdallah Mansour
 *
 */

public class Main {

	/**
	 * @param args provided arguments are not handled
	 */
	public static void main(String[] args) {

		Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");
		Mouse dellMouse = new Mouse(Brand.DELL, 80.0);
		Mouse appleMouse = new Mouse(Brand.APPLE, 80.0);

		Inventory inventory = new Inventory();

		inventory.addOrUpdateItem(samsungScreen, 5);

		inventory.addOrUpdateItem(dellMouse, 12);
		inventory.decreaseItemQuantity(dellMouse, 2);

		inventory.decreaseItemQuantity(appleMouse, 2);

		inventory.displayInventoryOnConsole();

		inventory.decreaseItemQuantity(dellMouse, 12);

		inventory.displayInventoryOnConsole();
		inventory.displayItemsOnConsole();
	}
}
