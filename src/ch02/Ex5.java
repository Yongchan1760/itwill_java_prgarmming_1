package ch02;

/*
 * 메소드 오버라이딩이란 
 *  상속관계의 부모클래스의 메소드 이름, 매개변수 자료형타입, 리턴타입이 모두 동일하되
 *  자식클래스에서 메소드의 구현부를 재작성하는것 
 * 
 * 
 * */

class Parent5{
	//부모클래스에 선언된 메소드
		
		public void parentPrn(){
			//메소드 구현부
			System.out.println("부모클래스의 parentPrn");
		}//메소드의 선언부
		public void ChildPrn(){
			System.out.println("부모클래스의 childPrn 메소드");
		}
		public void ChildPrn2(){
			System.out.println("부모클래스의 childPrn 메소드");
		}
}

//parent를 부모클래스로 하는 자식클래서 child5클래스 정의
class Child5 extends Parent5{
	//child5 자식 클래스에서 선언된 메소드 
	@Override
	public void ChildPrn(){
		System.out.println("자식클래스의 childPrn 메소드 오버라이드");
	}
	@Override
	public void parentPrn(){
		//메소드 구현부
		System.out.println("자식클래스의 parentPrn 오버라이드");
	}//메소드의 선언부
	
	public void parentPrn2(){
		//메소드 구현부
		System.out.println("자손 parentPrn2");
	}//메소드의 선언부

}
public class Ex5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent5 p5=new Child5();//업 캐스팅      //자식클래스의 객체를 부모타입으로 업캐스팅
		
		Child5 c=(Child5)p5;//다운 캐스팅        //자식클래스의 객체를 자손타입으로 다운캐스팅 
		c.ChildPrn2();
		c.parentPrn2();//자식으로 바뀜 
		
		//오버라이딩은 부모 메소드대신에 새 메소드를 정의할때 사용하고
		// 수퍼클래스를 사용하면 메소드를 재정의하는거보다 기존 부모메소드에 새롭게 추가하고 싶을때 사용 
	}

}

