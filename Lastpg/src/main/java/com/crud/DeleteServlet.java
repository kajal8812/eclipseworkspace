package com.crud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InformationDao;
import com.entity.Information;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Information i = new Information();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		//boolean status=true;

		InformationDao.delete(id);
		response.sendRedirect("ViewServlet");
	}
}