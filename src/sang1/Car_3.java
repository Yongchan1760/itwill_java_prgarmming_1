package sang1;

public class Car_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_2 c1=new Car_2();
		System.out.println(c1.company);
		System.out.println();
		Car_2 c2=new Car_2("�ڰ���");
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println();
		Car_2 c3=new Car_2("�ڰ���","����");
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println();
		Car_2 c4=new Car_2("�ý�","����",200);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxspeed);
		System.out.println();
	}

}
