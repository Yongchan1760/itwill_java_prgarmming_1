package pack06;

class Person_1{
	String sn="1515151-515151";
}
public class Person {
	String s1="1577-1999";
	String name="yong";
	int age=17;
	String address="������";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_1 t2= new Person_1();//��ü ������ ������Ѵ�
		System.out.println(t2.sn);
		System.out.println(t2);
		//t2=t3;
		Person t1=new Person();
		Person t3=new Person();
		System.out.println("t3�ּҰ��� "+t3);
		System.out.println("t1�ּҰ��� "+t1);
		t1=t3;//������ �ƴ϶� ����
		System.out.println("t1 t3 ���� �ּҰ��� "+t1);
		System.out.println(t1.address);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.s1);
		
	}
	

}
