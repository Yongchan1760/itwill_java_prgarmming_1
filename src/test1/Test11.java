package test1;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세용~: ");
		int age=sc.nextInt();
		System.out.println("00이의 나이이는"+age);
		String entry=(age>=15)?"입장가능":"입장불허";
		System.out.println(entry);
	}

}
