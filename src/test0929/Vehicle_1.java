package test0929;

public class Vehicle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle =new Bus();
		
		vehicle.run();
		
		Bus bus=(Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
