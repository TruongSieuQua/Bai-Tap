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
	
	public List<BuildingModel> findSearch(BuildingModel searchKey) {
		return buildingService.findSearch(searchKey);
	}
}
