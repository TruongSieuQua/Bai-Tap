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


	public List<BuildingEntity> findSearch(BuildingEntity searchKey) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<BuildingEntity> buildingEntities = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			st = conn.createStatement();
			StringBuilder sql = new StringBuilder("Select * FROM building where 1=1");
			if(!StringUtils.isNullOrEmpty(searchKey.getName())) {
				sql.append(" and name like '%" + searchKey.getName() + "%'");
			}
			if(!StringUtils.isNullOrEmpty(searchKey.getStreet())) {
				sql.append(" and street like '%" + searchKey.getStreet() + "%'");
			}
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
