package test1019_runnable;

public class Dan4 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("4´ÜÀº==="+"4*"+i+"="+4*i);
		}
		System.out.println();
	}
}
