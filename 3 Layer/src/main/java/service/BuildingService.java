package service;

import java.util.List;

import service.filter.BuildingFilter;

public interface BuildingService {
	List<BuildingFilter> findAll(String name);

	
}
