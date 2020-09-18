package java0919;

public class Static_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_3 a=new Static_3();
		a.field=10;
		a.field2=20;
		a.method2();
		a.method3();
		System.out.println(a.field2);
		Static_3.field2=33;
		//Static_3.field2=
	}

}
