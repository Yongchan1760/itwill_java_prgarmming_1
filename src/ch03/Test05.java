package ch03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		int num=(int)(Math.random()*6);
//		if(num==1) 
//			System.out.println("1��");
//		else if(num==2) 
//			System.out.println("2��");
//		else if(num==3) 
//			System.out.println("3��");
//		else if(num==4) 
//			System.out.println("4��");
//		else if(num==5) 
//			System.out.println("5��");
//		else 
//			System.out.println("6��");
		/*int num=(int)(Math.random()*6)+1;
		//0~5
		//+1 1~6
		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("6");
			break;*/
			Scanner sc =new Scanner(System.in);
			System.out.print("�����Է� :");
			String name= sc.nextLine();
			switch (name) {
			case "����":
				System.out.println("500");
				break;
			case "����":
				System.out.println("700");
				break;
			case "����":
				System.out.println("1000");
				break;
			case "����":
				System.out.println("300");
				break;
			default: 
				break;
			}
		}
	}


