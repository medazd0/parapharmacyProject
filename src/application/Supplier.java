package application;

public class Supplier {
	private String supplier_id ;
	private String Name;
	private String Contact_Number;
	private String Email_Address;
	private String Status;
	private String Address;
	public Supplier(String supplier_id, String name, String contact_Number, String email_Address, String status,
			String address) {
		
		this.supplier_id = supplier_id;
		Name = name;
		Contact_Number = contact_Number;
		Email_Address = email_Address;
		Status = status;
		Address = address;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public String getName() {
		return Name;
	}
	public String getContact_Number() {
		return Contact_Number;
	}
	public String getEmail_Address() {
		return Email_Address;
	}
	public String getStatus() {
		return Status;
	}
	public String getAddress() {
		return Address;
	}
	
	
	

}
