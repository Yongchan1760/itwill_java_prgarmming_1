package ch02;

class Child_1{
	public void parent() {
		System.out.println("나는 토끼1입니당");
	}
	
}
class Parent_1 extends Child_1{
	
	
	public void parent2() {
		super.parent();
		System.out.println("나는 토끼2입니당");
	}// 수퍼클래스를 사용하여 부모클래스의 메소드를이용하여 메소드를 이어 연결
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_1 a= new Parent_1();
		a.parent2();
		
	}

}
