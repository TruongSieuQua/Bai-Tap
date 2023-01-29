package view;

import java.util.List;
import java.util.Scanner;

import controller.BuildingController;
import model.BuildingModel;

public class BuidingListView {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter building name: ");
		String name = in.nextLine();
		BuildingController buildingController = new BuildingController();
		List<BuildingModel> buildingModels = buildingController.findAll(name);
		for(BuildingModel item: buildingModels) {
			System.out.println("Name: " + item.getName());
		}
		in.close();
		
	}
}
