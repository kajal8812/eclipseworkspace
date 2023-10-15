package org.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.getWriter().print(request.getParameter("name") + "<br>");
		response.getWriter().print(request.getParameter("gender") + "<br>");
		String[] languages = request.getParameterValues("language");
		if (languages != null) {
			for (int i = 0; i < languages.length; i++) {
				//out.print("<br/>");
				out.print(languages[i]);
				out.print("<br/>");

			}
		} else {
			out.print("none selected");
			out.print("<br/>");
		}
		//response.getWriter().println("<br>");

		response.getWriter().print(request.getParameter("country"));

		//	response.getWriter().print("<h1> hello</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
