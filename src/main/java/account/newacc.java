package account;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newacc
 */
@WebServlet("/newacc")
public class newacc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public newacc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("Succ.html");
		try {

			final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://localhost:3306/banking";

			final String USER = "root";
			final String PASS = "12345qweasZ*";
			System.out.println("hi");
			Connection conn = null;
			PreparedStatement stmt = null;

			Class.forName(JDBC_DRIVER);

			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			System.out.println("Inserting records into the table...");
			stmt = conn.prepareStatement("insert into account values(?,?,?,?,?)");
			stmt.setInt(1, Integer.valueOf(request.getParameter("id")));
			stmt.setString(2, request.getParameter("username"));
			stmt.setString(3, request.getParameter("balance"));
			stmt.setString(4, request.getParameter("address"));
			stmt.setString(5, request.getParameter("phoneno"));

			stmt.executeUpdate();
			System.out.println("Inserted records into the table...");

			response.getWriter().write("Registered successfully");

		} catch (Exception e) {
			System.out.println("wrong");
			e.printStackTrace();
		}

	}

}
