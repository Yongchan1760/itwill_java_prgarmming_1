package test1;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		int sum=1;
		int i;
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("�Էµ� "+a+"!���� ���Ͽ���");
		for (i=1;i<=a;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
