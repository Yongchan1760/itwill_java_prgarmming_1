package test1;

import java.util.Scanner;

public class Test_17_3 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("첫번째 숫자 :");
//		int a1=sc.nextInt();
//		System.out.println("두번째 숫자 :");
//		int a2=sc.nextInt();
//		System.out.println();
//		System.out.println(a1+a2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 숫자 :");
		String a1=sc.next();
		System.out.println("두번째 숫자 :");
		String a2=sc.next();
		int num1=Integer.parseInt(a1);
		int num2=Integer.parseInt(a2);
		System.out.println();
		System.out.println(num1+num2);
		//스캐너 클로즈
	}

}
