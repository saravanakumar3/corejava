package com.chainsys.webapp.second;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie [] allCookies=request.getCookies();
		if(allCookies==null) {
			System.out.println("no cookies found!!!");
			// TODO use log manager and log message instead of sysout
			return;
		}
		int cookieLength=allCookies.length;
		for(int i=0;i<cookieLength;i++) {
			System.out.println(allCookies [i].getName()+"-"+allCookies [i].getValue());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie firstCookie= new Cookie("Captain","Dhoni");
		firstCookie.setMaxAge(-1);
		// if value is zero or less then zero than cookie will get deleted immediately after the execution.
		// if the value is positive then the cookie will expire after the specified seconds (in seconds)
		response.addCookie(firstCookie);
		Cookie secondCookie= new Cookie("w.c","Jadeja");
		secondCookie.setMaxAge(2*24*60*60);
		response.addCookie(secondCookie);
		Cookie thirdCookie= new Cookie("player1","Rahane");
		response.addCookie(thirdCookie);
		Cookie forthCookie= new Cookie("player1","Bravo");
		response.addCookie(forthCookie);
	}

}
