package test1020;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("인터럽트 발생"+e);
		}
		System.out.println("자원정리");
		System.out.println("자원종료");

	}

}
