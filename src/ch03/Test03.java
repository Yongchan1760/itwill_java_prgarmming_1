package ch03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���̵� :");
		String a= sc.nextLine();//"java"
		System.out.println("�н�����:");
		String b= sc.nextLine();
		int pass=Integer.parseInt(b);
		if(a.equals("java")) {
				if(pass==12345) {
					System.out.println("�α��� ����");
				}
				else {
				System.out.println("�н� Ʋ��");
				}	
		}
		else {
			System.out.println("���̵� Ʋ��");
		}
	}
}
