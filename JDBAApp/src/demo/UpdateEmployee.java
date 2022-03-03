package demo;
import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter ProdID, Name and Price");
	   int prodid = sc.nextInt();
	 //  String name = sc.next();
	 //  int price = sc.nextInt();
	   try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
           
            PreparedStatement ps = con.prepareStatement("Update Prod77 SET ProdName=?,price=? where prodid=?");
            ps.setInt(1, prodid);
          //  ps.setString(2, name);
         //   ps.setInt(3,  price);
            ps.executeUpdate();
            System.out.println("Product added");
	   }
	   catch (ClassNotFoundException e) 
	   {
           System.out.println("Driver Not Found");
       } 
	     catch (SQLException e) {
	   	 System.out.println("Connection error  "+e.getMessage());
		
	}
	   
   }
   
}