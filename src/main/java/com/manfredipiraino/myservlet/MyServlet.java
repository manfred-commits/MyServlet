package com.manfredipiraino.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	ServletConfig config=null;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return "Esempio basi di Servlet. Ugo Betori - 2022";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("Servlet init().");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		/*Imposta il tipo di contenuto della Response*/
		response.setContentType("text/html");
		/*accede all'oggetto di scrittura*/
		PrintWriter myPrintWriter= response.getWriter();
		/*Scrive (ovviamente in formato html)*/
		myPrintWriter.println("<h1>My Servlet che implementa l'interfaccia Servlet</h1>");
		myPrintWriter.println("<p>Scheme: <i>"+ request.getScheme()+"</i></p>");
		myPrintWriter.close();
		
	}

	

}
