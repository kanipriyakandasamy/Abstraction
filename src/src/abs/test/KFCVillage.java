package src.abs.test;

public class KFCVillage extends KFCMainBranch {

	@Override
	public void empCount() {
		System.out.println("Emp Count: 20");
		
	}

	@Override
	public void foodQuantity() {
		System.out.println("Food Quantity: 200");
		
	}
	public static void main(String[] args) {
		KFCVillage kfc = new KFCVillage();
		kfc.logo();
		kfc.menuAndRecipe();
		kfc.empCount();
		kfc.foodQuantity();
		
	}

}
