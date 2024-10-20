package application;


//import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;


public class SignController implements Initializable {


    @FXML
    private Button forget2_btnBack;

    @FXML
    private Button forget2_btnProceed;

    @FXML
    private TextField forget2_confirmPassword;

    @FXML
    private AnchorPane forget2_form;

    @FXML
    private TextField forget2_password;

    @FXML
    private TextField forget_Answer;

    @FXML
    private Button forget_btnBack;

    @FXML
    private Button forget_btnProceed;

    @FXML
    private AnchorPane forget_form;

    @FXML
    private ComboBox<?> forget_selectQustion;

    @FXML
    private TextField forget_username;

    @FXML
    private Button login_btn;

    @FXML
    private Button login_btnCreatAccount;

    @FXML
    private Hyperlink login_forgetPassword;

    @FXML
    private AnchorPane login_form;

    @FXML
    private PasswordField login_password;

    @FXML
    private CheckBox login_selectShowPassword;

    @FXML
    private TextField login_showPassword;

    @FXML
    private TextField login_username;

    @FXML
    private AnchorPane main_form;

    @FXML
    private TextField signup_Answer;

    @FXML
    private Button signup_btn;

    @FXML
    private Button signup_btnlogIn;

    @FXML
    private PasswordField signup_confirmPassword;

    @FXML
    private TextField signup_email;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private PasswordField signup_password;

    @FXML
    private ComboBox<?> signup_selectQuestion;

    @FXML
    private TextField signup_username;
    
    
    /*public void creatAccount(ActionEvent event){
        login_form.setVisible(false);
        signup_form.setVisible(true);
    }
    public void login(ActionEvent event){
        login_form.setVisible(true);
        signup_form.setVisible(false);
    }
    public void forgetpass(){
        login_form.setVisible(false);
        forget_form.setVisible(true);
    }
    public void changepass(){
        forget_form.setVisible(false);
        forget2_from.setVisible(true);
    }
    public void back(){
        forget_form.setVisible(false);
        login_form .setVisible(true);
    }
    public void backtwo(){
        forget2_from.setVisible(false);
        forget_form .setVisible(true);
    }*/
    
    
    private  Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;
    
    //fct to connect db
	/*
	 * public Connection connectDB(){ try {
	 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
	 * connect=DriverManager.getConnection("jdbc:mysql://localhost/paraph","root",
	 * "root"); return connect; } catch(Exception e) {e.printStackTrace();return
	 * null;}}
	 */	
    
    
      //show password
    public void showPassword() {
    	if(login_selectShowPassword.isSelected()) {
    		login_showPassword.setText(login_password.getText());
    		login_showPassword.setVisible(true);
    		login_password.setVisible(false);
    	}else  {
    		login_showPassword.setVisible(false);
    		login_password.setVisible(true);
    		login_password.setText(login_showPassword.getText());

    	}
    	
    }
    
    //login
    public void login() {
    	AlertMessage alert=new AlertMessage();
    	if(login_username.getText().isEmpty() || login_password.getText().isEmpty()) {
    		alert.errorMessage("incorrect username/password");
    	}else {
    		String selectData="SELECT username , password FROM user WHERE "+"username=? AND password=?";
    		connect =Connect.connectDB();
    		if(login_selectShowPassword.isSelected()) {
    			login_password.setText(login_showPassword.getText());
    		}else {
    			login_showPassword.setText(login_password.getText());
    		}
    		
    		try {
    			/*Parent root =FXMLLoader.load(getClass().getResource("dashboard.fxml"));
				Stage stage=new Stage();
				Scene scene=new Scene(root);
				stage.setTitle("Parapharmacie Management System");
				stage.setScene(scene);
				stage.show();*/
    			prepare=connect.prepareStatement(selectData);
    			prepare.setString(1,login_username.getText());
    			prepare.setString(2, login_password.getText());
    			
    			result=prepare.executeQuery();
    			
    			if(result.next()) {
    				Data.admin_username=login_username.getText();
    				//go t main page
    				//alert.successMessage("successfully login ");
    				Parent root =FXMLLoader.load(getClass().getResource("dashboard.fxml"));
    				Stage stage=new Stage();
    				Scene scene=new Scene(root);
    				stage.setTitle("Parapharmacie Management System");
    				stage.setScene(scene);
    				stage.show();
    				
    				login_btn.getScene().getWindow().hide();
    			}else {
    				alert.errorMessage("incorrect username/password");
    			}
    			
    		}catch(Exception e) {e.printStackTrace();}
	
    	}
    	
    	
    }
    
    
    
