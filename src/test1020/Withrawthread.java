package test1020;

public class Withrawthread  extends Thread{
	Account account;
	int money;
	boolean flag=true;
	
	public Withrawthread (String name, Account account, int money) {
		super(name);
		this.account=account;
		this.money=money;
	}
	public void run() {
		for (int i = 0; i < 6||flag; i++) {
			int bal=account.withdraw(money);
			if(bal<= money) {
				flag=false;
			}
		}
	}
}
