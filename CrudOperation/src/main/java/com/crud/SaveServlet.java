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

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String requestorName = req.getParameter("requestorName");
		String businessUnit = req.getParameter("businessUnit");
		String poType = req.getParameter("poType");

		String title = req.getParameter("title");
		String requisitionType = req.getParameter("requisitionType");
		String currency = req.getParameter("currency");
		String ccp = req.getParameter("ccp");

		String costcenter = req.getParameter("costcenter");
		String warehouseaddress = req.getParameter("warehouseaddress");
		String buildingaddress = req.getParameter("buildingaddress");

		Info i = new Info();
		i.setRequestorName(requestorName);

		i.setBusinessUnit(businessUnit);
		i.setPoType(poType);
		i.setTitle(title);
		i.setRequisitionType(requisitionType);
		i.setCurrency(currency);
		i.setCcp(ccp);
		i.setCostcenter(costcenter);
		i.setWarehouseaddress(warehouseaddress);

		i.setBuildingaddress(buildingaddress);

		int status = InfoDao.save(i);
		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			req.getRequestDispatcher("Ts.html").include(req, response);
		} else {
			out.println("Sorry! unable to save record");
		}

		out.close();
	}

}