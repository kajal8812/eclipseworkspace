package com.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InformationDao;
import com.entity.Information;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String quantity = req.getParameter("quantity");
		String uom = req.getParameter("uom");
		String estimatedprice = req.getParameter("estimatedprice");

		Information i = new Information();
		i.setQuantity(quantity);
		i.setUom(uom);
		i.setEstimatedPrice(estimatedprice);

		int status = InformationDao.save(i);
		if (status > 0) {
			out.print("<p color='Pink'>Record saved successfully!</p>");
			req.getRequestDispatcher("Search.html").include(req, response);
		} else {
			out.println("Sorry! unable to save record");
		}

		out.close();
	}

}