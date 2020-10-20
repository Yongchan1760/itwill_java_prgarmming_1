package test1020;

public class JoinEx{

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+"메인시작");
		System.out.println(Thread.currentThread().getName()+"메인종료");
		
		
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(2000);
						System.out.println(Thread.currentThread().getName()+"go");
					} catch (Exception e) {
					
					}
					
				}
				
			}
		},"스레드1");
		t1.start();
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(2000);
						System.out.println(Thread.currentThread().getName()+"go");
					} catch (Exception e) {
					
					}
				}
				
			}
		},"스레드2");
		t2.start();
		
		 try { t1.join(); } catch (Exception e) {
		 
		  } System.out.println(Thread.currentThread().getName());
		 
	}

}
