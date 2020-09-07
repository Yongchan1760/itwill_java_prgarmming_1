package ch03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("점수를 입력하시오  :");
		int score=sc.nextInt();
		
		char total=(score>=90)?'A':((score>=80)?'B':(score>=70)?'C':'D');
		System.out.println(total);
		
	}

}
