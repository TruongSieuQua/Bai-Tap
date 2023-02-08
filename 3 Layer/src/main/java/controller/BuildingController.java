package controller;

import java.util.List;

import model.BuildingModel;
import service.BuildingService;
import service.impl.BuildingServiceImpl;
import view.BuildingListViewAll;
import view.BuildingListViewSearch;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public List<BuildingModel> findAll() {
		return buildingService.findAll();
	}
	
	public List<BuildingModel> findSearch(String name, Integer numberOfBasement, Integer floorArea, String street ,String types) {
		return buildingService.findSearch(name, numberOfBasement, floorArea, street, types);
	}
}
