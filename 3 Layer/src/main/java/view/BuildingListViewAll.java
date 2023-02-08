package view;

import java.util.List;

import controller.BuildingController;
import model.BuildingModel;

public class BuildingListViewAll {
	private List<BuildingModel> buildings;
	
	public BuildingListViewAll(List<BuildingModel> buildings) {
		this.buildings = buildings;
	}
	
	public void show() {
		if(buildings!=null) {
			for(BuildingModel building : buildings) {
				System.out.println(building.toString());
				System.out.println("-----------------------------------");
			}
		}
	}
	
	public static void main(String[] args) {
		BuildingController controller = new BuildingController();
		List<BuildingModel> buildings = controller.findAll();
		BuildingListViewAll view = new BuildingListViewAll(buildings);
		view.show();
	}
}
