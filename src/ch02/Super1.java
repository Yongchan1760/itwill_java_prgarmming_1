package ch02;

class Child_1{
	public void parent() {
		System.out.println("���� �䳢1�Դϴ�");
	}
	
}
class Parent_1 extends Child_1{
	
	
	public void parent2() {
		super.parent();
		System.out.println("���� �䳢2�Դϴ�");
	}// ����Ŭ������ ����Ͽ� �θ�Ŭ������ �޼ҵ带�̿��Ͽ� �޼ҵ带 �̾� ����
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_1 a= new Parent_1();
		a.parent2();
		
	}

}
