package test1020;

public class synchronizedAccount extends Account{
	public synchronizedAccount(int bal) {
		super(bal);
	}
	public synchronized int withdraw(int money) {
		String threadName=Thread.currentThread().getName();
		if(bal>=money) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bal-=money;
			System.out.println(threadName+"��� : �ܾ�"+bal);
		}else {
			System.out.println(threadName+"�ܾ׺��� ��� �Ұ�");
		}
		return bal;
	}
	public int  deposit(int money) {
		return bal +=money;
	}
	}
	

