package test1;

import java.util.Scanner;

public class T_test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		int hak=sc.nextInt();
		switch (hak/10) {
		case 10: case 9:
			System.out.println("A,B참잘하셨습니다.");
			break;
		case 8: case 7:
			System.out.println("C,D 더 잘해.");
			break;
			case 6: case 5:
				System.out.println("E,F 재수강.");
				break;
		default:
			break;
		}
		}
	}


