package cMS_Class;

import java.sql.*;  

public class conn{
    Statement s;
    Connection c;
    String url ="jdbc:mysql://localhost:3306/cms";
	String uName="root";
	String pass="@bhi845GMAIL";
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection(url,uName,pass);
            s = c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}


