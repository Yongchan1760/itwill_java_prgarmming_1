package test1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		final double PI = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է����ּ���.");
		int radius = sc.nextInt();
		
		double area = radius * 2 * PI;
		System.out.println("���� ����");
		System.out.println(area);

	}

}
