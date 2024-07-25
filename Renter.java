
package model;
import db.DataBase;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Dell
 */
public class Renter {
    
    
    public void register(String pass , String fname, String lname, String email,String mob)
    {
        try{
        Statement st = DataBase.getStatement();
        String query="insert into register values('"+fname+"','"+lname+"','"+email+"','"+pass+"','"+mob+"')";
        st.executeUpdate(query);
        }
    
        catch(SQLException e)
        {
           System.out.println(e);
        }
    }     
   public boolean check(String pass ,String rpass, String fname, String lname, String email )
   {
       if(pass.equals(rpass) && fname!=null && lname!=null && email!=null && !fname.trim().equals("") )
       {
           return true;
       }
       else
       {
           return false;
       }
   }
    
}
