package java0921;

public class Airsuper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airsuper a=new Airsuper();
		a.takeoff();
		a.fly();
		a.flymode=a.supersonic;
		a.fly();
		a.flymode=a.normal;
		a.fly();
		a.land();
		a.fly();
		a.flymode=a.supersonic;
		a.fly();
		a.land();
	}

}
