/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import model.LoginAuth;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class Login extends HttpServlet {

    
   
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.html");
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginAuth l1 = new LoginAuth();
        boolean login= l1.isLogin(username,password);
                
        
        if(login)      
        {   
            HttpSession session=request.getSession(true);
            session.setAttribute("username",username);
            response.sendRedirect("home.jsp");
        } 
        else
        {
            response.sendRedirect("login.html");
        }
       
    }

    

}
