package service.filter;

public class BuildingFilter {
	private String name;
	private String street;
	private Integer numberOfBasement;
	private Integer floorArea;
	private String types;
	
	public BuildingFilter() {
		super();
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

}
