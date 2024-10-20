package application;

public class Contact {
	private String id;
	private String name;
	private String contact_Number;
	private String email_Address;
	private String address;
	private String type;
	
	public Contact(String id, String name, String contact_Number, String email_Address, String address, String type) {
		this.id = id;
		this.name = name;
		this.contact_Number = contact_Number;
		this.email_Address = email_Address;
		this.address = address;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getContact_Number() {
		return contact_Number;
	}
	public String getEmail_Address() {
		return email_Address;
	}
	public String getAddress() {
		return address;
	}
	public String getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	
	
	
	
	
	

}
