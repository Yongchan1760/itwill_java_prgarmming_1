package ch02;

class P2d{
		protected int x=10;
		protected int y=20;
		protected int t=20;
}
class P3d extends P2d{
	
	protected int x=30;
	protected int y=40;
	protected int z=50;
	public void print() {
		//�Ȱ��� �̸��� ���� ������ ���� �Ǿ��ٸ� �θ�Ŭ���� ������ �ƴ� �ڽ�
		//Ŭ������ ������ ����Ѵ� 
		//���������ʴ� ������ ��� �޴´�.
		// �ڽ�Ŭ�������� ���� �̸��� ��� ���� x,y�� ���ؼ� ��������
		//�θ�Ŭ������ ������� x,y�� ���к��� �Ǵ� ������ ������� �մϴ�.
		System.out.println(x+"+"+y+"+"+z+"+"+t);
		
	}
	public void print2() {
		System.out.println(super.x+","+super.y);
	}
}
public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3d s=new P3d();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.z);
		System.out.println(s.t);
		s.print();
		System.out.println("---------------super");
		s.print2();
		
	}

}
