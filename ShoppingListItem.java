package test;

public class ShoppingListItem {
	
	String description;
	boolean checked = false;
	
	public ShoppingListItem(String description) {
		this.description = description;
	}
	
	public void setChecked () {
		if(checked == false) {
			this.checked = true;
		}
		else {
			this.checked = false;
		}
	}

}
