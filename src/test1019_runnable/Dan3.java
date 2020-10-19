package test1019_runnable;

public class Dan3 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("3´ÜÀº==="+"3*"+i+"="+3*i);
		}
		System.out.println();
	}
}
