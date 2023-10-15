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

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//requestorName=?,businessUnit=?,poType=?,title=?,requisitionType
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		String quantity = request.getParameter("quantity");
		String uom = request.getParameter("uom");
		String estimatedprice = request.getParameter("estimatedprice");

		Information i = new Information();
		i.setId(id);
		i.setQuantity(quantity);
		i.setUom(uom);
		i.setEstimatedPrice(estimatedprice);
		//i.setDeleted(deleted);

		int status = InformationDao.update(i);

		if (status > 0) {
			response.sendRedirect("ViewServlet");
		} else {

			out.println("Sorry! unable to update record");
		}

		out.close();
	}

}
