package test1020;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account account= new Account(5000);
		 Withrawthread ibank=new Withrawthread("���ͳݹ�ŷ",account,1000);
		 Withrawthread mbank=new Withrawthread("���ͳݹ�ŷ",account,1000);
		 ibank.start();
		 mbank.start();
	}

}
