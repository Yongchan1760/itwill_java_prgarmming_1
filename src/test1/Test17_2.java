package test1;

import java.util.Scanner;

public class Test17_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		while(true) {
			a=sc.nextLine();
			System.out.println();
			System.out.println("입력된 문자열:"+a+" ");
			if(a.equals("q")) {
				System.out.println("종료 777");
				break;
			}
		}
	}
}
