package view;

import java.util.List;

import controller.BuildingController;
import model.BuildingModel;

public class BuildingListViewSearch {
	List<BuildingModel> buildings;
	public BuildingListViewSearch(List<BuildingModel> buildings) {
		this.buildings = buildings;
	}
	
	public void show() {
		for(BuildingModel building : buildings) {
			System.out.println(building.toString());
			System.out.println("-----------------------------------");
		}
	}
	
	public static void main(String args[]) {
		BuildingController controller = new BuildingController();
		controller.findSearch(null, null, null, null).show();
	}
}
