package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InformationDao;
import com.entity.Information;

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
		out.println("<a href='Search.html'>Add </a>");
		out.println("<h1>Info</h1>");
		List<Information> list = InformationDao.getAll();
		out.print("<table border='1' width='100%'");

		out.print(
				"<tr><th>Id</th> <th>quantity</th><th>uom</th><th>estimatedprice</th><th>Edit</th><th>Delete</th></tr>");
		for (Information i : list) {
			out.print("<tr><td>" + i.getId() + "</td> <td>" + i.getQuantity() + "</td> <td>" + i.getUom() + "</td><td>"
					+ i.getEstimatedPrice() + "</td> <td><a href='EditServlet2?id=" + i.getId()
					+ "'>edit</a></td> <td> <a href='DeleteServlet?id=" + i.getId() + "'>delete</a></td></tr>");
		}

		out.print("</table>");

		out.close();
	}

}