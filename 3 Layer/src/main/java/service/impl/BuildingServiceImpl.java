package service.impl;

import java.util.ArrayList;
import java.util.List;

import dao.BuildingDao;
import dao.emyeuanh.BuildingEmyeuanh;
import dao.impl.BuildingDaoImpl;
import service.BuildingService;
import service.filter.BuildingFilter;

public class BuildingServiceImpl implements BuildingService {
	private BuildingDao buildingDao;
	
	public BuildingServiceImpl() {
		buildingDao = new BuildingDaoImpl();
	}



	public List<BuildingFilter> findSearch(String name, String street, Integer numberOfBasement, Integer floorArea) {
		List<BuildingEmyeuanh> buildingEmyeuanhs = buildingDao.findSearch(name, street, numberOfBasement, floorArea);
		List<BuildingFilter> buildingFilters = new ArrayList<>();
		for(BuildingEmyeuanh item : buildingEmyeuanhs) {
			BuildingFilter buildingFilter = new BuildingFilter();
			buildingFilter.setName(item.getName());
			buildingFilter.setNumberOfBasement(item.getNumberOfBasement());
			buildingFilter.setFloorArea(item.getNumberOfBasement());
			buildingFilter.setStreet(item.getStreet());
			buildingFilter.setTypes(item.getTypes());
			buildingFilters.add(buildingFilter);
		}
		return buildingFilters;
	}



	@Override
	public List<BuildingFilter> findAll() {
		List<BuildingEmyeuanh> buildingEmyeuanhs = buildingDao.findAll();
		List<BuildingFilter> buildingFilters = new ArrayList<>();
		for(BuildingEmyeuanh item : buildingEmyeuanhs) {
			BuildingFilter buildingFilter = new BuildingFilter();
			buildingFilter.setName(item.getName());
			buildingFilter.setNumberOfBasement(item.getNumberOfBasement());
			buildingFilter.setFloorArea(item.getNumberOfBasement());
			buildingFilter.setStreet(item.getStreet());
			buildingFilter.setTypes(item.getTypes());
			buildingFilters.add(buildingFilter);
		}
		return buildingFilters;
	}
	
}
