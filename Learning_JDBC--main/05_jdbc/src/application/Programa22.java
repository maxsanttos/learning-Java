package application;


import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa22 {
    public static void main(String[] args){
        
        Connection conn = null;
        Statement st = null;
        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1 ");

            /*int x = 1;
            if (x<2){
                throw new SQLException("fake error");
            }*/

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2 ");

            conn.commit();

        }catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rolled Caused by: " + ex.getMessage());
            }
        }finally {
            DB.closeStatemant(st);
            DB.closeConnection();
        }
	}
}
