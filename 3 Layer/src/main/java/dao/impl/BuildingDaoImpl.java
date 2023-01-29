package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.BuildingDao;
import dao.emyeuanh.BuildingEmyeuanh;

public class BuildingDaoImpl implements BuildingDao {
	private String DB_URL = "jdbc:mysql://localhost:3306/building";
	private String USER = "root";
	private String PASS = "123456a@";


	public List<BuildingEmyeuanh> findAll(String name) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<BuildingEmyeuanh> buildingEmyeuanhs = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			st = conn.createStatement();
			String sql = "Select name FROM building where name like '%" + name + "%'";
			rs = st.executeQuery(sql);
			while(rs.next()) {
				BuildingEmyeuanh buildingEmyeuanh = new BuildingEmyeuanh();
				buildingEmyeuanh.setName(rs.getString("name"));
				buildingEmyeuanhs.add(buildingEmyeuanh);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return buildingEmyeuanhs;
	}

}
