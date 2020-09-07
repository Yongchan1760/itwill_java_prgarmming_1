package test1;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		int sum=1;
		int i;
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("입력된 "+a+"!값을 구하여라");
		for (i=1;i<=a;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
