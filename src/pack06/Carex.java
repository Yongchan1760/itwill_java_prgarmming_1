package pack06;

public class Carex {

	public static void main(String[] args) {
		Car a=new Car();
		System.out.println("�� ���� "+a.color);
		System.out.println("����ȸ��� "+a.company);
		System.out.println("�ְ�ӵ��� "+a.maxspeed);
		System.out.println("������ "+a.model);
		
		a.speed=500;
		System.out.println("������ �ӵ���"+a.speed);
	}

}
