package test1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� 5���� �Է��Ͻÿ� �ϳ��� �Է��Ͻÿ�1:");
			int a = sc.nextInt();
			sum += a;
		}
		System.out.println("�հ��: " + sum);
		System.out.println("�����: " + sum / 5);
	}
}
