package test1019;

public class MusicRunnable implements Runnable{
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("������ ����մϴ�.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
}
