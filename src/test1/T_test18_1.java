package test1;

import java.util.Scanner;

public class T_test18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("x ��� ��ġ: ");
		int x=sc.nextInt();
		System.out.println("y ��� ��ġ: ");
		int y=sc.nextInt();
		if((x>=50&&x<=100)&&(y>=50&&y<=100)) {
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�.");
		}
		else
			System.out.println("�ܺ��� ���Դϴ�.");
	}

}
