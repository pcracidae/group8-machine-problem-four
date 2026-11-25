package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author markj
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            // gets the username and password
            String username = request.getParameter("username");
            String password = request.getParameter("password");
        
            // reads the configured credentials from web.xml
            String validUsername = getServletConfig().getInitParameter("username");
            String validPassword = getServletConfig().getInitParameter("password");
        
            //check if empty
            boolean noUser = (username == null || username.trim().isEmpty());
            boolean noPass = (password == null || password.trim().isEmpty());
        
            //initialize error message
            String errorMessage = null;
        
            //check conditions
            if (noUser && noPass) 
            {
                errorMessage = "Username and password are both required.";
            } 
            else if (noUser) 
            {
                errorMessage = "Username is required.";
            } 
            else if (noPass) 
            {
                errorMessage = "Password is required.";
            } 
            else if (!username.trim().equals(validUsername) && !password.equals(validPassword)) 
            {
                errorMessage = "Incorrect username and password.";
            } 
            else if (!username.trim().equals(validUsername)) 
            {
                errorMessage = "Incorrect username.";
            } 
            else if (!password.equals(validPassword)) 
            {
                errorMessage = "Incorrect password.";
            }
            
            //check if this is an error, else go to success
            if (errorMessage != null) {
                request.setAttribute("errorMessage", errorMessage);
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/success.jsp");
                rd.forward(request, response);
        }
    }
}
