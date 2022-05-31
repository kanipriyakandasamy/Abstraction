package src.abs.test;

public class India implements FuelPrice,Interf1{
	
	@Override
	public void petrol() {
		System.out.println("100");	
	}
	@Override
	public void diesel() {
		System.out.println("90");	
	}
	public void crude() {
		System.out.println("50");
	}
	@Override
	public void m1() {
		System.out.println("M1");
		
	}

	public static void main(String[] args) {
		India i = new India();
		i.petrol();
		i.diesel();
		i.crude();
	}
	
}
