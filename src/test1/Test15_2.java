package test1;

import java.util.Scanner;

public class Test15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc =new Scanner(System.in);
		System.out.print("�Է��� ���ڱ����� ���� ���Ͻÿ�: ");
		int a=sc.nextInt();
		for(i=2;i<=a;i++) {
			System.out.println(i+"����");
			for(j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}
