package controller;

import java.util.ArrayList;
import java.util.List;

import model.BuildingModel;
import service.BuildingService;
import service.filter.BuildingFilter;
import service.impl.BuildingServiceImpl;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public List<BuildingModel> findAll() {
		List<BuildingFilter> buildingFilters = buildingService.findAll();
		List<BuildingModel> buildingModels = new ArrayList<>();
		for(BuildingFilter item: buildingFilters) {
			BuildingModel buildingModel = new BuildingModel();
			buildingModel.setName(item.getName());
			buildingModel.setNumberOfBasement(item.getNumberOfBasement());
			buildingModel.setFloorArea(item.getNumberOfBasement());
			buildingModel.setStreet(item.getStreet());
			buildingModel.setTypes(item.getTypes());
			buildingModels.add(buildingModel);
		}
		return buildingModels;
	}
	
	public List<BuildingModel> findSearch(String name, String street, Integer numberOfBasement, Integer floorArea) {
		List<BuildingFilter> buildingFilters = buildingService.findSearch(name, street, numberOfBasement, floorArea);
		List<BuildingModel> buildingModels = new ArrayList<>();
		for(BuildingFilter item: buildingFilters) {
			BuildingModel buildingModel = new BuildingModel();
			buildingModel.setName(item.getName());
			buildingModel.setNumberOfBasement(item.getNumberOfBasement());
			buildingModel.setFloorArea(item.getNumberOfBasement());
			buildingModel.setStreet(item.getStreet());
			buildingModel.setTypes(item.getTypes());
			buildingModels.add(buildingModel);
		}
		return buildingModels;
	}
}
