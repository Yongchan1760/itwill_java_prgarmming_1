package test1;

import java.util.Scanner;

public class T_test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		int hak=sc.nextInt();
		switch (hak/10) {
		case 10: case 9:
			System.out.println("A,B�����ϼ̽��ϴ�.");
			break;
		case 8: case 7:
			System.out.println("C,D �� ����.");
			break;
			case 6: case 5:
				System.out.println("E,F �����.");
				break;
		default:
			break;
		}
		}
	}


