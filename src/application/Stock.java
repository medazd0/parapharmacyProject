package application;

public class Stock {
	private int n_lot;
	private String itemName;
	private int quantity;
	private double price;
	private int suppier_id;
	private String family;
	
	public Stock(int n_lot, String itemName, int quantity, double price, int suppier_id, String family) {
		this.n_lot = n_lot;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.suppier_id = suppier_id;
		this.family = family;
	}
	public int getN_lot() {
		return n_lot;
	}
	public String getItemName() {
		return itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public int getSuppier_id() {
		return suppier_id;
	}
	public String getFamily() {
		return family;
	}
	
	
	

}
