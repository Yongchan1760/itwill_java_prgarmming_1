package ch02;

class Child_2{
	public void parent() {
		System.out.println("�������� �۸�");
	}
	
}
class Parent_2 extends Child_2{
	
	
	public void parent1() {
		System.out.println("����̴� �߿�");
	}
}
public class Super_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_2 a= new Parent_2();
		a.parent1();
		
	}

}
