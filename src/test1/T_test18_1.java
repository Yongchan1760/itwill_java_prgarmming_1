package test1;

import java.util.Scanner;

public class T_test18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("x 평면 위치: ");
		int x=sc.nextInt();
		System.out.println("y 평면 위치: ");
		int y=sc.nextInt();
		if((x>=50&&x<=100)&&(y>=50&&y<=100)) {
			System.out.println("사각형 안에 점이 있습니다.");
		}
		else
			System.out.println("외부의 점입니다.");
	}

}
