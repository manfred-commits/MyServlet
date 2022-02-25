package com.manfredipiraino.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHttpServlet
 */
@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHttpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**GET
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//impostare il tipo della nostra risposta
		response.setContentType("text/html");
		/*le servlet non utilizzano il System.out.println() utilizzano il PrintWriter*/
		PrintWriter myPrintWriter = response.getWriter();
		/*Scrive (ovviamente in formato html)*/
		myPrintWriter.println("<h1>MY HTTP SERVLET</h1>");
		/*Ottiene i parametri in formato QueryString contenuti nella Request*/
		myPrintWriter.println("QueryString: "+request.getQueryString());
		
		/*ricordarsi di chiudere il writer*/
		myPrintWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//impostare il tipo della nostra risposta
		response.setContentType("text/html");
		/*le servlet non utilizzano il System.out.println() utilizzano il PrintWriter*/
		PrintWriter myPrintWriter = response.getWriter();

		// Ottiene i parametri dall'oggetto request
		String myName = request.getParameter("myname").trim();
		String myPassword = request.getParameter("mypassword").trim();

		myPrintWriter.println("Dati inviati dal Form: "+ myName +" "+myPassword);
		myPrintWriter.println("<br><a href='./mypost.html' alt=''>Chiama la PostServlet</a>");
		myPrintWriter.println("<br><a href='./index.html' alt=''>Ritorna alla Home</a>");
	}

}
