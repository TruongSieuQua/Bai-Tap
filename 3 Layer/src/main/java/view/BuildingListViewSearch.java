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
		Scanner in = new Scanner(System.in);
		System.out.print("Enter building name: ");
		String name = in.nextLine();
		System.out.print("Enter building street: ");
		String street = in.nextLine();
		System.out.print("Enter number of basement: ");
		String nob = in.nextLine();	
		Integer numberOfBasement = nob.matches("[0-9]+") ? Integer.parseInt(nob): null;
		System.out.print("Enter floor area: ");
		String fa = in.nextLine();
		Integer floorArea = fa.matches("[0-9]+")? Integer.parseInt(fa): null;
		System.out.println("Ket qua: ");
		List<BuildingModel> buildingModels = controller.findSearch(name, numberOfBasement, floorArea, street, null);
		BuildingListViewSearch view = new BuildingListViewSearch(buildingModels);
		in.close();
		view.show();
	}
}
