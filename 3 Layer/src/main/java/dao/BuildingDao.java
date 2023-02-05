package dao;

import java.util.List;

import dao.entity.BuildingEntity;

public interface BuildingDao{
	List<BuildingEntity> findSearch(String name, String street, Integer numberOfBasement, Integer floorArea);
	
	List<BuildingEntity> findAll();

}
