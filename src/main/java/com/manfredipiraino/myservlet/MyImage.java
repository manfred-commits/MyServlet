package com.manfredipiraino.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyImage
 */
@WebServlet("/MyImage")
public class MyImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//impostare il tipo della nostra risposta
		response.setContentType("text/html");
		/*le servlet non utilizzano il System.out.println() utilizzano il PrintWriter*/
		PrintWriter myPrintWriter = response.getWriter();
		/*Scrive (ovviamente in formato html)*/
		myPrintWriter.println("<div style='"
				+ "font-family:Roboto Mono, monospace;"
				+ "display: flex;"
				+ "flex-wrap: wrap;"
				+ "justify-content: center;"
				+ "align-items: center;'><h1 style='text-align:center;width:100%;'>MY HTTP IMAGE SERVLET</h1>");
		myPrintWriter.println("MQueryString: "+request.getQueryString()+"</div>");
		
		String query=request.getParameter("numero");
		//String query=request.getQueryString();
		if(query.equals("1")) {
			/*myPrintWriter.println("<br><img alt=\"\" src=\"https://images.unsplash.com/photo-1574343062782-e0251cf2589c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmVhdXRpZnVsJTIwdHJlZXxlbnwwfHwwfHw%3D&w=1000&q=80\">");*/
			myPrintWriter.println("<div style='width:100%;'><br><div style='box-shadow: rgba(0, 0, 0, 0.4) 0px 3px 8px;width:520px; height:520px; margin:auto;text-align: center;'><img style='object-fit:contain; height:100%;' alt='flowers' src='./images/flowers.png'></div></div>");
		}else if(query.equals("2")) {
			/*myPrintWriter.println("<br><img alt='' src='https://images.pexels.com/photos/1461974/pexels-photo-1461974.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500'>");*/
			myPrintWriter.println("<div style='width:100%;'><br><div style='box-shadow: rgba(0, 0, 0, 0.4) 0px 3px 8px;width:520px; height:520px; margin:auto;text-align: center;'><img style='object-fit:contain; height:100%;' alt='torre' src='./images/tower.jpg'></div></div>");
		}else {
			/*myPrintWriter.println("<br><img alt='' src='https://media.istockphoto.com/vectors/error-page-or-file-not-found-icon-vector-id924949200?k=20&m=924949200&s=170667a&w=0&h=-g01ME1udkojlHCZeoa1UnMkWZZppdIFHEKk6wMvxrs='>");*/
			myPrintWriter.println("<div style='width:100%;'><br><div style='box-shadow: rgba(0, 0, 0, 0.4) 0px 3px 8px;width:520px; height:520px; margin:auto;text-align: center;'><img alt='not found' style='object-fit:contain; height:100%;' src='./images/notfound.jpg'></div></div>");
		}
	
		/*ricordarsi di chiudere il writer*/
		myPrintWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