    //registre
	    public void registre() {
	    	AlertMessage alert=new AlertMessage();
	    	//check if we have empty fields
	    	if(signup_email.getText().isEmpty() || signup_username.getText().isEmpty() || signup_password.getText().isEmpty() || signup_confirmPassword.getText().isEmpty() || signup_selectQuestion.getSelectionModel().getSelectedItem()==null || signup_Answer.getText().isEmpty()) {
	    		alert.errorMessage("all fields are necessary to filled ");
	    	}else if(!signup_password.getText().equals(signup_confirmPassword.getText())) {
	    		alert.errorMessage("password doesn't match");
	    	}else if(signup_password.getText().length() <5) {
	    		alert.errorMessage("invalid password , at least 5 characters needed");
	    	}else {
	    		String checkUsername="SELECT * FROM user WHERE username = '"+signup_username.getText()+"'";
	    		
	    		connect = Connect.connectDB();
	    		try {
	    			statement =connect.createStatement();//creat un objet type statement 
	        		result=statement.executeQuery(checkUsername);//cet objet execute la requet qui dans checkusername et l'affecter dans result
	        		if(result.next()) {
	        			alert.errorMessage(signup_username.getText()+" is already taken ");}
	        		else {
	        			String insertData="INSERT INTO user "+"(email,username,password,question,answer)"+"Value(?,?,?,?,?)";
	        			prepare=connect.prepareStatement(insertData);
	        			prepare.setString(1,signup_email.getText());//va remplacer ? par signup_email.getText()
	        			prepare.setString(2,signup_username.getText());
	        			prepare.setString(3,signup_password.getText());
	        			prepare.setString(4,(String)signup_selectQuestion.getSelectionModel().getSelectedItem());
	        			prepare.setString(5,signup_Answer.getText());
	        			
	        			prepare.executeUpdate();
	        			alert.successMessage("Registered successfully!");
	        			login_username.setText(signup_username.getText()); 
	        			login_password.setText("");
	        			login_showPassword.setText("");
	        			login_password.setVisible(true);
	        			login_showPassword.setVisible(false);
	        			login_selectShowPassword.setSelected(false);
	        			registreClearFields();
	        			
	        			login_form.setVisible(true);
	    	            signup_form.setVisible(false);
	        		}
	    		}catch(Exception e) {
	    			e.printStackTrace();}
	   	
	    	}
	    }
	    //change password proceed
	    public void changePassword() {
	    	
	    	AlertMessage alert=new AlertMessage();
	    	if(forget2_password.getText().isEmpty() || forget2_confirmPassword.getText().isEmpty()) {
	    		alert.errorMessage("all fields are necessary to filled");
	    	}else if(!forget2_password.getText().equals(forget2_confirmPassword.getText())) {
	    		alert.errorMessage("password doesn't match");
	    	}else if(forget2_password.getText().length()<5) {
	    		alert.errorMessage("invalid password , at least 5 characters needed");
	    	}else {
	    		String passchange="UPDATE user SET password =? , update_date =? "+"WHERE  username= '"+forget_username.getText()+"'";
	    		connect=Connect.connectDB();
	    		try {
	    			prepare=connect.prepareStatement(passchange);
	    			prepare.setString(1,forget2_password.getText());
	    			LocalDate date = LocalDate.now();
	    			java.sql.Date sqldate = java.sql.Date.valueOf(date);
	    			prepare.setString(2,String.valueOf(sqldate));
	    			prepare.executeUpdate();
	    				alert.successMessage("password has changed");
	    				login_form.setVisible(true);
	    	    		forget2_form.setVisible(false);
	    	    		signup_form.setVisible(false);
	    	    		forget_form.setVisible(false);
	    	    		login_username.setText(forget_username.getText());
	    	    		login_password.setText("");
	    	    		login_showPassword.setText("");
	    	    		login_password.setVisible(true);
	        			login_showPassword.setVisible(false);
	        			login_selectShowPassword.setSelected(false);
	    	    		forget2_password.setText("");
	    	    		forget2_confirmPassword.setText("");
			    		}catch(Exception e) {e.printStackTrace();}
			    	}
		    	
		    }
		    
	    
	   
