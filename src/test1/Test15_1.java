package test1;

import java.util.Scanner;

public class Test15_1 {

	public static void main(String[] args) {
		int sum=0;
		int i,f;
		Scanner sc =new Scanner(System.in);
		System.out.print("�Էµ� �� ������ ���� ���Ͻÿ�: ");
		f=sc.nextInt();
		for(i=0;i<=f;i++) {
			sum+=i;
		}
		System.out.println("������"+sum);
	}
}
