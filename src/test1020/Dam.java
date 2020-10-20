package test1020;

public class Dam {

	public static void main(String[] args) {
		Auto a=new Auto();
		a.setDaemon(true);
		a.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		System.out.println("메인쓰레드 종료");

	}

}
