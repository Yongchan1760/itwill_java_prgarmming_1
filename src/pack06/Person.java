package pack06;

class Person_1{
	String sn="1515151-515151";
}
public class Person {
	String s1="1577-1999";
	String name="yong";
	int age=17;
	String address="광역시";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_1 t2= new Person_1();//객체 생성을 해줘야한다
		System.out.println(t2.sn);
		System.out.println(t2);
		//t2=t3;
		Person t1=new Person();
		Person t3=new Person();
		System.out.println("t3주소값은 "+t3);
		System.out.println("t1주소값은 "+t1);
		t1=t3;//대입이 아니라 공유
		System.out.println("t1 t3 공유 주소값은 "+t1);
		System.out.println(t1.address);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.s1);
		
	}
	

}
