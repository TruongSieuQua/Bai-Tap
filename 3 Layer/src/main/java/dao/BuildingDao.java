package dao;

import java.util.List;

import dao.entity.BuildingEntity;

public interface BuildingDao{
	List<BuildingEntity> findSearch(String name, Integer numberOfBasement, Integer floorArea, String street, String types);
	
	List<BuildingEntity> findAll();

}
