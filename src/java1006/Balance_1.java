package java1006;

public class Balance_1 extends Balance {
	
	void Bal(int balance) { 
		  if(balance>=0) {
			  this.balance=balance; 
			  System.out.println("아버지"+balance);
		  }
		  else {
			  System.out.println("잔액 설정이 잘못됬습니다.");
		  }
}
void withdraw(int m) {
	 if(m>balance) {
		 System.out.println("금액을 찾을수 없습니다.");
	 }
	 else {
		 balance-=m;
	 }
}
void deposit(int m) {
		 if(m<0) {
			 System.out.println("금액을 저축할수 없습니다.");
		 }
		 else {
			 balance+=m;
		 }	 
}
	
}
