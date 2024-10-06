import java.util.List;

public class MyItem implements IDedObject {
	
	private int itemID;
	private int itemPrice;
	
	private List<Integer> itemDescription;
	
	public MyItem(int itemID, int itemPrice, List<Integer> itemDescription) {
		 this.itemID = itemID;  
		 this.itemPrice = itemPrice;
		 this.itemDescription = itemDescription;
	}
	
	@Override
	public int getID() {
		return itemID;
	}
	
	public String printID() {
		return itemID + " " + itemPrice + " " + itemDescription.toString().replace("[", "").replace("]", "").replace(",", "");
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public List<Integer> getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(List<Integer> itemDescription) {
		this.itemDescription = itemDescription;
	}

	
}
