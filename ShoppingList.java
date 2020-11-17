package test;

import java.util.ArrayList;

public class ShoppingList {
	
	private static ArrayList<ShoppingListItem> items = new ArrayList<ShoppingListItem>();
	
	
	public static void add(ShoppingListItem item) {
		items.add(item);
	}
	
	public static void remove(int index) {
		if(index < items.size()) {
			items.remove(index);
		}
		else {
			System.out.println("index trop grand");
		}
	}
	
	public static int getItemCount() {
		return items.size();
	}
	
	public static ShoppingListItem getItem(int index) {
		return items.get(index);
	}
	
}
