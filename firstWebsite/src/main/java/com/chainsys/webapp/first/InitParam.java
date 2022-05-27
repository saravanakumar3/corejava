package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("doPost Called !!!");
	response.setContentType("text/html");//we need to give contentType
	PrintWriter out =response.getWriter();	
	String str_name = (String)request.getParameter("name");//request.getParameter is similar to scanner.readLine
	out.println("<div>"+str_name+"</div>");
	String str_company = (String)request.getParameter("company");//it read the key name given in html
	out.println("<div>"+str_company+"</div>");
	
	out.println("Inside !!!");
	
	}

}