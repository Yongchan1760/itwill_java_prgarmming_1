package test1019;

public class Dan2 extends Thread{
	
	@Override
	public void run() {
		//2~9
		for (int i = 1; i < 10; i++) {
			System.out.println("2����==="+"2*"+i+"="+2*i);
		}
		System.out.println();
	}
}
