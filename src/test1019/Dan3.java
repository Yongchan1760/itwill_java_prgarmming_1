package test1019;

public class Dan3 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("3´ÜÀº==="+"3*"+i+"="+3*i);
		}
		System.out.println();
	}
}
