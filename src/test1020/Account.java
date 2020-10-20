package test1020;

public class Account {
	protected int bal;
	
	public Account (int bal) {
		this.bal=bal;
	}
	public int withdraw(int money) {
		String threadName=Thread.currentThread().getName();
		if(bal>=money) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bal-=money;
			System.out.println(threadName+"출금 : 잔액"+bal);
		}else {
			System.out.println(threadName+"잔액부족 출금 불가");
		}
		return bal;
	}
	public int  deposit(int money) {
		return bal +=money;
	}
}
