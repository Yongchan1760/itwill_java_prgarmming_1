package test1;

import java.util.Scanner;

public class T_test18_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� �ƴ��� �Ǵ� �⵵�� �Է��ϼ���: ");
		int year=sc.nextInt();
		if(year%4==0) {
			//System.out.println("�����Դϴ�.");
			if(year%400==0) {
				System.out.println("����");
			}
			else if(year%100==0) {
				System.out.println("����Դϴ�.");
				
			}
			else{
				
				System.out.println("�����Դϴ�.");
			}
		}
	}
}

