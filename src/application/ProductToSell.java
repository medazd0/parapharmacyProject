package application;

public class ProductToSell {
	private String id_product;

	private String name_product;
	private int product_quantity;
	private double product_pu;
	private double totaPrice;
	private String product_family;
	private int product_NLot;
	private String supplier;
	private int id_supplier;
	
	
	
	
	

	






	



	public ProductToSell(String name_product, int product_quantity, double product_pu, double totaPrice) {
		this.name_product = name_product;
		this.product_quantity = product_quantity;
		this.product_pu = product_pu;
		this.totaPrice = totaPrice;
	}



	public ProductToSell(String id_product, int product_quantity) {
		this.id_product = id_product;
		this.product_quantity = product_quantity;
	}



	public ProductToSell(String id_product, String name_product, int product_quantity, double product_pu, double totaPrice,
			String product_family, int product_NLot) {
		this.id_product = id_product;
		this.name_product = name_product;
		this.product_quantity = product_quantity;
		this.product_pu = product_pu;
		this.totaPrice = totaPrice;
		this.product_family = product_family;
		this.product_NLot = product_NLot;
		
	}



	public String getId_product() {
		return id_product;
	}

	public String getName_product() {
		return name_product;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public double getProduct_pu() {
		return product_pu;
	}
	public double getTotaPrice() {
		return totaPrice;
	}
	public String getProduct_family() {
		return product_family;
	}
	public int getProduct_NLot() {
		return product_NLot;
	}public String getSupplier() {
		return supplier;
	}public int getId_supplier() {
		return id_supplier;
	}



	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}



	public void setId_supplier(int id_supplier) {
		this.id_supplier = id_supplier;
	}



	public void setId_product(String id_product) {
		this.id_product = id_product;
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



	public void setProduct_family(String product_family) {
		this.product_family = product_family;
	}



	public void setProduct_NLot(int product_NLot) {
		this.product_NLot = product_NLot;
	}






	

	
	
	
	
	
	
	

}
