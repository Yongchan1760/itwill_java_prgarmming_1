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
		//똑같은 이름을 가진 변수가 정의 되었다면 부모클래스 변수가 아닌 자식
		//클래스의 변수를 사용한다 
		//동일하지않는 변수는 상속 받는다.
		// 자식클래스에서 같은 이름의 멤버 변수 x,y에 의해서 숨겨지는
		//부모클래스의 멤버변수 x,y를 은닉변수 또는 쉐도우 변수라고 합니다.
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
