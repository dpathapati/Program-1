package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqResponse
 */
public class ReqResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReqResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> file</title>");
		out.println("</head");
		out.println("<body>");
		out.println("<h2>doGet()</h2>");
		out.println("<form method =\"post\">");
		out.println("Name: <input type=\"text\"  name=\"name\"><br>");
		out.println("Email: <input type=\"text\"  name=\"email\"><br>");
		out.println("Mobile: <input type=\"text\"  name=\"mobile\"><br>");
		out.println(" <input type=\"submit\" value=\"login\">");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<h2>doPost()</h2>");
		out.println("Name :"+name+"<br>");
		out.println("Email :"+email+"<br>");
		out.println("Mobile :"+mobile+"<br>");
	}

}
