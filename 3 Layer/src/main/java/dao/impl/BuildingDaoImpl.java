package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.BuildingDao;
import dao.entity.BuildingEntity;
import utils.StringUtils;

public class BuildingDaoImpl implements BuildingDao {
	private String DB_URL = "jdbc:mysql://localhost:3306/building";
	private String USER = "root";
	private String PASS = "123456a@";


	public List<BuildingEntity> findSearch(String name,
			Integer numberOfBasement, Integer floorArea,
			String street, String types) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<BuildingEntity> buildingEmyeuanhs = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			st = conn.createStatement();
			StringBuilder sql = new StringBuilder("Select * FROM building where 1=1");
			if(StringUtils.isNullOrEmpty(name)) {
				sql.append(" and name like '%" + name + "%'");
			}
			if(StringUtils.isNullOrEmpty(street)) {
				sql.append(" and street like '%" + street + "%'");
			}
			if(numberOfBasement!=null) {
				sql.append(" and numberOfBasement = " + numberOfBasement);
			}
			if(floorArea!=null) {
				sql.append(" and floorArea = " + floorArea);
			}
			rs = st.executeQuery(sql.toString());
			while(rs.next()) {
				BuildingEntity buildingEmyeuanh = new BuildingEntity();
				buildingEmyeuanh.setName(rs.getString("name"));
				buildingEmyeuanh.setNumberOfBasement(rs.getInt("numberofbasement"));
				buildingEmyeuanh.setFloorArea(rs.getInt(("floorarea")));
				buildingEmyeuanh.setStreet(rs.getString("street"));
				buildingEmyeuanh.setTypes(rs.getString("types"));
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


	@Override
	public List<BuildingEntity> findAll() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<BuildingEntity> buildingEntities = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			st = conn.createStatement();
			StringBuilder sql = new StringBuilder("Select * FROM building;");
			rs = st.executeQuery(sql.toString());
			while(rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setNumberOfBasement(rs.getInt("numberofbasement"));
				buildingEntity.setFloorArea(rs.getInt(("floorarea")));
				buildingEntity.setStreet(rs.getString("street"));
				buildingEntity.setTypes(rs.getString("types"));
				buildingEntities.add(buildingEntity);
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
		return buildingEntities;
	}

}
