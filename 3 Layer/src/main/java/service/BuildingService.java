package service;

import java.util.List;

import model.BuildingModel;

public interface BuildingService {
	List<BuildingModel> findSearch(BuildingModel searchKey);

	List<BuildingModel> findAll();
}
