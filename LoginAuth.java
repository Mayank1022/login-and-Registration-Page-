/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginAuth {
    String tablepass;
    public boolean isLogin(String username,String password)
    {   
        try{
            Statement st = DataBase.getStatement();
            ResultSet rs = st.executeQuery("Select password from login where email='"+username+"'");
            if(rs.next())
            {
              tablepass = rs.getString(1);
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablepass))   
        {
               return true;
        }
        return false;
    }
}
