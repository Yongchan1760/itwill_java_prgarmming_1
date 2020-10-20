package test1020;

import java.util.Date;

public class TimerEX {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		Thread t=new Thread(new Runnable() {
			
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {//while
				try {
						Date date=new Date();
						Thread.sleep(1000);
						System.out.println(date);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	});
		t.start();;
		System.out.println("메인 종료 ");
	}
}
