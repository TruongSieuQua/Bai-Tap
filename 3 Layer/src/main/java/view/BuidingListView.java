package view;

public class BuidingListView {
	
//	public static void main(String[] args) {
//		System.out.println("1. Xem tat ca danh sach!");
//		viewAllBuildingList();
//		
//		System.out.println("2. Tim kiem");
//		viewSearchBuildingList();
//		
//	}
//	
//	public static void viewAllBuildingList() {
//		BuildingController buildingController = new BuildingController();
//		List<BuildingModel> buildingModels = buildingController.findAll();
//		System.out.println("Ket qua: ");
//		for(BuildingModel item: buildingModels) {
//			showInfo(item);
//		}
//	}
//	
//	public static void viewSearchBuildingList() {
//		BuildingController buildingController = new BuildingController();
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter building name: ");
//		String name = in.nextLine();
//		System.out.print("Enter building street: ");
//		String street = in.nextLine();
//		System.out.print("Enter number of basement: ");
//		String nob = in.nextLine();
//		Integer numberOfBasement = nob.matches("[0-9]+") ? Integer.parseInt(in.nextLine()): null;
//		System.out.print("Enter floor area: ");
//		String fa = in.nextLine();
//		Integer floorArea = fa.matches("[0-9]+")? Integer.parseInt(in.nextLine()): null;
//		System.out.println("Ket qua: ");
//		List<BuildingModel> buildingModels = buildingController.findSearch(name, street, numberOfBasement, floorArea);
//		for(BuildingModel item: buildingModels) {
//			showInfo(item);
//		}
//		in.close();
//	}
	
//	private static void showInfo(BuildingModel building) {
//		System.out.println(building.toString());
//	}
}
