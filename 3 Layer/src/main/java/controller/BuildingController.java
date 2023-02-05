package controller;

import java.util.List;

import model.BuildingModel;
import service.BuildingService;
import service.impl.BuildingServiceImpl;
import view.BuildingListViewAll;
import view.BuildingListViewSearch;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public BuildingListViewAll findAll() {
		List<BuildingModel> buildingModels = buildingService.findAll();
		return new BuildingListViewAll(buildingModels);
	}
	
	public BuildingListViewSearch findSearch(String name, Integer numberOfBasement, Integer floorArea, String street ,String types) {
		List<BuildingModel> buildingModels = buildingService.findSearch(name, numberOfBasement, floorArea, street, types);
		return new BuildingListViewSearch(buildingModels);
	}
}
