package com.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InfoDao;
import com.entity.Info;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Update </h1>");
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);

		Info i = InfoDao.getEmployeeById(id);

		out.print("<form action='EditServlet' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='" + i.getId() + "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='requestorName' value='" + i.getRequestorName()
				+ "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='business' value='" + i.getBusinessUnit()
				+ "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='uom' value='" + i.getPoType() + "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='uom' value='" + i.getRequisitionType()
				+ "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='uom' value='" + i.getCcp() + "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='uom' value='" + i.getCostcenter()
				+ "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='uom' value='" + i.getWarehouseaddress()
				+ "'/></td></tr>");

		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();
	}
}