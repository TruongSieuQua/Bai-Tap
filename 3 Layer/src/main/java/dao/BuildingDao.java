package dao;

import java.util.List;

import dao.emyeuanh.BuildingEmyeuanh;

public interface BuildingDao{
	List<BuildingEmyeuanh> findSearch(String name, String street, Integer numberOfBasement, Integer floorArea);
	
	List<BuildingEmyeuanh> findAll();

}
