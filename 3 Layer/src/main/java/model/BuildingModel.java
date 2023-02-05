package model;

import java.util.Map;

import dao.entity.BuildingEntity;
import utils.Constant;

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
		this.setFloorArea(entity.getNumberOfBasement());
		this.setStreet(entity.getStreet());
		this.setTypes(entity.getTypes());
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
			.append("Số tầng hầm: ").append(numberOfBasement)
			.append("Diện tích sàn: ").append(floorArea)
			.append("Loại nhà: ");
		for(Map.Entry<String, String> entry : Constant.BUILDING_TYPES.entrySet()) {
			String type = this.types.contains(entry.getKey()) ? entry.getValue() + ", " : "";
			sb.append(type);
		}
		sb.setLength(sb.length() - 2);
		return sb.toString();
	}
	
	
}
