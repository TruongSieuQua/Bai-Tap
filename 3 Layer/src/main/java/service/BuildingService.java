package service;

import java.util.List;

import model.BuildingModel;

public interface BuildingService {
	List<BuildingModel> findSearch(String name, Integer numberOfBasement, Integer floorArea, String street, String types);

	List<BuildingModel> findAll();
}
