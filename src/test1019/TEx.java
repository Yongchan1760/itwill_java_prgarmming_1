package test1019;

public class TEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 시작");
		Thread thread1=new MovieThread();
		thread1.start();
		
		Thread thread2=new Thread(new MusicRunnable());
		thread2.start();
		System.out.println("메인 끝");
	}

}
