package java1006;

public class Balance_1 extends Balance {
	
	void Bal(int balance) { 
		  if(balance>=0) {
			  this.balance=balance; 
			  System.out.println("�ƹ���"+balance);
		  }
		  else {
			  System.out.println("�ܾ� ������ �߸�����ϴ�.");
		  }
}
void withdraw(int m) {
	 if(m>balance) {
		 System.out.println("�ݾ��� ã���� �����ϴ�.");
	 }
	 else {
		 balance-=m;
	 }
}
void deposit(int m) {
		 if(m<0) {
			 System.out.println("�ݾ��� �����Ҽ� �����ϴ�.");
		 }
		 else {
			 balance+=m;
		 }	 
}
	
}
