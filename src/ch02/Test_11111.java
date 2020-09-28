package ch02;

class Ice_77{
	public void ice(){
		System.out.println("소금치기");
	}
}
class P1 extends Ice_77  { 
	
	@Override
	public void ice() {
		System.out.println("뼈다귀 해장국에 들개 가루 넣기");
	}
	public void 뼈추가하기(){
		System.out.println("뼈추가!");
	}
}
class P2 extends Ice_77{ 
	
	@Override
	public void ice() {
		System.out.println("콩나물해장국에 고추가루 넣기");
	}
	public void 콩나물넣기(){
		System.out.println("콩나물!");
	}
}

class Double_ice{
	//업캐스팅후 부모클래스타입의 참조변수로 여러 자식객체를 받을때 
	//하나의 메소드만 만들되 매개변수의 타입을 업캐스팅의 개념으로 받는다.(더효율적이다)
	public void tiger(Ice_77 a){ //new 뼈다귀해장국();  new 콩나물해장국();
		a.ice();
	}
	//매개변수로 전달 받은 객체는 그객체의 클래스타입의 참조변수로만 객체를 전달 받을수 있다.
	public void cat(P1 aa){
		aa.ice();
	}
	//매개변수로 전달 받은 객체는 그객체의 클래스타입의 참조변수로만 객체를 전달 받을수 있다.	
	public void dog(P2 bb){
		bb.ice();
	}
}
public class Test_11111 {

	public static void main(String[] args) {		
		//취객 객체 생성  -> 참조변수 취객1
		Double_ice double_ice = new Double_ice();
		//방법1.
		//해장국클래스타입 참조변수 = 뼈다귀해장국객체생성   //업캐스팅
		//참조변수이름 -> 해장국한그릇
		//조상타입의 참조변수 = 자식객체 생성; //업캐스팅
		Ice_77 ice = new P1();
		double_ice.tiger(ice);
		//조산타입의 참조변수 = 자식객체 생성; //업캐스팅
		ice = new P2();
		double_ice.tiger(ice);
		//방법2.
		//자기자신클래스타입의 참조변수로 자기자신 객체 생성시
		P1 p = new P1();
		double_ice.cat(p);
		P2 p2 = new P2();
		double_ice.dog(p2);
	}
}
