package test1;

import java.util.Scanner;

public class T_test18_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("윤년인지 아닌지 판단 년도를 입력하세요: ");
		int year=sc.nextInt();
		if(year%4==0) {
			//System.out.println("윤년입니다.");
			if(year%400==0) {
				System.out.println("윤년");
			}
			else if(year%100==0) {
				System.out.println("평년입니다.");
				
			}
			else{
				
				System.out.println("윤년입니다.");
			}
		}
	}
}

