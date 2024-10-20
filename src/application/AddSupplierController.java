/*
 * package application; import java.net.URL; import java.sql.Connection; import
 * java.sql.PreparedStatement; import java.sql.ResultSet; import
 * java.sql.Statement; import java.util.ArrayList; import java.util.List; import
 * java.util.ResourceBundle;
 * 
 * import javafx.collections.FXCollections; import
 * javafx.collections.ObservableList; import javafx.event.ActionEvent; import
 * javafx.fxml.FXML; import javafx.fxml.Initializable; import
 * javafx.scene.control.Button; import javafx.scene.control.ComboBox; import
 * javafx.scene.control.TextField;
 * 
 * public class AddSupplierController implements Initializable {
 * 
 * 
 * @FXML private TextField ID_Asddupplier;
 * 
 * @FXML private TextField address_Asddupplier;
 * 
 * @FXML private Button btn_addSupplier2;
 * 
 * @FXML private Button btn_cancelSupplier;
 * 
 * @FXML private Button btn_deleteSupplier;
 * 
 * @FXML private Button btn_updateSupplier;
 * 
 * @FXML private TextField email_Asddupplier;
 * 
 * @FXML private TextField name_Asddupplier;
 * 
 * @FXML private ComboBox<?> status_Asddupplier;
 * 
 * @FXML private TextField tele_Asddupplier; private Connection connect; private
 * PreparedStatement prepare; private ResultSet result; private Statement
 * statement;
 * 
 * 
 * 
 * 
 * public void addSupplier2() { AlertMessage alert = new AlertMessage();
 * 
 * if (name_Asddupplier.getText().isEmpty() ||
 * email_Asddupplier.getText().isEmpty() || tele_Asddupplier.getText().isEmpty()
 * || address_Asddupplier.getText().isEmpty() ||
 * ID_Asddupplier.getText().isEmpty() ||
 * status_Asddupplier.getSelectionModel().getSelectedItem() == null) {
 * alert.errorMessage("all fields are necessary to filled ");
 * 
 * } else { String checkSuppId = "SELECT * FROM supplier  WHERE supplier_id = '"
 * + ID_Asddupplier.getText() + "'"; connect = Connect.connectDB(); try {
 * statement = connect.createStatement();// creat un objet type statement result
 * = statement.executeQuery(checkSuppId);// cet objet execute la requet qui dans
 * checkusername et // l'affecter dans result if (result.next()) {
 * alert.errorMessage(ID_Asddupplier.getText() + " is already taken "); } else {
 * String insertData = "INSERT INTO supplier " +
 * "(supplier_id ,Name,Contact_Number,E_mail_Address,Address,Status)" +
 * "Value(?,?,?,?,?,?)"; prepare = connect.prepareStatement(insertData);
 * prepare.setString(1, ID_Asddupplier.getText()); prepare.setString(2,
 * name_Asddupplier.getText()); prepare.setString(3,
 * tele_Asddupplier.getText()); prepare.setString(4,
 * email_Asddupplier.getText()); prepare.setString(5,
 * address_Asddupplier.getText()); prepare.setString(6, (String)
 * status_Asddupplier.getSelectionModel().getSelectedItem());
 * 
 * prepare.executeUpdate(); alert.successMessage("Registered successfully!");
 * 
 * cancel();
 * 
 * 
 * 
 * 
 * }
 * 
 * } catch (Exception e) { e.printStackTrace(); } }
 * 
 * 
 * } public void cancel() { ID_Asddupplier.setText("");
 * name_Asddupplier.setText(""); tele_Asddupplier.setText("");
 * email_Asddupplier.setText("");
 * status_Asddupplier.getSelectionModel().clearSelection();
 * address_Asddupplier.setText("");
 * 
 * btn_cancelSupplier.getScene().getWindow().hide();
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * private String[] questionList= {"Active","Non Active"}; public void
 * questions() { List<String> listq=new ArrayList<String>(); for(String data :
 * questionList) { listq.add(data); } ObservableList
 * listData=FXCollections.observableArrayList(listq);
 * status_Asddupplier.setItems(listData);
 * 
 * } public Button getBtn_AddSupplier() { return btn_addSupplier2; }
 * 
 * @Override public void initialize(URL arg0, ResourceBundle arg1) { // TODO
 * Auto-generated method stub questions(); }
 * 
 * 
 * }
 */