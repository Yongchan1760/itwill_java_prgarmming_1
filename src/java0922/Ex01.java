package java0922;

class A{}

class B extends  A{}//Ŭ���� B�� A�Ӽ��� ������
class C extends A{}

class D extends B{} //D�� B,A�Ӽ��� ��ΰ�����.  ���ɽ���,�ٿ�ĳ����
class E extends C{}
public class Ex01 {// �θ�� ��ȯ�ϴ°� �ڵ�����ȯ
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
