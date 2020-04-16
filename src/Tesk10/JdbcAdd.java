package Tesk10;

import java.sql.*;
import java.util.HashMap;


public class JdbcAdd {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("张", 10);
		try {
			init(hm);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void init(HashMap<String ,Integer> hash) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		Statement sta = null;
		PreparedStatement ps = null;
		ResultSet res = null;
		String sql ;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "000327");
			con.setAutoCommit(false);
			sta = con.createStatement();
			sql = "insert into task10 values (?,?);";
			ps = con.prepareStatement(sql);
			for(String s:hash.keySet()) {
				ps.setString(1, s);
				ps.setInt(2, hash.get(s));
				//很重要 
				ps.addBatch();
			}
			//用于批量执行
			int[] ints = ps.executeBatch();
			System.out.println(ints.length);
			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				con.close();

			if (ps != null)
				ps.close();

			if (res != null)
				res.close();
		}
	}

}
