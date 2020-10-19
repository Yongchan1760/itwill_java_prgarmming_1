package test1019;

public class Dan4 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("4´ÜÀº==="+"4*"+i+"="+4*i);
		}
		System.out.println();
	}
}