	    //si le registre complet va vider les champs
	    
	    public void registreClearFields() {
	    	signup_email.setText("");
	    	signup_username.setText("");
	    	signup_password.setText("");
	    	signup_confirmPassword.setText("");
	    	signup_selectQuestion.getSelectionModel().clearSelection();
	    	signup_Answer.setText("");
	    	
	    }// vider forgetpass form 1
	    public void forgetClearFields() {
	    	forget_selectQustion.getSelectionModel().clearSelection();
	    	forget_Answer.setText("");
	    	
	    }
	    
	    //switch between fields
	    public void switchF (ActionEvent event) {
	    	if(event.getSource()==signup_btnlogIn || event.getSource()== forget_btnBack) {
	    		login_form.setVisible(true);
	            signup_form.setVisible(false);
	    		forget_form.setVisible(false);
	    		forget2_form.setVisible(false);
	    		login_password.setText("");
	    		login_showPassword.setText("");
	    		login_password.setVisible(true);
    			login_showPassword.setVisible(false);
    			login_selectShowPassword.setSelected(false);
	    		}
	    	if(event.getSource()==login_btnCreatAccount) {
	    		login_form.setVisible(false);
	            signup_form.setVisible(true);
	    		forget_form.setVisible(false);
	    		forget2_form.setVisible(false);
	    		registreClearFields();
	    		}
	    	if(event.getSource()==login_forgetPassword || event.getSource()==forget2_btnBack ) {
	    		login_form.setVisible(false);
	            signup_form.setVisible(false);
	    		forget_form.setVisible(true);
	    		forget2_form.setVisible(false);
	    		forget_username.setText(login_username.getText());//hna bach ila ktb smito f login onsa motepasse kayl9a smito tma bla may3awdha
	    		forgetClearFields();// si forgetpass form  visible  les question et annswer vide
	    		}
	    }
	    //function to test to change password proceed
	    public void forgotPassword() {
	    	AlertMessage alert =new AlertMessage();
	    	if(forget_username.getText().isEmpty() || forget_selectQustion.getSelectionModel().getSelectedItem()==null || forget_Answer.getText().isEmpty() ) {
	    		alert.errorMessage("please fill all blank fields");
	    	}else {
	    		String checkData= "SELECT username,question,answer FROM user WHERE "+"username =? AND question=? AND answer=?";
	    		connect =Connect.connectDB();
	    		 try {
	    			 prepare=connect.prepareStatement(checkData);
	    			 prepare.setString(1,forget_username.getText());
	    			 prepare.setString(2,(String)forget_selectQustion.getSelectionModel().getSelectedItem());
	    			 prepare.setString(3, forget_Answer.getText());
	    			  result=prepare.executeQuery();
	    			  if(result.next()) {
	    		    		login_form.setVisible(false);
	    		            signup_form.setVisible(false);
	    		    		forget_form.setVisible(false);
	    		    		forget2_form.setVisible(true);
	    		    		forget2_password.setText("");
	    		    		forget2_confirmPassword.setText("");
	    			  }else {
	    				  alert.errorMessage("incorrect informations");
	    			  }
	    		 }catch(Exception e) {e.printStackTrace();}
	    	}
	    	
	    	
	    }
	    
	    
	    //remplire combox1
	    
	   private String[] questionList= {"what is your favorite food ?","what is name of your best fiend?","how old your grandfather ?","what is your favorite color"};
	    public void questions() {
	    	List<String> listq=new ArrayList<String>();
	    	for(String data : questionList) {
	    		listq.add(data);
	    	}
	    	ObservableList listData=FXCollections.observableArrayList(listq);
	    	signup_selectQuestion.setItems(listData);
	    	
	    }
	    
	    //remplir combox2 de forgetpassword
	    
	    public void forgetPassQuestions() {
	    	List<String> listq=new ArrayList<String>();
	    	for(String data : questionList) {
	    		listq.add(data);
	    	}
	    	ObservableList listData=FXCollections.observableArrayList(listq);
	    	forget_selectQustion.setItems(listData);
	    	
	    }
	    
	    //function  for call les methodes 
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			questions();
			forgetPassQuestions();
		}
	    
	    
	    
	    




}
