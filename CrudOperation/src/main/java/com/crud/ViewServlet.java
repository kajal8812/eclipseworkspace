package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InfoDao;
import com.entity.Info;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='Ts.html'>Add </a>");
		out.println("<h1>Info</h1>");
		List<Info> list = InfoDao.getAll();
		out.print("<table border='1' width='100%'");

		out.print(
				"<tr><th>Id</th> <th>requestorName</th><th>businessUnit</th><th>poType</th><th>title</th><th>requisitionType</th>  <th>currency</th><th>ccp</th><th>costcenter</th> <th>warehouseaddress</th> <th>buildingaddress</th> <th>Delete</th></tr>");
		for (Info i : list) {
			out.print("<tr><td>" + i.getId() + "</td> <td>" + i.getRequestorName() + "</td> <td>" + i.getBusinessUnit()
					+ "</td><td>" + i.getPoType() + "</td><td>" + i.getTitle() + "</td><td>" + i.getRequisitionType()
					+ "</td><td>" + i.getCurrency() + "</td><td>" + i.getCcp() + "</td><td>" + i.getCostcenter()
					+ "</td><td>" + i.getWarehouseaddress() + "</td><td>" + i.getBuildingaddress()
					+ "</td> <td><a href='DeleteServlet?id=" + i.getId() + "'>delete</a></td></tr>");
		}
		out.print("</table>");

		out.close();
	}
}