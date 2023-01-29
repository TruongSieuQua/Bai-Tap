package controller;

import java.util.ArrayList;
import java.util.List;

import model.BuildingModel;
import service.BuildingService;
import service.filter.BuildingFilter;
import service.impl.BuildingServiceImpl;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public List<BuildingModel> findAll(String name) {
		List<BuildingFilter> buildingFilters = buildingService.findAll(name);
		List<BuildingModel> buildingModels = new ArrayList<>();
		for(BuildingFilter item: buildingFilters) {
			BuildingModel buildingModel = new BuildingModel();
			buildingModel.setName(item.getName());
			buildingModels.add(buildingModel);
		}
		return buildingModels;
	}
}
