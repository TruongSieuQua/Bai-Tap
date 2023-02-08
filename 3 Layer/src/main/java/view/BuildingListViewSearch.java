package view;

import java.util.List;
import java.util.Scanner;

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
		BuildingModel searchKey = new BuildingModel();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter building name: ");
		String name = in.nextLine();
		searchKey.setName(name.isBlank() ? null: name);

		System.out.print("Enter building street: ");
		String street = in.nextLine();
		searchKey.setStreet(street.isBlank() ? null :street);
		
		System.out.println("Ket qua: ");
		List<BuildingModel> buildingModels = controller.findSearch(searchKey);
		BuildingListViewSearch view = new BuildingListViewSearch(buildingModels);
		in.close();
		view.show();
	}
}
