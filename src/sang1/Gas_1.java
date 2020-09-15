package sang1;

public class Gas_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gas g1=new Gas();
		g1.setGas(10);
		boolean gastate =g1.isleftgas();
		if(gastate) {
			System.out.println("출발");
			g1.run();
		}
		
		if(g1.isleftgas()) {
			System.out.println("gas 주입 할필요없다.");
		}
		else {
			System.out.println("gas 주입하세요");
		}
	}

}
