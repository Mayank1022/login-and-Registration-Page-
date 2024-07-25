/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Renter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class Register extends HttpServlet {

    
   

    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.sendRedirect("register.html");
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String fname = request.getParameter("fname");
       String lname = request.getParameter("lname");
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       String rpassword = request.getParameter("rpassword");
       String mob =request.getParameter("mob");
       Renter r = new Renter();
       boolean b =r.check(password,rpassword,fname,lname,email);
        if(b)
        {   
            r.register(password, fname, lname, email, mob);
            response.sendRedirect("login.html");
        }
        else
        {   
            
            response.sendRedirect("register.html");
        }
        
    }

   
}
