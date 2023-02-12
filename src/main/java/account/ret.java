package account;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ret
 */
@WebServlet("/ret")
public class ret extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ret() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://localhost:3306/banking";
			final String USER = "root";
			final String PASS = "12345qweasZ*";
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			System.out.println("hi");
			Connection conn = null;
			PreparedStatement stmt = null;

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.prepareStatement("select * from account where id=?");
			int id1 = Integer.parseInt(request.getParameter("id"));
			stmt.setInt(1, id1);
			ResultSet rs = stmt.executeQuery();
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			out.print("<head>");
			out.print(
					"<style>table {border-collapse: collapse;width: 100%;} th, td { text-align: left; padding: 8px; } tr:nth-child(even) {background-color: #f2f2f2;} </style>");
			out.print("</head><title>Amount</title>");
			out.print("<center><table width=25% border=1>");
			out.print("<center><h1>Profile</h1></center>");
			out.print("<tr>");
			out.print("<td>" + rsmd.getColumnName(1) + "</td>");
			out.print("<td>" + rsmd.getColumnName(2) + "</td>");
			out.print("<td>" + rsmd.getColumnName(3) + "</td>");
			out.print("<td>" + rsmd.getColumnName(4) + "</td>");
			out.print("<td>" + rsmd.getColumnName(5) + "</td></tr>");
			while (rs.next()) {
				out.print("<tr><td>" + rs.getInt(1) + "</td>");
				out.print("<td>" + rs.getString(2) + "</td>");
				out.print("<td>" + rs.getString(3) + "</td>");
				out.print("<td>" + rs.getString(4) + "</td>");
				out.print("<td>" + rs.getString(5) + "</td></tr>");
			}
			out.print("</table></center>");
			out.print(
					"<center><form method=POST action=OptionPage.jsp><input type=submit value=Home></form> </center></body>\"");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
