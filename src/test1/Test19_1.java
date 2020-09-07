package test1;

import java.util.Scanner;

public class Test19_1 {

	public static void main(String[] args) {
		int balance =0;
		int input;
		int money=0;
		Scanner sc= new Scanner(System.in);//선택
		for(;;) {
			System.out.println("------------------");
			System.out.println("1.예금 |2.출금|3.잔고|4.종료");
			System.out.println("------------------");
			System.out.println("<선택> :");
			input =sc.nextInt();
			if(input==1) {
				System.out.println("예금액을 입력하시오 :");
				money =sc.nextInt();//예금
				balance+=money;
				System.out.println("예금액 >"+balance);
			}
			else if(input==2) {
				System.out.println("출금액:");
				money =sc.nextInt();//예금
				balance-=money;
			}
			else if(input==3) {
				System.out.println("잔고 ="+balance);
			}
			else if(input==4) {
				System.out.println("종료");
				break;
			}
		}
	}
}
