package com.manfredipiraino.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySum
 */
@WebServlet("/MySum")
public class MySum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
				String n1 = request.getParameter("n1").trim();
				String n2= request.getParameter("n2").trim();
				int somma= Integer.parseInt(n1) +Integer.parseInt(n2);

				myPrintWriter.println("Dati inviati dal Form: "+ n1 +"+"+n2+ " somma: "+ somma);
				myPrintWriter.println("<br><a href='./mysum.html' alt=''>Chiama la SumServlet</a>");
				myPrintWriter.println("<br><a href='./index.html' alt=''>Ritorna alla Home</a>");
	}

}
