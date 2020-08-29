package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		showLoginForm(response,false);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("Harsha") && password.equals("harsha"))
		{
			//out.println("Login successfully");
			//response.sendRedirect("http://localhost:8080/Dynamic_project/log");
			RequestDispatcher rd = request.getRequestDispatcher("slog");
			
			rd.forward(request,  response);
		}
		else
		{
			//out.println("Login failed");
			showLoginForm(response, true);
		}
		out.close();
	}
	
	protected void showLoginForm(HttpServletResponse response, boolean error) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>login</title>");
		out.println("</head");
		out.println("<body>");
		if(error)
		{
			out.println("Invalid username or password or both</h2>");
		}
		out.println("<form method =\"post\">");
		out.println("User name : <input type=\"text\" name=\"username\"><br>");
		out.println("Password : <input type=\"text\" name=\"password\"><br>");
		out.println("<input type=\"submit\" value=\"Login\">");
		out.println("<input type=\"reset\" value=\"Cancel\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
	}

}
