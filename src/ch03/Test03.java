package ch03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디 :");
		String a= sc.nextLine();//"java"
		System.out.println("패스워드:");
		String b= sc.nextLine();
		int pass=Integer.parseInt(b);
		if(a.equals("java")) {
				if(pass==12345) {
					System.out.println("로그인 성공");
				}
				else {
				System.out.println("패스 틀림");
				}	
		}
		else {
			System.out.println("아이디 틀림");
		}
	}
}
