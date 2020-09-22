package java0922;

public class C_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_1 c=new C_1();
		
		P_1 p=c;
		p.method1();
		p.method2();
		//p.method3();
	}
	//상속받은 c_1타입으로 c객체를 생성 
	//부모타입을 자손타입으로 업캐스팅하였다.
	// 자손타입으로 타입캐스팅된 부모타임은 메소드를 1,2를 가진다 
	//타입캐스팅된 보모타입을 호출하면 재정으된 메소드가 호출된다 약속
	// 
}
