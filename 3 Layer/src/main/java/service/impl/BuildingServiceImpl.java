package service.impl;

import java.util.List;
import java.util.stream.Collectors;

import dao.BuildingDao;
import dao.entity.BuildingEntity;
import dao.impl.BuildingDaoImpl;
import model.BuildingModel;
import service.BuildingService;

public class BuildingServiceImpl implements BuildingService {
	private BuildingDao buildingDao;
	
	public BuildingServiceImpl() {
		buildingDao = new BuildingDaoImpl();
	}

	public List<BuildingModel> findSearch(BuildingModel searchKey) {
		List<BuildingEntity> buildingEntities = buildingDao.findSearch(searchKey.toBuildingEntity());
		List<BuildingModel> buildingModels = buildingEntities.stream()
	            .map(BuildingModel::new)
	            .collect(Collectors.toList());
		return buildingModels;
	}

	@Override
	public List<BuildingModel> findAll() {
		List<BuildingEntity> buildingEntities = buildingDao.findAll();
		List<BuildingModel> buildingModels = buildingEntities.stream()
	            .map(BuildingModel::new)
	            .collect(Collectors.toList());
		return buildingModels;
	}
	
}
