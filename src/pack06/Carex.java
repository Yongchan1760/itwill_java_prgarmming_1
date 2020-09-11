package pack06;

public class Carex {

	public static void main(String[] args) {
		Car a=new Car();
		System.out.println("차 색깔 "+a.color);
		System.out.println("제작회사는 "+a.company);
		System.out.println("최고속도는 "+a.maxspeed);
		System.out.println("차종은 "+a.model);
		
		a.speed=500;
		System.out.println("수정된 속도는"+a.speed);
	}

}
