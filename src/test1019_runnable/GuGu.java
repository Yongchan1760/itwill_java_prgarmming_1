package test1019_runnable;

import test1019.Dan2;
import test1019.Dan4;

public class GuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ����");
		//2�� �۾� ������ ����� 
			Thread t2=new Thread(new Dan2());
			t2.start();
		//3�� �۾� ������ �����
			Thread t3=new Thread(new Dan3());
			t3.start();
		//4�� �۾� ������ ����� 
			Thread t4=new Thread(new Dan4());
			t4.start();
		System.out.println("���� ������ ��");
	}

}
