package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quantity")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	//create the query
	private static final String INSERT_QUERY = "INSERT INTO information(name,quantity,uom,estimatedprice) VALUES(?,?,?,?)";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		//set Content type
		res.setContentType("text/hmtl");
		//read the form values

		String requestorName = req.getParameter("requestorName");
		String quantity = req.getParameter("quantity");
		String uom = req.getParameter("uom");

		String estimatedprice = req.getParameter("estimatedprice");
		//		String requisitionType = req.getParameter("requisitionType");
		//		String currency = req.getParameter("currency");
		//		String ccp = req.getParameter("ccp");
		//
		//		String costcenter = req.getParameter("costcenter");
		//		String warehouseaddress = req.getParameter("warehouseaddress");
		//		String buildingaddress = req.getParameter("buildingaddress");

		//System.out.println("hiiiiii:");

		//load the jdbc driver
		try {
			Class.forName("org.postgresql.Driver");
			//System.out.println("hweeloooooooooo:");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//create the connection
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Store", "postgres",
				"sillicon"); PreparedStatement ps = con.prepareStatement(INSERT_QUERY);) {
			//set the values
			ps.setString(1, requestorName);
			ps.setString(2, quantity);
			ps.setString(3, uom);
			ps.setString(4, estimatedprice);
			//			ps.setString(5, requisitionType);
			//			ps.setString(6, currency);
			//			ps.setString(7, ccp);
			//			ps.setString(8, costcenter);
			//			ps.setString(9, warehouseaddress);
			//			ps.setString(10, buildingaddress);

			//execute the query
			int count = ps.executeUpdate();

			if (count == 0) {
				pw.println("Record not stored into database");
			} else {
				pw.println("Record Stored into Database");
			}
		} catch (SQLException se) {
			pw.println(se.getMessage());
			se.printStackTrace();
		} catch (Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}

		//close the stream
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
