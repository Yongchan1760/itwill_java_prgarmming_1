package ch02;

/*
 * �޼ҵ� �������̵��̶� 
 *  ��Ӱ����� �θ�Ŭ������ �޼ҵ� �̸�, �Ű����� �ڷ���Ÿ��, ����Ÿ���� ��� �����ϵ�
 *  �ڽ�Ŭ�������� �޼ҵ��� �����θ� ���ۼ��ϴ°� 
 * 
 * 
 * */

class Parent5{
	//�θ�Ŭ������ ����� �޼ҵ�
		
		public void parentPrn(){
			//�޼ҵ� ������
			System.out.println("�θ�Ŭ������ parentPrn");
		}//�޼ҵ��� �����
		public void ChildPrn(){
			System.out.println("�θ�Ŭ������ childPrn �޼ҵ�");
		}
		public void ChildPrn2(){
			System.out.println("�θ�Ŭ������ childPrn �޼ҵ�");
		}
}

//parent�� �θ�Ŭ������ �ϴ� �ڽ�Ŭ���� child5Ŭ���� ����
class Child5 extends Parent5{
	//child5 �ڽ� Ŭ�������� ����� �޼ҵ� 
	@Override
	public void ChildPrn(){
		System.out.println("�ڽ�Ŭ������ childPrn �޼ҵ� �������̵�");
	}
	@Override
	public void parentPrn(){
		//�޼ҵ� ������
		System.out.println("�ڽ�Ŭ������ parentPrn �������̵�");
	}//�޼ҵ��� �����
	
	public void parentPrn2(){
		//�޼ҵ� ������
		System.out.println("�ڼ� parentPrn2");
	}//�޼ҵ��� �����

}
public class Ex5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent5 p5=new Child5();//�� ĳ����      //�ڽ�Ŭ������ ��ü�� �θ�Ÿ������ ��ĳ����
		
		Child5 c=(Child5)p5;//�ٿ� ĳ����        //�ڽ�Ŭ������ ��ü�� �ڼ�Ÿ������ �ٿ�ĳ���� 
		c.ChildPrn2();
		c.parentPrn2();//�ڽ����� �ٲ� 
		
		//�������̵��� �θ� �޼ҵ��ſ� �� �޼ҵ带 �����Ҷ� ����ϰ�
		// ����Ŭ������ ����ϸ� �޼ҵ带 �������ϴ°ź��� ���� �θ�޼ҵ忡 ���Ӱ� �߰��ϰ� ������ ��� 
	}

}

