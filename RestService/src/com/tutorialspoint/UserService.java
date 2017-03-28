package com.tutorialspoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 
 */
import org.json.JSONObject;

@Path("/UserService")
public class UserService {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/INFORMATION";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root123";


   @GET
   @Path("/users/{param1}")
   @Produces(MediaType.APPLICATION_XML)
   public String getinformation(@PathParam("param1") int param1){
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT * FROM PERSONS WHERE PersonID="+param1+";";
	      ResultSet rs = stmt.executeQuery(sql);

	      //STEP 5: Extract data from result set
	      if(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("PersonID");
	         String first = rs.getString("FirstName");
	         String last = rs.getString("LastName");
	         String phone = rs.getString("Phone");
	         String city = rs.getString("City");
	         //Display values
	         JSONObject json = new JSONObject();
	         System.out.print("ID: " + id);
	         System.out.print(", First: " + first);
	         System.out.print(", Last: " + last);
	         System.out.print(", Phone: " + phone);
	         System.out.println(", City: " + city);
	        return "<?xml version='1.0' encoding='UTF-8'?><person><first>"+first+"</first><last>"+last+"</last><phone>"+phone+"</phone><city>"+city+"</city></person>";
	         /*json.put("firstName", first);
	         json.put("lastName", last);
	         json.put("phone", phone);
	         json.put("city", city);
	         return json.toString();*/
	         //return "<html><head>"+first+","+last+","+phone+","+city+"</head></html>";
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodboy!");
	  return "";
   }	
}