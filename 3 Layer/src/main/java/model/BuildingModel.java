package model;

import java.util.Map;

import dao.entity.BuildingEntity;
import utils.Constant;
import utils.StringUtils;

public class BuildingModel {
	private String name;
	private String street;
	private Integer numberOfBasement;
	private Integer floorArea;
	private String types;
	
	public BuildingModel() {
		super();
	}
	
	public BuildingModel(BuildingEntity entity) {
		this.setName(entity.getName());
		this.setNumberOfBasement(entity.getNumberOfBasement());
		this.setFloorArea(entity.getFloorArea());
		this.setStreet(entity.getStreet());
		this.setTypes(entity.getTypes());
	}
	
	public BuildingEntity toBuildingEntity() {
		BuildingEntity entity = new BuildingEntity();
		entity.setName(name);
		entity.setStreet(street);
		entity.setNumberOfBasement(numberOfBasement);
		entity.setFloorArea(floorArea);
		entity.setTypes(types);
		return entity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public Integer getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(Integer floorArea) {
		this.floorArea = floorArea;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(name)
			.append("\nSố tầng hầm: ").append(numberOfBasement)
			.append("\nDiện tích sàn: ").append(floorArea)
			.append("\nLoại nhà: ").append(StringUtils.convertBuildingType(types));
		return sb.toString();
	}
}
