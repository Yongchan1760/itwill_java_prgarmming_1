package test1019;

public class Thread_test {

	public static void main(String[] args) {
		 System.out.println("메인시작");
		 Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("go");
				}
			}
			
			
		});
		 t1.start();
		 Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <100; i++) {
				System.out.println("res");	
				}
				
			}
		});
		 System.out.println("메인종료");
	}

}
