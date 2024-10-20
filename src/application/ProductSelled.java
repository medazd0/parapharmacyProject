package application;

public class ProductSelled {
	public String name_product;
	private int product_quantity;
	private double product_pu;
	private double totaPrice;
	
	
	
	
	
	
	public ProductSelled(String name_product, int qte, double pu, double total_price) {
		this.name_product = name_product;
		product_quantity = qte;
		this.product_pu = pu;
		this.totaPrice = total_price;
	}
	public String getLabel_of_product() {
		return name_product;
	}
	public int getQte() {
		return product_quantity;
	}
	public double getPu() {
		return product_pu;
	}
	public double getTotal_price() {
		return totaPrice;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public void setProduct_pu(double product_pu) {
		this.product_pu = product_pu;
	}
	public void setTotaPrice(double totaPrice) {
		this.totaPrice = totaPrice;
	}
	
	
	
	
	
	
	
	

}
