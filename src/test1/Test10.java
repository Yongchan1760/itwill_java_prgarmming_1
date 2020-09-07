package test1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 5개를 입력하시오 하나씩 입력하시오1:");
			int a = sc.nextInt();
			sum += a;
		}
		System.out.println("합계는: " + sum);
		System.out.println("평균은: " + sum / 5);
	}
}
