package dao;

import java.util.List;

import dao.entity.BuildingEntity;

public interface BuildingDao{
	List<BuildingEntity> findSearch(BuildingEntity searchKey);
	
	List<BuildingEntity> findAll();

}
