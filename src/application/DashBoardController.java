package application;

import java.net.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.fxml.Initializable;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class DashBoardController implements Initializable {

    @FXML
    private TextField ID_supplier;

    @FXML
    private TextField ID_supplier2;

    @FXML
    private TextField ID_supplier3;

    @FXML
    private TextField address_contact;

    @FXML
    private TextField address_supplier;

    @FXML
    private TextField address_supplier2;

    @FXML
    private TextField address_supplier3;

    @FXML
    private AnchorPane addstock_form;

    @FXML
    private AnchorPane addsupplier2;

    @FXML
    private AnchorPane addsupplier3;

    @FXML
    private Button btn_addContact;

    @FXML
    private Button btn_addSupplier;

    @FXML
    private Button btn_addSupplier2;
    
    
    
    @FXML
    private TextField id_product;

    @FXML
    private TextField id_contact;
    
    @FXML
    private Button btn_addSupplier3;

    @FXML
    private Button btn_cancelContact;

    @FXML
    private Button btn_cancelSupplier;

    @FXML
    private Button btn_cancelSupplier1;

    @FXML
    private Button btn_cancelSupplier3;

    @FXML
    private Button btn_deleteContact;

    @FXML
    private Button btn_deleteSupplier;

    @FXML
    private Button btn_product_add;

    @FXML
    private Button btn_product_cancel;

    @FXML
    private Button btn_product_delete;

    @FXML
    private Button btn_product_update;

    @FXML
    private Button btn_stock_add;

    @FXML
    private Button btn_stock_cancel;

    @FXML
    private Button btn_stock_delete;

    @FXML
    private Button btn_stock_update;

    @FXML
    private Button btn_updateContact;

    @FXML
    private Button btn_updateSupplier;

    @FXML
    private Button contacts_btn;

    @FXML
    private AnchorPane contacts_form;

    @FXML
    private Label current_form;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private TableView<String> dashboard_tabel;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_family;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_id;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_labelOfProduct;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_nLot;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_pu;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_qte;

    @FXML
    private TableColumn<?, ?> dashboard_tabl_col_totalPrice;

    @FXML
    private Label date_time;

    @FXML
    private TextField email_contact;
    @FXML
    private TextField quantity_product_toSell;

    

    @FXML
    private TextField email_supplier;

    @FXML
    private TextField email_supplier2;

    @FXML
    private TextField email_supplier3;

    @FXML
    private Button factor_btn;

    @FXML
    private TextField family_stock;

    @FXML
    private AnchorPane ffffff;

    @FXML
    private AnchorPane main_form;

    @FXML
    private TextField name_contact;

    @FXML
    private TextField name_product;

    @FXML
    private TextField name_stock;

    @FXML
    private TextField name_supplier;

    @FXML
    private TextField name_supplier2;

    @FXML
    private TextField name_supplier3;

    @FXML
    private Label nav_idUser;

    @FXML
    private Label nav_username;

    @FXML
    private Label nbr_daily;

    @FXML
    private Label nbr_dailyTotalPrice;

    @FXML
    private Label nbr_monthly;

    @FXML
    private Label nbr_monthlyTotalPrice;

    @FXML
    private TextField num_stock;

    @FXML
    private TextField other_fieledContact;

    @FXML
    private TextField price_stock;

    @FXML
    private TextField product_NLot;

    @FXML
    private TableColumn<Product, String> product_col_labelOfProduct;

    @FXML
    private TextField product_family;

    @FXML
    private AnchorPane product_form;

    @FXML
    private TextField product_pu;

    @FXML
    private TextField product_quantity;

    @FXML
    private TextField product_supplier;
    
    @FXML
    private TextField Name_product_toSell;
    
    

    @FXML
    private TextField product_supplier_id;

    @FXML
    private TableView<Product> product_tabel;

    @FXML
    private TableColumn<Product, String> product_tabl_col_family;

    @FXML
    private TableColumn<Product, String> product_tabl_col_id;

    @FXML
    private TableColumn<Product, Integer> product_tabl_col_nLot;

    @FXML
    private TableColumn<Product, Double> product_tabl_col_pu;

    @FXML
    private TableColumn<Product, Integer> product_tabl_col_qte;

    @FXML
    private TableColumn<Product, Double> product_tabl_col_totalPrice;

    @FXML
    private Button products_btn;

    @FXML
    private AnchorPane products_form;

    @FXML
    private TextField quantity_stock;

    @FXML
    private Button setting_btn;

    @FXML
    private ComboBox<String> status_supplier;

    @FXML
    private ComboBox<String> status_supplier2;

    @FXML
    private ComboBox<String> status_supplier3;

    @FXML
    private Button stocks_btn;

    @FXML
    private AnchorPane stocks_form;

    @FXML
    private TableView<Stock> stocks_tabel;

    @FXML
    private TableColumn<Stock,Integer> stocks_tabl_col_NLot;

    @FXML
    private TableColumn<Stock,String> stocks_tabl_col_family;

    @FXML
    private TableColumn<Stock,String> stocks_tabl_col_name;

    @FXML
    private TableColumn<Stock,Double> stocks_tabl_col_pu;

    @FXML
    private TableColumn<Stock,Integer> stocks_tabl_col_qte;

    @FXML
    private TableColumn<Stock,Integer> stocks_tabl_col_supplier;

    @FXML
    private TextField supplier_id_stock;

    @FXML
    private Button suppliers_btn;

    @FXML
    private AnchorPane suppliers_form;

    @FXML
    private TableView<Contact> table_contact;

    @FXML
    private TableColumn<Contact,String> table_contact_col_address;

    @FXML
    private TableColumn<Contact,String> table_contact_col_contactNumber;

    @FXML
    private TableColumn<Contact,String> table_contact_col_email;

    @FXML
    private TableColumn<Contact,String> table_contact_col_id;

    @FXML
    private TableColumn<Contact,String> table_contact_col_name;

    @FXML
    private TableColumn<Contact,String> table_contact_col_type;

    @FXML
    private TableView<Supplier> table_suppliers;

    @FXML
    private TableColumn<Supplier, String> table_suppliers_col_address;

    @FXML
    private TableColumn<Supplier, String> table_suppliers_col_contactNumber;

    @FXML
    private TableColumn<Supplier, String> table_suppliers_col_email;

    @FXML
    private TableColumn<Supplier, String> table_suppliers_col_id;

    @FXML
    private TableColumn<Supplier, String> table_suppliers_col_name;

    @FXML
    private TableColumn<Supplier, String> table_suppliers_col_status;

    @FXML
    private TextField tele_contact;

    @FXML
    private TextField tele_supplier;

    @FXML
    private TextField tele_supplier2;

    @FXML
    private TextField tele_supplier3;

    @FXML
    private Circle top_profile;

    @FXML
    private Label top_username;

    @FXML
    private ComboBox<String> type_contact;

    @FXML
    private Button user_btn;
    
    @FXML
    private Button btn_addToSell;
    
    @FXML
    private Button btn_ValidateToSell;
    
    
    @FXML
    private Button btn_CancelSell;
    
    

    @FXML
    private Label we;
    
    @FXML
    private TableView<ProductToSell> dashboard_tabelSell;


    @FXML
    private TableColumn<ProductToSell, Integer> dashboard_tabl_col_idSell;

    @FXML
    private TableColumn<ProductToSell, String> dashboard_tabl_col_labelOfProductSell;

    @FXML
    private TableColumn<ProductToSell, Double> dashboard_tabl_col_puSell;

    @FXML
    private TableColumn<ProductToSell, Integer> dashboard_tabl_col_qteSell;

    @FXML
    private TableColumn<ProductToSell, Double> dashboard_tabl_col_totalPriceSell;
    @FXML
    private TableColumn<ProductToSell, String> dashboard_tabl_col_familySell;
    @FXML
    private TableColumn<ProductToSell, Integer> dashboard_tabl_col_nLotSell;
    
    

    
    @FXML
    private Button btn_CancelAllSell;

    
    @FXML
    private Button btn_UpdateSell;

    
    @FXML
    private Label dateFacteur;

   
    @FXML
    private AnchorPane facteur_forme;

   
    @FXML
    private Label numberOfFactor;



    @FXML
    private TableView<ProductToSell> table_factor;

    @FXML
    private TableColumn<ProductToSell,String> table_factorColumn_Label;

    @FXML
    private TableColumn<ProductToSell,Double> table_factorColumn_pu;

    @FXML
    private TableColumn<ProductToSell,Integer> table_factorColumn_qte;

    @FXML
    private TableColumn<ProductToSell,Double> table_factorColumn_totalprice;

    @FXML
    private Label total_ttc;

    @FXML
    private Label totale_ht;

   
	private Connection connect;
	private PreparedStatement prepare;
	private ResultSet result,result2,result3;
	private Statement statement;
	
	AlertMessage alert = new AlertMessage();


	/*
	 * public Connection connectDB(){ try {
	 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
	 * connect=DriverManager.getConnection("jdbc:mysql://localhost/paraph","root",
	 * "root"); return connect; } catch(Exception e) {e.printStackTrace();return
	 * null;}}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void switchForm(ActionEvent event) {
		if (event.getSource() == dashboard_btn) {
			dashboard_form.setVisible(true);
			suppliers_form.setVisible(false);
			contacts_form.setVisible(false);
			products_form.setVisible(false);
			stocks_form.setVisible(false);
			facteur_forme.setVisible(false);	
		} else if (event.getSource() == suppliers_btn) {
			dashboard_form.setVisible(false);
			suppliers_form.setVisible(true);
			contacts_form.setVisible(false);
			products_form.setVisible(false);
			stocks_form.setVisible(false);
			facteur_forme.setVisible(false);	


		} else if (event.getSource() == contacts_btn) {
			dashboard_form.setVisible(false);
			suppliers_form.setVisible(false);
			contacts_form.setVisible(true);
			products_form.setVisible(false);
			stocks_form.setVisible(false);
			facteur_forme.setVisible(false);	


		} else if (event.getSource() == products_btn) {
			dashboard_form.setVisible(false);
			suppliers_form.setVisible(false);
			contacts_form.setVisible(false);
			products_form.setVisible(true);
			stocks_form.setVisible(false);
			facteur_forme.setVisible(false);	


		} else if (event.getSource() == stocks_btn) {
			dashboard_form.setVisible(false);
			suppliers_form.setVisible(false);
			contacts_form.setVisible(false);
			products_form.setVisible(false);
			stocks_form.setVisible(true);
			facteur_forme.setVisible(false);
		} else if (event.getSource() == factor_btn) {
			dashboard_form.setVisible(false);
			suppliers_form.setVisible(false);
			contacts_form.setVisible(false);
			products_form.setVisible(false);
			stocks_form.setVisible(false);
			facteur_forme.setVisible(true);
		}
		
		

	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void runTime() {// pour afficher date time dans dashboard
		new Thread() {
			public void run() {
				SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Platform.runLater(() -> {
						date_time.setText(format.format(new Date()));
					});
				}
			}
		}.start();
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void displayAdminIDUsername() {// pour afficher no d'utiisateur connecté
		String sql = "SELECT * FROM user WHERE username='" + Data.admin_username + "'";
		connect = Connect.connectDB();
		try {
			prepare = connect.prepareStatement(sql);
			result = prepare.executeQuery();
			if (result.next()) {
				nav_idUser.setText(result.getString("user_id"));
				String tempUsername = result.getString("username");
				tempUsername = tempUsername.substring(0, 1).toUpperCase() + tempUsername.substring(1);// first letter to
																										// upercase
				nav_username.setText(tempUsername);
				top_username.setText(tempUsername);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public static boolean isInteger(String s) {// methode pour tester si int
		return s.matches("^-?\\d+$");
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	
	    private static final String EMAIL_REGEX =
	        "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	    
	    public static boolean isValidEmail(String email) {
	        Pattern pattern = Pattern.compile(EMAIL_REGEX);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void addProduct() {

		// check if we have empty fields
		if (id_product.getText().isEmpty() || name_product.getText().isEmpty() || product_quantity.getText().isEmpty() || product_pu.getText().isEmpty()
				|| product_family.getText().isEmpty() || product_supplier.getText().isEmpty()
				|| product_NLot.getText().isEmpty() || product_supplier_id.getText().isEmpty()) {
			alert.errorMessage("all fields are necessary to filled ");
		} else if (!isInteger(product_quantity.getText())) {
			alert.errorMessage(" quantity not valide");
		} else if (!isInteger(product_pu.getText())) {
			alert.errorMessage("price not valide");
		} else if (!isInteger(product_NLot.getText())) {
			alert.errorMessage("N_Lot not valide");
		} else if (!isInteger(product_supplier_id.getText())) {
			alert.errorMessage("supplier ID  not valide");
		} else {
			double temp = Double.parseDouble(product_pu.getText()) * Integer.parseInt(product_quantity.getText());// prix
																													// total

			String checkN_Lot = "SELECT quantity FROM stock AS s ,supplier AS sp WHERE s.supplier_id=sp.supplier_id  AND N_Lot = '" + product_NLot.getText() + "' AND s.supplier_id ='"+product_supplier_id.getText()+"'";// pour faire test  sur exitance de stock
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkN_Lot);
				if (result.next()) {
					int x=result.getInt("quantity") + Integer.parseInt(product_quantity.getText());
					String insertData2 = "UPDATE stock SET quantity ='"+x+"' WHERE  N_Lot= '" + product_NLot.getText()+ "'";
					prepare = connect.prepareStatement(insertData2);
					prepare.executeUpdate();
					
					String insertData8 = "UPDATE product SET QTE ='"+x+"' WHERE  N_Lot= '" + product_NLot.getText()+ "'";
					prepare = connect.prepareStatement(insertData8);
					prepare.executeUpdate();
					alert.successMessage("Registered successfully!");
					cancelProduct();

							

						}
					else {// si non creer un stock
					String checkIdSupp = "SELECT * FROM supplier WHERE supplier_id ='" + product_supplier_id.getText()
							+ "'";// pour test si supplier existe
					statement = connect.createStatement();
					result = statement.executeQuery(checkIdSupp);
					if (result.next()) {// si oui creer un stock et product
						try {
							
							String insertData1 = "INSERT INTO product "
									+ "(id_product,Label_Of_Product,QTE,PU,Total_Price,Family,N_Lot)" + "Value(?,?,?,?,?,?,?)";
							prepare = connect.prepareStatement(insertData1);
							prepare.setString(1, id_product.getText());
							prepare.setString(2, name_product.getText());
							prepare.setInt(3, Integer.parseInt(product_quantity.getText()));
							prepare.setDouble(4, Double.parseDouble(product_pu.getText()));
							prepare.setDouble(5, temp);
							prepare.setString(6, product_family.getText());
							prepare.setString(7, product_NLot.getText());
							prepare.executeUpdate();

							String insertData2 = "INSERT INTO stock " + "(N_Lot,itemName,quantity,price,family,supplier_id)"
									+ "Value(?,?,?,?,?,?)";
							prepare = connect.prepareStatement(insertData2);
							prepare.setString(1, product_NLot.getText());
							prepare.setString(2, "stock of " + product_family.getText());
							prepare.setInt(3, Integer.parseInt(product_quantity.getText()));
							prepare.setDouble(4, temp);
							prepare.setString(5, product_family.getText());
							prepare.setString(6, product_supplier_id.getText());
							prepare.executeUpdate();
							alert.successMessage("Registered successfully!");
							stockShowData();

							productShowData();
							cancelProduct();
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {// si non creer un stock et product et supplier
						alert.errorMessage("Supplier ID is not exist you have to add it ");
						
						product_form.setVisible(false);
						addsupplier2.setVisible(true);
						ID_supplier2.setText(product_supplier_id.getText());
						name_supplier2.setText(product_supplier.getText());
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		productShowData();
		

	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void addSupplier() {

		if (name_supplier.getText().isEmpty() || email_supplier.getText().isEmpty() || tele_supplier.getText().isEmpty()
				|| address_supplier.getText().isEmpty() || ID_supplier.getText().isEmpty()
				|| status_supplier.getSelectionModel().getSelectedItem() == null) {
			alert.errorMessage("all fields are necessary to filled ");

		} else if (!isValidEmail(email_supplier.getText())) {
			alert.errorMessage("email not valide");
		}else {
			String checkSuppId = "SELECT * FROM supplier  WHERE supplier_id = '" + ID_supplier.getText() + "'";
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkSuppId);
				if (result.next()) {// si oui
					alert.errorMessage(ID_supplier.getText() + " is already exist ");
				} else {// si non creer supplier
					String insertData = "INSERT INTO supplier "
							+ "(supplier_id ,Name,Contact_Number,Email_Address,Address,Status)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData);
					prepare.setString(1, ID_supplier.getText());
					prepare.setString(2, name_supplier.getText());
					prepare.setString(3, tele_supplier.getText());
					prepare.setString(4, email_supplier.getText());
					prepare.setString(5, address_supplier.getText());
					prepare.setString(6, (String) status_supplier.getSelectionModel().getSelectedItem());

					prepare.executeUpdate();
					
					String insertDat = "INSERT INTO contact "
							+ "(id_contact,Name,Contact_Number,Email_Address,Address,Type)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertDat);
					prepare.setString(1, id_contact.getText());
					prepare.setString(2, name_supplier.getText());
					prepare.setString(3, tele_supplier.getText());
					prepare.setString(4, email_supplier.getText());
					prepare.setString(5, address_supplier.getText());
					prepare.setString(6, "supplier");
					prepare.executeUpdate();
					alert.successMessage("Registered successfully!");
					
					supplierShowData();
					contactShowData();
					cancel2();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		supplierShowData();
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void addSupplier2() {

		

		if (name_supplier2.getText().isEmpty() || email_supplier2.getText().isEmpty()
				|| tele_supplier2.getText().isEmpty() || address_supplier2.getText().isEmpty()
				|| ID_supplier2.getText().isEmpty() || status_supplier2.getSelectionModel().getSelectedItem() == null) {
			alert.errorMessage("all fields are necessary to filled ");

		}else if (!isValidEmail(email_supplier2.getText())) {
			alert.errorMessage("email not valide");
		} else {
			double temp = Double.parseDouble(product_pu.getText()) * Integer.parseInt(product_quantity.getText());

			String checkSuppId = "SELECT * FROM supplier  WHERE supplier_id = '" + ID_supplier2.getText() + "'";
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkSuppId);
				if (result.next()) {// si oui
					alert.errorMessage(ID_supplier2.getText() + " is already exist ");
				} else {// si non creer supplier
					String insertData = "INSERT INTO supplier "
							+ "(supplier_id ,Name,Contact_Number,Email_Address,Address,Status)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData);
					prepare.setString(1, ID_supplier2.getText());
					prepare.setString(2, name_supplier2.getText());
					prepare.setString(3, tele_supplier2.getText());
					prepare.setString(4, email_supplier2.getText());
					prepare.setString(5, address_supplier2.getText());
					prepare.setString(6, (String) status_supplier2.getSelectionModel().getSelectedItem());
					prepare.executeUpdate();
					
					String insertD = "INSERT INTO contact "
							+ "(id_contact,Name,Contact_Number,Email_Address,Address,Type)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertD);
					prepare.setString(1, id_contact.getText());

					prepare.setString(2, name_supplier2.getText());
					prepare.setString(3, tele_supplier2.getText());
					prepare.setString(4, email_supplier2.getText());
					prepare.setString(5, address_supplier2.getText());
					prepare.setString(6, "supplier");
					prepare.executeUpdate();
				
					
					
					String insertData2 = "INSERT INTO stock " + "(N_Lot,itemName,quantity,price,family,supplier_id)"
							+ "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData2);
					prepare.setString(1, product_NLot.getText());
					prepare.setString(2, "stock of " + name_product.getText());
					prepare.setInt(3, Integer.parseInt(product_quantity.getText()));
					prepare.setDouble(4, temp);
					prepare.setString(5, product_family.getText());

					prepare.setString(6, product_supplier_id.getText());
					prepare.executeUpdate();
					stockShowData();


					String insertData1 = "INSERT INTO product "
							+ "(id_product,Label_Of_Product,QTE,PU,Total_Price,Family,N_Lot)" + "Value(?,?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData1);
					prepare.setString(1, id_product.getText());
					prepare.setString(2, name_product.getText());
					prepare.setInt(3, Integer.parseInt(product_quantity.getText()));
					prepare.setDouble(4, Double.parseDouble(product_pu.getText()));
					prepare.setDouble(5, temp);
					prepare.setString(6, product_family.getText());
					prepare.setString(7, product_NLot.getText());
					prepare.executeUpdate();
					
					productShowData();
					supplierShowData();
					contactShowData();
					//add a stock show data

					alert.successMessage("Registered successfully!");
					cancel();
					
					name_product.setText("");
					product_quantity.setText("");
					product_pu.setText("");
					product_family.setText("");
					product_NLot.setText("");
					product_supplier.setText("");
					product_supplier_id.setText("");
					
					cancelProduct();

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*
	
	
	// ---------------------------------addcontact---------------------------------------------------------------------------------------------------------------------------------*
	public void addContact() {

		

		if (name_contact.getText().isEmpty() || tele_contact.getText().isEmpty()
				|| email_contact.getText().isEmpty() || address_contact.getText().isEmpty()
				|| type_contact.getSelectionModel().getSelectedItem() == null) {
			alert.errorMessage("all fields are necessary to filled ");

		}else if (!isValidEmail(email_contact.getText())) {
			alert.errorMessage("email not valide");
			
		} else {
			String checkPhoneNumber = "SELECT * FROM contact  WHERE Contact_Number = '" + tele_contact.getText() + "'";
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkPhoneNumber);
				if (result.next()) {// si oui
					alert.errorMessage(tele_contact.getText() + " is already exist ");
				} else {
					String insertData = "INSERT INTO contact "
							+ "(id_contact,Name,Contact_Number,Email_Address,Address,Type)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData);
					prepare.setString(1, id_contact.getText());

					prepare.setString(2, name_contact.getText());
					prepare.setString(3, tele_contact.getText());
					prepare.setString(4, email_contact.getText());
					prepare.setString(5, address_contact.getText());
					if(type_contact.getSelectionModel().getSelectedItem()!="other") {
						other_fieledContact.setVisible(false);
						prepare.setString(6, (String)type_contact.getSelectionModel().getSelectedItem());
					}
					else {
						if(other_fieledContact.getText().isEmpty()) {
						alert.errorMessage("you have to insert type of contact");
						}else {
					

						prepare.setString(6,other_fieledContact.getText() );}
					}
					
					prepare.executeUpdate();
					alert.successMessage("Registered successfully!");
					contactID();
					contactShowData();
					cancelContact();	

				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}}
		
	}	
	
	// ----------cancel supplier2--------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void cancel() {
		ID_supplier2.setText("");
		name_supplier2.setText("");
		tele_supplier2.setText("");
		email_supplier2.setText("");
		status_supplier2.getSelectionModel().clearSelection();
		address_supplier2.setText("");
		product_form.setVisible(true);
		addsupplier2.setVisible(false);
	}
	// ------------------------------------cancel supplier------------------------------------------------------------------------------------------------------------------------------*/


	public void cancel2() {
		ID_supplier.setText("");
		name_supplier.setText("");
		tele_supplier.setText("");
		email_supplier.setText("");
		status_supplier.getSelectionModel().clearSelection();
		address_supplier.setText("");
	}
	
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void cancelProduct() {
		id_product.setText("");
		name_product.setText("");
		product_quantity.setText("");
		product_pu.setText("");
		product_family.setText("");
		product_NLot.setText("");
		product_supplier.setText("");
		product_supplier_id.setText("");
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void cancelContact() {
		
		name_contact.clear();
		tele_contact.clear();
		email_contact.clear();
		address_contact.clear();
		type_contact.getSelectionModel().clearSelection();
		other_fieledContact.setVisible(false);
		contactID();

		
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void cancelStock() {
		num_stock.setText("");
		name_stock.setText("");
		quantity_stock.setText("");
		family_stock.setText("");
		supplier_id_stock.setText("");
		price_stock.setText("");


		
	}
	
	
	
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	
	public void cancelsupplierStock() {
		ID_supplier3.setText("");
		name_supplier3.setText("");
		tele_supplier3.setText("");
		email_supplier3.setText("");
		status_supplier3.getSelectionModel().clearSelection();
		address_supplier3.setText("");
		addsupplier3.setVisible(false);
		addstock_form.setVisible(true);

	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*
	
	public void addStock() {
		
		if (num_stock.getText().isEmpty() || name_stock.getText().isEmpty()
				|| quantity_stock.getText().isEmpty() || price_stock.getText().isEmpty()
				|| supplier_id_stock.getText().isEmpty() || family_stock.getText().isEmpty()  ) {
			alert.errorMessage("all fields are necessary to filled ");

		}else if (!isInteger(num_stock.getText())) {
			alert.errorMessage(" number of stock not valide");
			
		} else if (!isInteger(price_stock.getText())) {
			alert.errorMessage(" price of stock not valide");
			
		}else {
			double temp = Double.parseDouble(price_stock.getText());

			String checkNumStock = "SELECT * FROM stock  WHERE N_Lot = '" + num_stock.getText() + "'";
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkNumStock);
				if (result.next()) {// si oui
					alert.errorMessage(num_stock.getText()+ " is already exist ");
				} else {
					String checkSupplierId = "SELECT * FROM supplier  WHERE supplier_id = '" + supplier_id_stock.getText() + "'";
					connect = Connect.connectDB();
					try {
						statement = connect.createStatement();
						result = statement.executeQuery(checkSupplierId);
						if (result.next()) {
							String insertData2 = "INSERT INTO stock " + "(N_Lot,itemName,quantity,price,family,supplier_id)"
									+ "Value(?,?,?,?,?,?)";
							prepare = connect.prepareStatement(insertData2);
							prepare.setString(1, num_stock.getText());
							prepare.setString(2, name_stock.getText());
							prepare.setInt(3, Integer.parseInt(quantity_stock.getText()));
							prepare.setDouble(4, temp);
							prepare.setString(5, family_stock.getText());
							prepare.setString(6, supplier_id_stock.getText());
							prepare.executeUpdate();
							stockShowData();

							
							//add methode of show stock
							alert.successMessage("Registered successfully!");

							
						}
						else {
							alert.errorMessage("Supplier ID is not exist you have to add it ");
							addsupplier3.setVisible(true);
							addstock_form.setVisible(false);
							ID_supplier3.setText(supplier_id_stock.getText());
							
						}
						}catch(Exception e) {e.printStackTrace();}
					}
					
				}catch(Exception e) {e.printStackTrace();}}}
							
						
							
	// --------------------------add supplier if not exist when i want to add an stock----------------------------------------------------------------------------------------------------------------------------------------*/

		
	
	
	public void addSupplier3() {

		

		if (name_supplier3.getText().isEmpty() || email_supplier3.getText().isEmpty()
				|| tele_supplier3.getText().isEmpty() || address_supplier3.getText().isEmpty()
				|| ID_supplier3.getText().isEmpty() || status_supplier3.getSelectionModel().getSelectedItem() == null) {
			alert.errorMessage("all fields are necessary to filled ");

		}else if (!isValidEmail(email_supplier3.getText())) {
			alert.errorMessage("email not valide");
		} else {
			double temp = Double.parseDouble(price_stock.getText());

			String checkSuppId = "SELECT * FROM supplier  WHERE supplier_id = '" + ID_supplier3.getText() + "'";
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkSuppId);
				if (result.next()) {// si oui
					alert.errorMessage(ID_supplier3.getText() + " is already exist ");
				} else {// si non creer supplier
					String insertData = "INSERT INTO supplier "
							+ "(supplier_id ,Name,Contact_Number,Email_Address,Address,Status)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData);
					prepare.setString(1, ID_supplier3.getText());
					prepare.setString(2, name_supplier3.getText());
					prepare.setString(3, tele_supplier3.getText());
					prepare.setString(4, email_supplier3.getText());
					prepare.setString(5, address_supplier3.getText());
					prepare.setString(6, (String) status_supplier3.getSelectionModel().getSelectedItem());
					prepare.executeUpdate();
					
					String insertD = "INSERT INTO contact "
							+ "(id_contact,Name,Contact_Number,Email_Address,Address,Type)" + "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertD);
					prepare.setString(1, id_contact.getText());
					prepare.setString(1, name_supplier3.getText());
					prepare.setString(2, tele_supplier3.getText());
					prepare.setString(3, email_supplier3.getText());
					prepare.setString(4, address_supplier3.getText());
					prepare.setString(5, "supplier");
					prepare.executeUpdate();
					
					
					String insertData2 = "INSERT INTO stock " + "(N_Lot,itemName,quantity,price,family,supplier_id)"
							+ "Value(?,?,?,?,?,?)";
					prepare = connect.prepareStatement(insertData2);
					prepare.setString(1, num_stock.getText());
					prepare.setString(2, name_stock.getText());
					prepare.setInt(3, Integer.parseInt(quantity_stock.getText()));
					prepare.setDouble(4, temp);
					prepare.setString(5, family_stock.getText());
					prepare.setString(6, supplier_id_stock.getText());
					prepare.executeUpdate();
					
					supplierShowData();
					contactShowData();
					stockShowData();

					//add methode of show stock



					alert.successMessage("Registered successfully!");
					cancelsupplierStock();
					
					num_stock.setText("");
					name_stock.setText("");
					quantity_stock.setText("");
					family_stock.setText("");
					supplier_id_stock.setText("");
					price_stock.setText("");
					

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	private String[] questionList = { "Active", "Inactive" };

	public void questions() {
		List<String> listq = new ArrayList<String>();
		for (String data : questionList) {
			listq.add(data);
		}
		ObservableList listData = FXCollections.observableArrayList(listq);
		status_supplier.setItems(listData);

	}
	// ---------------------------for addsupplier of the stock---------------------------------------------------------------------------------------------------------------------------------------*/

	

		public void questions4() {
			List<String> listq = new ArrayList<String>();
			for (String data : questionList) {
				listq.add(data);
			}
			ObservableList listData = FXCollections.observableArrayList(listq);
			status_supplier3.setItems(listData);

		}
	// -------------------------------------------------for addsupplier of the product-----------------------------------------------------------------------------------------------------------------*/


	public void questions2() {
		List<String> listq = new ArrayList<String>();
		for (String data : questionList) {
			listq.add(data);
		}
		ObservableList listData = FXCollections.observableArrayList(listq);
		status_supplier2.setItems(listData);

	}
	// --------------------------------------for addsupplier of the contact----------------------------------------------------------------------------------------------------------------------------*/

	private String[] questionListContact = { "supplier", "client","friend","other" };

	public void questions3() {
		List<String> listq = new ArrayList<String>();
		for (String data : questionListContact) {
			listq.add(data);
		}
		ObservableList listData = FXCollections.observableArrayList(listq);
		type_contact.setItems(listData);
		if(type_contact.getSelectionModel().getSelectedItem()=="other") {
			other_fieledContact.setVisible(true);
		}
		
		else if(type_contact.getSelectionModel().getSelectedItem()!="other") {
			other_fieledContact.setVisible(false);
		}

	}
	// ----------------------------------show products--------------------------------------------------------------------------------------------------------------------------------*/
	public ObservableList<Product> productGetData(){
		ObservableList<Product> listData=FXCollections.observableArrayList();
		String sql="SELECT * FROM product WHERE date_delete IS NULL";
		connect =Connect.connectDB();
		try {
			prepare = connect.prepareStatement(sql);
			result = prepare.executeQuery(sql);
			
			Product p;
			while(result.next()) {
				p=new Product(result.getString("id_product"),result.getString("Label_Of_Product"),result.getInt("QTE"),result.getDouble("PU"),result.getDouble("Total_Price"),result.getString("Family"),result.getInt("N_Lot"));
				listData.add(p);
			}
			
		}catch(Exception e) {e.printStackTrace();}
		return listData;
	}
	public ObservableList<Product> productListData;
	public void productShowData() {
		productListData=productGetData();
		
		product_tabl_col_id.setCellValueFactory(new PropertyValueFactory<>("id_product"));
		product_col_labelOfProduct.setCellValueFactory(new PropertyValueFactory<>("name_product"));
		product_tabl_col_qte.setCellValueFactory(new PropertyValueFactory<>("product_quantity"));
		product_tabl_col_pu.setCellValueFactory(new PropertyValueFactory<>("product_pu"));
		product_tabl_col_totalPrice.setCellValueFactory(new PropertyValueFactory<>("totaPrice"));
		product_tabl_col_family.setCellValueFactory(new PropertyValueFactory<>("product_family"));
		product_tabl_col_nLot.setCellValueFactory(new PropertyValueFactory<>("product_NLot"));

		product_tabel.setItems(productListData);
	}

	// ---------------------------show supplier---------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	public ObservableList<Supplier> supplierGetData(){
		ObservableList<Supplier> listData=FXCollections.observableArrayList();
		String sql="SELECT * FROM supplier WHERE date_delete IS NULL";
		connect =Connect.connectDB();
		try {
			prepare = connect.prepareStatement(sql);
			result = prepare.executeQuery(sql);
			
			Supplier s;
			while(result.next()) {
				s=new Supplier(result.getString("supplier_id"),result.getString("Name"),result.getString("Contact_Number"),result.getString("Email_Address"),result.getString("Status"),result.getString("Address"));
				listData.add(s);
			}
			
		}catch(Exception e) {e.printStackTrace();}
		return listData;
	}
	public ObservableList<Supplier> supplierListData;
	public void supplierShowData() {
		supplierListData=supplierGetData();
		
		
		
		table_suppliers_col_id.setCellValueFactory(new PropertyValueFactory<>("supplier_id"));
		table_suppliers_col_name.setCellValueFactory(new PropertyValueFactory<>("Name"));
		table_suppliers_col_contactNumber.setCellValueFactory(new PropertyValueFactory<>("Contact_Number"));
		table_suppliers_col_email.setCellValueFactory(new PropertyValueFactory<>("Email_Address"));
		table_suppliers_col_status.setCellValueFactory(new PropertyValueFactory<>("Status"));
		table_suppliers_col_address.setCellValueFactory(new PropertyValueFactory<>("Address"));

		table_suppliers.setItems(supplierListData);
	}
	// ---------------------------show contact---------------------------------------------------------------------------------------------------------------------------------------*/
		//private String supplier_id ;
		
		public ObservableList<Contact> contactGetData(){
			ObservableList<Contact> listData=FXCollections.observableArrayList();
			String sql="SELECT * FROM contact WHERE date_delete IS NULL";
			connect =Connect.connectDB();
			try {
				prepare = connect.prepareStatement(sql);
				result = prepare.executeQuery(sql);
				
				Contact c;
				while(result.next()) {
					c=new Contact(result.getString("id_contact"),result.getString("Name"),result.getString("Contact_Number"),result.getString("Email_Address"),result.getString("Address"),result.getString("Type"));
					listData.add(c);
				}
				
			}catch(Exception e) {e.printStackTrace();}
			return listData;
		}
		
		public ObservableList<Contact> contactListData;
		public void contactShowData() {
			contactListData=contactGetData();
			
			
			
			table_contact_col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
			table_contact_col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
			table_contact_col_contactNumber.setCellValueFactory(new PropertyValueFactory<>("contact_Number"));
			table_contact_col_email.setCellValueFactory(new PropertyValueFactory<>("email_Address"));
			table_contact_col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
			table_contact_col_type.setCellValueFactory(new PropertyValueFactory<>("type"));

			table_contact.setItems(contactListData);
			
		}
		
		// ---------------------------show stock---------------------------------------------------------------------------------------------------------------------------------------*/
		
		
		public ObservableList<Stock> stockGetData(){
			ObservableList<Stock> listData=FXCollections.observableArrayList();
			String sql="SELECT * FROM stock WHERE date_delete IS NULL";
			connect =Connect.connectDB();
			try {
				prepare = connect.prepareStatement(sql);
				result = prepare.executeQuery(sql);
				
				Stock s;
				while(result.next()) {
					s=new Stock(result.getInt("N_Lot"),result.getString("itemName"),result.getInt("quantity"),result.getDouble("price"),result.getInt("supplier_id"),result.getString("family"));
					listData.add(s);
				}
				
			}catch(Exception e) {e.printStackTrace();}
			return listData;
		}
		public ObservableList<Stock> stockListData;
		public void stockShowData() {
			stockListData=stockGetData();
			
			
			
			stocks_tabl_col_NLot.setCellValueFactory(new PropertyValueFactory<>("n_lot"));
			stocks_tabl_col_name.setCellValueFactory(new PropertyValueFactory<>("itemName"));
			stocks_tabl_col_qte.setCellValueFactory(new PropertyValueFactory<>("quantity"));
			stocks_tabl_col_pu.setCellValueFactory(new PropertyValueFactory<>("price"));
			stocks_tabl_col_family.setCellValueFactory(new PropertyValueFactory<>("family"));
			stocks_tabl_col_supplier.setCellValueFactory(new PropertyValueFactory<>("suppier_id"));

			stocks_tabel.setItems(stockListData);
		}
		
		
		
		
	
	// ---------------------select from tabl contact to crud---------------------------------------------------------------------------------------------------------------------------------------------*/

	public void selectContact() {
		Contact c=table_contact.getSelectionModel().getSelectedItem();
		int num=table_contact.getSelectionModel().getSelectedIndex();
		if((num-1)<-1) {return;}
		name_contact.setText(""+c.getName());
		tele_contact.setText(""+c.getContact_Number());
		email_contact.setText(""+c.getEmail_Address());
		address_contact.setText(""+c.getAddress());
		id_contact.setText(""+c.getId());
		other_fieledContact.setVisible(true);
		other_fieledContact.setText(""+c.getType());
			
	}
	
	// -------------------------------------------------update contact-----------------------------------------------------------------------------------------------------------------*/
	public void updateContact() {

		if (name_contact.getText().isEmpty() || tele_contact.getText().isEmpty()
				|| email_contact.getText().isEmpty() || address_contact.getText().isEmpty() || other_fieledContact.getText().isEmpty()
				) {
			alert.errorMessage("all fields are necessary to filled ");

		}else if (!isValidEmail(email_contact.getText())) {
			alert.errorMessage("email not valide");
			
		}else {
			String sql="UPDATE contact SET Name ='"+name_contact.getText()+"' ,Contact_Number= '"+tele_contact.getText()+"' ,Email_Address ='"+email_contact.getText()
			+"', Address ='"+address_contact.getText()+"',Type ='"+other_fieledContact.getText()+"' WHERE id_contact ='"+
			id_contact.getText()+"'";
			
			connect=Connect.connectDB();
			try {
				if(alert.confirmationMessage("Are you sure you want update this contact ?"));{
				prepare=connect.prepareStatement(sql);
				prepare.executeUpdate();
				cancelContact();
				contactShowData();
				alert.successMessage("successfully update");}
				contactID();
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	
	// -------------------------------------------------delete contact-----------------------------------------------------------------------------------------------------------------*/
		public void deleteContact() {
			if (name_contact.getText().isEmpty() || tele_contact.getText().isEmpty()
					|| email_contact.getText().isEmpty() || address_contact.getText().isEmpty() || other_fieledContact.getText().isEmpty()
					) {
				alert.errorMessage("all fields are necessary to filled ");

			}else {
				String sql="DELETE FROM contact WHERE id_contact  = '"+id_contact.getText()+"'";
				
				connect=Connect.connectDB();
				try {
					if(alert.confirmationMessage("Are you sure you want delete this contact ?"));
					prepare=connect.prepareStatement(sql);
					prepare.executeUpdate();
					cancelContact();
					contactShowData();
					alert.successMessage("successfully delete");
					contactID();
				}catch(Exception e) {e.printStackTrace();}
			
				
			}
		}
		
		
		// ---------------------select from tabl product to crud---------------------------------------------------------------------------------------------------------------------------------------------*/

		public void selectProduct() {
			int x;
			String y;
			Product p=product_tabel.getSelectionModel().getSelectedItem();
			
			String sql="SELECT * FROM stock WHERE N_Lot ='"+p.getProduct_NLot()+"'";
			connect = Connect.connectDB();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(sql);
				if (result.next()) {
					
					 x=result.getInt("supplier_id");
					 p.setId_supplier(x);
					 String sql2="SELECT * FROM supplier WHERE supplier_id ='"+x+"'";
						connect = Connect.connectDB();
						try {
							statement = connect.createStatement();
							result = statement.executeQuery(sql2);
							if (result.next()) {
								
								 y=result.getString("Name");
								 p.setSupplier(y);
						}}catch(Exception e) {e.printStackTrace();}
					 
					 
					}
				}catch(Exception e) {e.printStackTrace();}
			int num=product_tabel.getSelectionModel().getSelectedIndex();
			if((num-1)<-1) {return;}
			id_product.setText(""+p.getId_product());
			name_product.setText(""+p.getName_product());
			product_quantity.setText(""+p.getProduct_quantity());
			product_pu.setText(""+p.getProduct_pu());
			product_family.setText(""+p.getProduct_family());
			product_supplier.setText(""+p.getSupplier());
			product_supplier_id.setText(""+p.getId_supplier());
			product_NLot.setText(""+p.getProduct_NLot());

			

				
		}
		
		
		// -------------------------------------------------update product-----------------------------------------------------------------------------------------------------------------*/
		public void updateProduct() {

			if (id_product.getText().isEmpty() || name_product.getText().isEmpty()
					|| product_quantity.getText().isEmpty() || product_pu.getText().isEmpty()
					|| product_family.getText().isEmpty() || product_supplier.getText().isEmpty()
					|| product_NLot.getText().isEmpty() || product_supplier_id.getText().isEmpty()) {
				alert.errorMessage("all fields are necessary to filled ");
			} else if (!isInteger(product_quantity.getText())) {
				alert.errorMessage(" quantity not valide");
			} else if (!isInteger(product_pu.getText())) {
				alert.errorMessage("price not valide");
			} else if (!isInteger(product_NLot.getText())) {
				alert.errorMessage("N_Lot not valide");
			} else if (!isInteger(product_supplier_id.getText())) {
				alert.errorMessage("supplier ID  not valide");
			} else { 
				double temp = Double.parseDouble(product_pu.getText()) * Integer.parseInt(product_quantity.getText());
				
				
				String sql="UPDATE product SET id_product ='"+id_product.getText()+"' ,Label_Of_Product ='"+name_product.getText()+"' ,QTE= '"+Integer.parseInt(product_quantity.getText())+"' ,PU ='"+Double.parseDouble(product_pu.getText())

				+"', Total_Price ='"+temp+"',Family ='"+product_family.getText()+"',N_Lot  ='"+product_NLot.getText()+"' WHERE id_product   ='"+
				id_product.getText()+"'";
				
				connect=Connect.connectDB();
				try {
					if(alert.confirmationMessage("Are you sure you want update this product ?"));{
					prepare=connect.prepareStatement(sql);
					prepare.executeUpdate();
					
					String sql2="UPDATE stock SET quantity ='"+Integer.parseInt(product_quantity.getText())+"' , price = '"+temp+"' where N_Lot ='"+product_NLot.getText()+"'";
					prepare=connect.prepareStatement(sql2);
					prepare.executeUpdate();
					
					cancelProduct();
					productShowData();
					stockShowData();
					alert.successMessage("successfully update");}
				}catch(Exception e) {e.printStackTrace();}
			}
		}
		
		// -------------------------------------------------delete product-----------------------------------------------------------------------------------------------------------------*/
			public void deleteProduct() {
				if (id_product.getText().isEmpty()) {
					alert.errorMessage("you have to insert the ID of Product ");
				
				} else
						if(alert.confirmationMessage("Are you sure you want delete this product ?"));{
						
						
						String checkN_Lot = "SELECT quantity FROM stock AS s ,supplier AS sp WHERE s.supplier_id=sp.supplier_id  AND N_Lot = '" + product_NLot.getText() + "' AND s.supplier_id ='"+product_supplier_id.getText()+"'";// pour faire test  sur exitance de stock
						connect = Connect.connectDB();
						try {
							statement = connect.createStatement();
							result = statement.executeQuery(checkN_Lot);
							if (result.next()) {
								int x=result.getInt("quantity") -1;
								if(x==0) {
									String sql="DELETE FROM product WHERE id_product = '"+id_product.getText()+"'";
									
									connect=Connect.connectDB();
										prepare=connect.prepareStatement(sql);
										prepare.executeUpdate();
										cancelProduct();
										productShowData();
										stockShowData();

										alert.successMessage("successfully delete");
									
								}else if(x>0){
								String insertData2 = "UPDATE stock SET quantity ='"+x+"' WHERE  N_Lot= '" + product_NLot.getText()+ "'";
								prepare = connect.prepareStatement(insertData2);
								prepare.executeUpdate();
								String insertDataprixTotal = "UPDATE product SET Total_Price ='"+Double.parseDouble(product_pu.getText()) * (Integer.parseInt(product_quantity.getText())-1)

								+"' WHERE  N_Lot= '" + product_NLot.getText()+ "'";
								prepare = connect.prepareStatement(insertDataprixTotal);
								prepare.executeUpdate();

								String insertData8 = "UPDATE product SET QTE ='"+x+"' WHERE  N_Lot= '" + product_NLot.getText()+ "'";
								prepare = connect.prepareStatement(insertData8);
								prepare.executeUpdate();
								
								alert.successMessage("Registered successfully!");
								cancelProduct();
						productShowData();
						stockShowData();

						alert.successMessage("successfully delete");
						contactID();}
					}}catch(Exception e) {e.printStackTrace();}}
				
					
				}
			
			// ---------------------select from tabl stock to crud---------------------------------------------------------------------------------------------------------------------------------------------*/

			public void selectStock() {
				Stock s=stocks_tabel.getSelectionModel().getSelectedItem();
				int num=stocks_tabel.getSelectionModel().getSelectedIndex();
				if((num-1)<-1) {return;}
				num_stock.setText(""+s.getN_lot());
				name_stock.setText(""+s.getItemName());
				quantity_stock.setText(""+s.getQuantity());
				price_stock.setText(""+s.getPrice());
				supplier_id_stock.setText(""+s.getSuppier_id());
				family_stock.setText(""+s.getFamily());
					
			}
			
			// -------------------------------------------------update stock-----------------------------------------------------------------------------------------------------------------*/
			public void updateStock() {

				if (num_stock.getText().isEmpty() || name_stock.getText().isEmpty()
						|| quantity_stock.getText().isEmpty() || price_stock.getText().isEmpty()
						|| supplier_id_stock.getText().isEmpty() || family_stock.getText().isEmpty()  ) {
					alert.errorMessage("all fields are necessary to filled ");

				}else if (!isInteger(num_stock.getText())) {
					alert.errorMessage(" number of stock not valide");
					
				} else if (!isInteger(price_stock.getText())) {
					alert.errorMessage(" price of stock not valide");
					
				}else {
					double temp = Double.parseDouble(price_stock.getText());
					
					
					String sql="UPDATE stock SET N_Lot  ='"+num_stock.getText()+"' ,itemName ='"+name_stock.getText()+"' ,quantity= '"+Integer.parseInt(quantity_stock.getText())+"' ,price ='"+Double.parseDouble(price_stock.getText())
					+"', family ='"+family_stock.getText()+"',supplier_id  ='"+supplier_id_stock.getText()+"'where N_Lot ='"+num_stock.getText()+"'";
					
					connect=Connect.connectDB();
					try {
						if(alert.confirmationMessage("Are you sure you want update this stock ?"));{
						prepare=connect.prepareStatement(sql);
						prepare.executeUpdate();
						
						String sql2="UPDATE product SET QTE ='"+Integer.parseInt(quantity_stock.getText())+"' , price = '"+temp/Double.parseDouble(quantity_stock.getText())+"' where N_Lot ='"+num_stock.getText()+"'";
						prepare=connect.prepareStatement(sql2);
						prepare.executeUpdate();
						
						cancelStock();
						productShowData();
						stockShowData();
						alert.successMessage("successfully update");}
					}catch(Exception e) {e.printStackTrace();}
				}
			}
			// -------------------------------------------------delete stock-----------------------------------------------------------------------------------------------------------------*/
						public void deleteStock() {
							if (num_stock.getText().isEmpty() ) {
								alert.errorMessage("you have to insert the ID LOT");

							}else {
									if(alert.confirmationMessage("Are you sure you want delete this product ?"));
										String sql="DELETE FROM stock WHERE N_Lot  = '"+num_stock.getText()+"'";
												try {
												connect=Connect.connectDB();
													prepare=connect.prepareStatement(sql);
													prepare.executeUpdate();
													
													
													String sql2="DELETE FROM product WHERE N_Lot  = '"+num_stock.getText()+"'";
													connect=Connect.connectDB();
													prepare=connect.prepareStatement(sql2);
													prepare.executeUpdate();
													productShowData();
													cancelStock();
													stockShowData();

													alert.successMessage("successfully delete");
													}catch(Exception e) {e.printStackTrace();}
												
											
							}}
						
						// ---------------------select from tabl supplier to crud---------------------------------------------------------------------------------------------------------------------------------------------*/

						public void selectSupplier() {
							Supplier sp=table_suppliers.getSelectionModel().getSelectedItem();
							int num=table_suppliers.getSelectionModel().getSelectedIndex();
							if((num-1)<-1) {return;}
							name_supplier.setText(""+sp.getName());
							tele_supplier.setText(""+sp.getContact_Number());
							email_supplier.setText(""+sp.getEmail_Address());
							address_supplier.setText(""+sp.getAddress());
							ID_supplier.setText(""+sp.getSupplier_id());
							
								
						}
						
						// -------------------------------------------------update supplier-----------------------------------------------------------------------------------------------------------------*/
						public void updateSupplier() {

							if (name_supplier.getText().isEmpty() || email_supplier.getText().isEmpty()
									|| tele_supplier.getText().isEmpty() || address_supplier.getText().isEmpty()
									|| ID_supplier.getText().isEmpty()
									) {
								alert.errorMessage("all fields are necessary to filled ");

							} else if(status_supplier.getSelectionModel().getSelectedItem() == null) {
								alert.errorMessage("please select status");

							}
							else if (!isValidEmail(email_supplier.getText())) {
								alert.errorMessage("email not valide");
							} else {

								String sql = "UPDATE supplier SET supplier_id   ='" + ID_supplier.getText()
										+ "' ,Name ='" + name_supplier.getText() + "' ,Contact_Number= '"
										+ tele_supplier.getText() + "' ,Email_Address ='" + email_supplier.getText()
										+ "', Address ='" + address_supplier.getText() + "',Status  ='"
										+ status_supplier.getSelectionModel().getSelectedItem()
										+ "'where supplier_id ='" + ID_supplier.getText() + "'";

								connect = Connect.connectDB();
								try {
									if (alert.confirmationMessage("Are you sure you want update this supplier ?"))
										;
									{
										prepare = connect.prepareStatement(sql);
										prepare.executeUpdate();

										cancel2();
										supplierShowData();
										alert.successMessage("successfully update");
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
						// -------------------------------------------------delete stock-----------------------------------------------------------------------------------------------------------------*/
						public void deleteSupplier() {
							if (ID_supplier.getText().isEmpty() ) {
								alert.errorMessage("you have to insert the id supplier ");

							} else {
								if (alert.confirmationMessage("Are you sure you want delete this supplier ?"))
									{
								String sql = "DELETE FROM supplier WHERE supplier_id   = '" + ID_supplier.getText() + "'";
								try {
									connect = Connect.connectDB();
									prepare = connect.prepareStatement(sql);
									prepare.executeUpdate();

									
									supplierShowData();
									cancel2();
									alert.successMessage("successfully delete");
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}}
									
	// --------------------------------------------------------------------for make id disable and always increment----------------------------------------------------------------------------------------------*/
	private Integer maxcontactId;
	public void getcontactId() {
		String sql="SELECT MAX(id_contact) FROM contact";
		connect=Connect.connectDB();
		int tmpID=0;
		try {
			prepare=connect.prepareStatement(sql);
			result=prepare.executeQuery();
			if(result.next()) {
				tmpID=result.getInt("MAX(id_contact)");
			}
			if(tmpID==0) {
				tmpID+=1;}
			else {
				tmpID+=1;
			}
			
			maxcontactId=tmpID;
		}catch(Exception e) {e.printStackTrace();}
	}
	
	//-------------------------
	
	public void contactID() {
		 getcontactId();
		id_contact.setText(""+maxcontactId);
		id_contact.setDisable(true);
	}
	
		
		// -------------------------------------------------add to sell-----------------------------------------------------------------------------------------------------------------*/

	public void insertTable_sell() {
		
		
		String sql="SELECT * FROM product WHERE Label_Of_Product ='"+Name_product_toSell.getText()+"'";
		connect = Connect.connectDB();
		try {
				prepare = connect.prepareStatement(sql);
				result = prepare.executeQuery(sql);
				
				Product p;
				
				if(result.next()) {
					p=new Product(result.getString("id_product"),result.getString("Label_Of_Product"),result.getInt("QTE"),result.getDouble("PU"),result.getDouble("Total_Price"),result.getString("Family"),result.getInt("N_Lot"));
					
					String sql2="INSERT INTO table_sell (ID ,label_of_product,Qte,pu,total_price,family,n_lot)"+" VALUES(?,?,?,?,?,?,?)";
					prepare = connect.prepareStatement(sql2);
					prepare.setString(1, p.getId_product());
					prepare.setString(2,p.getName_product());
					prepare.setInt(3, Integer.parseInt(quantity_product_toSell.getText()));
					prepare.setDouble(4,p.getProduct_pu());
					prepare.setDouble(5,p.getProduct_pu()*Double.parseDouble(quantity_product_toSell.getText()));
					prepare.setString(6,p.getProduct_family());
					prepare.setInt(7, p.getProduct_NLot());
					prepare.executeUpdate();}else {
						alert.errorMessage("there is no product like '"+Name_product_toSell.getText()+"'");
					}
	}catch(Exception e) {e.printStackTrace();}}
	
	//****************for get data from database to constructor to use it in showtable_sell
	
	public ObservableList<ProductToSell> table_sellGetData(){
		ObservableList<ProductToSell> listData=FXCollections.observableArrayList();
		String sql="SELECT * FROM table_sell WHERE date_delete IS NULL";
		connect =Connect.connectDB();
		try {
			prepare = connect.prepareStatement(sql);
			result = prepare.executeQuery(sql);
			
			ProductToSell p;
			while(result.next()) {
				p=new ProductToSell(result.getString("ID"),result.getString("label_of_product"),result.getInt("Qte"),result.getDouble("pu")
						,result.getDouble("total_price"),result.getString("family"),result.getInt("n_lot"));
				listData.add(p);
			}
			}catch(Exception e) {e.printStackTrace();}
		return listData;
		}
	
	
	//---------------//for show data in table 
	ObservableList<ProductToSell> productSellListData;
	public void showtable_sell() {
	productSellListData=table_sellGetData();
	
	
	dashboard_tabl_col_idSell.setCellValueFactory(new PropertyValueFactory<>("id_product"));
	dashboard_tabl_col_labelOfProductSell.setCellValueFactory(new PropertyValueFactory<>("name_product"));
	dashboard_tabl_col_qteSell.setCellValueFactory(new PropertyValueFactory<>("product_quantity"));
	dashboard_tabl_col_puSell.setCellValueFactory(new PropertyValueFactory<>("product_pu"));
	dashboard_tabl_col_totalPriceSell.setCellValueFactory(new PropertyValueFactory<>("totaPrice"));
	dashboard_tabl_col_familySell.setCellValueFactory(new PropertyValueFactory<>("product_family"));
	dashboard_tabl_col_nLotSell.setCellValueFactory(new PropertyValueFactory<>("product_NLot"));

	dashboard_tabelSell.setItems(productSellListData);}
//----------------//here i add elements to table_sell
	
	public void AddToSell() {
		if(Name_product_toSell.getText().isEmpty() || quantity_product_toSell.getText().isEmpty()) {
			alert.errorMessage("all the fields must be filled");}
		else {
		String sqli="SELECT Qte FROM table_sell WHERE label_of_product='"+Name_product_toSell.getText()+"'";
		connect =Connect.connectDB();
		try {
			prepare = connect.prepareStatement(sqli);
			result = prepare.executeQuery(sqli);
			if(result.next()) {
				int x=result.getInt("Qte")+ Integer.parseInt(quantity_product_toSell.getText());
				String up= "UPDATE table_sell SET Qte   ='" +x
				+ "'where label_of_product ='" + Name_product_toSell.getText() + "'";
				prepare = connect.prepareStatement(up);
				prepare.executeUpdate();
				showtable_sell();
				Name_product_toSell.setText("");
				quantity_product_toSell.setText("");
				}else {
					
					
					insertTable_sell();
					
					showtable_sell();
					Name_product_toSell.setText("");
					quantity_product_toSell.setText("");
							
						
							
						
				}
				
			


		
		}catch(Exception e) {e.printStackTrace();}}
		}
	
	//complete les buttons validate the sale  and cancel the sale  
	//idea of cancel is remove product in the table 
	//-------------------------------------------------------cancel all button--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void cancelAll() {
		String sql="DELETE  FROM table_sell where date_delete IS NULL";
		connect =Connect.connectDB();
		try {
			if (alert.confirmationMessage("Are you sure you want cancel all the sales ?")) {

		prepare = connect.prepareStatement(sql);
		prepare.executeUpdate();
		showtable_sell();}}catch(Exception e) {e.printStackTrace();
		}
}
	//----------------------------------------------------cancel the sale button-----------------------------------------------------------------
		public void selectProdSale() {
			
				ProductToSell ps=dashboard_tabelSell.getSelectionModel().getSelectedItem();
				int num=dashboard_tabelSell.getSelectionModel().getSelectedIndex();
				if((num-1)<-1) {return;}
				Name_product_toSell.setText(""+ps.getName_product());
				quantity_product_toSell.setText(""+ps.getProduct_quantity());
				
		}
		
		//------------------------------------------------cancel sell button------------------------
	public void cancelSale() {
		if(Name_product_toSell.getText().isEmpty() ) {
			alert.errorMessage("you have to select element");
		}
		else {
			String sql="DELETE  FROM table_sell where label_of_product ='"+Name_product_toSell.getText()+"'";
			connect =Connect.connectDB();
			try {
				if (alert.confirmationMessage("Are you sure you want cancel the sale of this  product ?")) {

			prepare = connect.prepareStatement(sql);
			prepare.executeUpdate();
			showtable_sell();
			Name_product_toSell.setText("");
			quantity_product_toSell.setText("");}}catch(Exception e) {e.printStackTrace();
			}
		}
		
	}
	//--------------------update sell button---------------------------------------------------------------------------------------------
	public void updateSell() {
		if(Name_product_toSell.getText().isEmpty() || quantity_product_toSell.getText().isEmpty()) {
			alert.errorMessage("all fields have be filled");
		}
		else {
			String sql="UPDATE table_sell SET Qte='" +quantity_product_toSell.getText()+ "'where label_of_product ='" + Name_product_toSell.getText() + "'";
			try {
			prepare = connect.prepareStatement(sql);
			prepare.executeUpdate();
			showtable_sell();
			Name_product_toSell.setText("");
			quantity_product_toSell.setText("");
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	//-------------------------------------------------validate sale button----------------------------------------------------------------------------------------------------------------------------
	//-------------get data for fill constructor of invoice----------
	public ObservableList<ProductToSell> table_sellGetDataInvoice(){
		ObservableList<ProductToSell> listData=FXCollections.observableArrayList();
		String sql="SELECT * FROM table_sell WHERE date_delete IS NULL";
		connect =Connect.connectDB();
		try {
			prepare = connect.prepareStatement(sql);
			result = prepare.executeQuery(sql);
			
			ProductToSell p;
			while(result.next()) {
				p=new ProductToSell(result.getString("label_of_product"),result.getInt("Qte"),result.getDouble("pu")
						,result.getDouble("total_price"));
				listData.add(p);
			}
			}catch(Exception e) {e.printStackTrace();}
		return listData;
		}
	
	//---------------//for show data in table of invoice (facture)-------------------------------------
		ObservableList<ProductToSell> productSellInvoiceListDataInvoice;
		public void showtable_sellInvoice() {
			productSellInvoiceListDataInvoice=table_sellGetDataInvoice();
		
		
			table_factorColumn_Label.setCellValueFactory(new PropertyValueFactory<>("name_product"));
			table_factorColumn_qte.setCellValueFactory(new PropertyValueFactory<>("product_quantity"));
			table_factorColumn_pu.setCellValueFactory(new PropertyValueFactory<>("product_pu"));
			table_factorColumn_totalprice.setCellValueFactory(new PropertyValueFactory<>("totaPrice"));

		table_factor.setItems(productSellInvoiceListDataInvoice);}
		//-----------------------------vider le tableau de table_sell--------------------------------------------
		public void viderTableSell() {
			String sql="DELETE FROM table_sell WHERE date_delete IS NULL";
			connect =Connect.connectDB();
			try {
				prepare = connect.prepareStatement(sql);
				prepare.executeUpdate();
				Name_product_toSell.setText("");
				quantity_product_toSell.setText("");
				showtable_sell();
				showtable_sellInvoice();


				}catch(Exception e) {e.printStackTrace();}
		}
		//--------------------
		public void validateSale() {
			if(alert.confirmationMessage("are you sure about validate the sales ?")) {
				showtable_sellInvoice();
			dashboard_form.setVisible(false);
			suppliers_form.setVisible(false);
			contacts_form.setVisible(false);
			products_form.setVisible(false);
			stocks_form.setVisible(false);
			facteur_forme.setVisible(true);
			
			
			String sql0 = "SELECT * FROM table_sell WHERE date_delete IS NULL";
			connect = Connect.connectDB();
			try {
			    statement = connect.createStatement();
			    result = statement.executeQuery(sql0);
			    while (result.next()) {
			        String labelOfProduct = result.getString("label_of_product");
			        int qte = result.getInt("Qte");
			        
			        String updateProductSQL = "UPDATE product p " +
			                                  "INNER JOIN table_sell s ON p.Label_Of_Product = s.label_of_product " +
			                                  "SET p.QTE = p.QTE - s.Qte " +
			                                  "WHERE s.date_delete IS NULL AND p.Label_Of_Product = ?";
			        prepare = connect.prepareStatement(updateProductSQL);
			        prepare.setString(1, labelOfProduct);
			        prepare.executeUpdate();
			        
			        String updateStockSQL = "UPDATE stock st " +
			                                "INNER JOIN table_sell s ON st.N_Lot = s.N_Lot " +
			                                "SET st.quantity = st.quantity - ? " +
			                                "WHERE s.date_delete IS NULL AND s.label_of_product = ?";
			        prepare = connect.prepareStatement(updateStockSQL);
			        prepare.setInt(1, qte);
			        prepare.setString(2, labelOfProduct);
			        prepare.executeUpdate();
			        
			        productShowData();
			        stockShowData();
			    }
			} catch (Exception e) {
			    e.printStackTrace();
			}
			


}

			

			
			
			}
		
	
	//----------------------------------button imprimer-------------------------------------------------------------------------------------------------------------------------------------------
	public void imprimer() {
		alert.successMessage("nice");
		viderTableSell();
		showtable_sellInvoice();
		showtable_sell();
		

		
	}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void zeroqte() {
	
				String sql="DELETE FROM product WHERE QTE = '"+0+"'";
				
				connect=Connect.connectDB();
			
					try {
						prepare=connect.prepareStatement(sql);
					
						prepare.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
					String sq2="DELETE FROM stock WHERE quantity = '"+0+"'";
					connect=Connect.connectDB();
						prepare=connect.prepareStatement(sq2);
						prepare.executeUpdate();} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						productShowData();
						stockShowData();

				
			
}
		
		@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		runTime();
		questions();
		questions2();
		questions3();
		questions4();
		displayAdminIDUsername();
		productShowData();
		supplierShowData();
		contactShowData();
		showtable_sell();
		stockShowData();
		contactID();
		zeroqte();
		
		
		
		
//////probleme hwa makatn9sch lquantity mn ga3 litba3o
	}

}
