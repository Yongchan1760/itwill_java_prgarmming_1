package java0921;

public class Airsuper extends Air{
	public static final int normal=1;
	public static final int supersonic=2;
	public int flymode =normal;
	
	@Override
	public void fly() {
		if(flymode==supersonic) {
			System.out.println("������ �����մϴ�.");
		}
		else
			super.fly();
	}
}
