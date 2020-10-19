package test1019;

public class GuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		//2단 작업 스레드 만들기 
			Dan2 dan2=new Dan2();
			dan2.start();
		//3단 작업 스레드 만들기
			Dan3 dan3=new Dan3();
			dan3.start();
		//4단 작업 스레드 만들기 
			Dan4 dan4=new Dan4();
			dan4.start();
			
		System.out.println("메인 스레드 끝");
	}

}
