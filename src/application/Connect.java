
  package application;
  
  import java.sql.Connection; import java.sql.DriverManager;
  
  public class Connect {
  
  
  public static Connection connectDB(){ try {
  Class.forName("com.mysql.cj.jdbc.Driver"); 
  Connection connect=DriverManager.getConnection("jdbc:mysql://localhost/paraph","root",""); 
  return connect; } catch(Exception e) {e.printStackTrace();
  return null;}
  
  }
  
  }
 