package sang1;

public class Car_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_4 c1=new Car_4();
		System.out.println(c1.company);
		System.out.println();
		Car_4 c2=new Car_4("자가용");
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println();
		Car_4 c3=new Car_4("자가용","빨강");
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println();
		Car_4 c4=new Car_4("택시","검정",200);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxspeed);
		System.out.println();
	}

}
