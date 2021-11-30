package app;

import java.sql.*;

class conn{
    
   public Connection c;
   public Statement s;
    
   public conn(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///app","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        conn c = new conn();
    }
}
        
 

    
    
  

