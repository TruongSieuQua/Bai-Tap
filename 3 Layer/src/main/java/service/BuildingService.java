package service;

import java.util.List;

import service.filter.BuildingFilter;

public interface BuildingService {
	List<BuildingFilter> findSearch(String name, String street, Integer numberOfBasement, Integer floorArea);

	List<BuildingFilter> findAll();
}
