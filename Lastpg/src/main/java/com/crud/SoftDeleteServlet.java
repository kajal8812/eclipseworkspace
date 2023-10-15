package com.crud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InformationDao;

@WebServlet("/SoftDeleteServlet")
public class SoftDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Information i = new Information();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.getParameter("id");

		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);

		InformationDao.softDelete(id);
		response.sendRedirect("ViewServlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
