package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.text.SimpleDateFormat;


import db.DB;

public class App23 {
    public static void main(String[] args){

		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			/*st = conn.prepareStatement(
				"INSERT INTO seller "
				+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
				+ "VALUES "
				+ "(?, ?, ?, ?, ?)",
				java.sql.Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Max Suel");
			st.setString(2, "max@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("02/08/1990").getTime()));
			st.setDouble(4, 5000.0);
			st.setInt(5, 4);*/
			
			st = conn.prepareStatement(
			  	"insert into department(Name) values ('D1'), ('D2')", java.sql.Statement.RETURN_GENERATED_KEYS
			 );
			
			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()){
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}else{
				System.out.println("No rown affected!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally{
			DB.closeStatemant(st);
			DB.closeConnection();
		}
	}
}
