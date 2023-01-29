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



	public List<BuildingFilter> findAll(String name) {
		List<BuildingEmyeuanh> buildingEmyeuanhs = buildingDao.findAll(name);
		List<BuildingFilter> buildingFilters = new ArrayList<>();
		for(BuildingEmyeuanh item : buildingEmyeuanhs) {
			BuildingFilter buildingFilter = new BuildingFilter();
			buildingFilter.setName(item.getName());
			buildingFilters.add(buildingFilter);
		}
		return buildingFilters;
	}
	
}
