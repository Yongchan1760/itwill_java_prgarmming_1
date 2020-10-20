package test1020;

public class Interrup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =new PrintThread2();
		thread.start();
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("메인 인터럽트");
		}
		thread.interrupt();
	}

}
