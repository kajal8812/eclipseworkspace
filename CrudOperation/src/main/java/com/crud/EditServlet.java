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

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//requestorName=?,businessUnit=?,poType=?,title=?,requisitionType
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		String requestorName = request.getParameter("requestorName");
		String businessUnit = request.getParameter("businessUnit");
		String poType = request.getParameter("poType");
		String title = request.getParameter("title");
		String requisitionType = request.getParameter("requisitionType");
		String currency = request.getParameter("currency");
		String ccp = request.getParameter("ccp");
		String costcenter = request.getParameter("costcenter");
		String warehouseaddress = request.getParameter("warehouseaddress");
		String buildingaddress = request.getParameter("buildingaddress");

		Info i = new Info();
		i.setId(id);
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

		int status = InfoDao.update(i);

		if (status > 0) {
			response.sendRedirect("ViewServlet");
		} else {
			out.println(status);
			out.println("Sorry! unable to update record");
		}

		out.close();
	}

}