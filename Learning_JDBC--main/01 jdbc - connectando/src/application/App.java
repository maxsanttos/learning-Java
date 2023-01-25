package application;

import java.sql.*;

import db.DB;

public class App {
    public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.closeStatemant(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
	}
}
