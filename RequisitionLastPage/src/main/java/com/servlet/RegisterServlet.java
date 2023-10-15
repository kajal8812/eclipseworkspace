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
	private static final String INSERT_QUERY = "INSERT INTO p4(requestorName,type,category,itemname,quantity,uom,estimatedprice) VALUES(?,?,?,?,?,?,?)";

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
		String type = req.getParameter("radio");
		String category = req.getParameter("selectcategory");
		String itemname = req.getParameter("itemname");
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
			ps.setString(2, type);
			ps.setString(3, category);
			ps.setString(4, itemname);
			ps.setString(5, quantity);
			ps.setString(6, uom);
			ps.setString(7, estimatedprice);

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
