package test1;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		int sum=0;
		int i,a;
		Scanner sc =new Scanner(System.in);
		System.out.println("�Էµ� �� ������ ���� ���Ͻÿ�: ");
		a=sc.nextInt();
		for(i=0;i<=a;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
