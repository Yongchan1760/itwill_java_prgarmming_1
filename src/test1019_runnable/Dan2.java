package test1019_runnable;

public class Dan2 implements Runnable{
	
	@Override
	public void run() {
		//2~9
		for (int i = 1; i < 10; i++) {
			System.out.println("2´ÜÀº==="+"2*"+i+"="+2*i);
		}
		System.out.println();
	}
}
