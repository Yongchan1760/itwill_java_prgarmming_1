package test1013;

public class CircleE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������, ��ǥ x, ��ǥ y
		Circle c1= new Circle(30,10,10);
		Circle c2=new Circle(20,10,10);
		Circle c3=new Circle(20,20,10);
		
		//������ ũ�Ⱑ ������ ���� ���̴�.
		//������ ũ�Ⱑ ���� ��ǥ�� ������ ���� ���̴�.
		if(c2.equals(c3)) {
			System.out.println("������ " +c2);
		}
		else
			System.out.println("�ٸ��� " +c3+""+c2);
	}

}
