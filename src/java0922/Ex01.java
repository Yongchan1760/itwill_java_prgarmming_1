package java0922;

class A{}

class B extends  A{}//클래스 B는 A속성을 가진다
class C extends A{}

class D extends B{} //D는 B,A속성을 모두가진다.  업케스팅,다운캐스팅
class E extends C{}
public class Ex01 {// 부모로 변환하는건 자동형변환
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
		
		
		B b1=d;
		C c1=e;
		
		//B b3=e;
		//C c2=d;
		
	}

}
