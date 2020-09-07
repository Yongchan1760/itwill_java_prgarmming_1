package test1;

import java.util.Scanner;

public class Test13 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int mon;
			while(true) {
				System.out.println("알고싶은달을 입력 :");
				mon=sc.nextInt();
					switch(mon) {
						case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						System.out.println("31일까지 있는 달입니다.");
						break;
						case 2: case 4: case 6: case 9: case 11:
						System.out.println("30일까지 있는 달입니다.");
						break;
						default:
			    	    System.out.println("잘못된 입력 입니돵~");
				}
				System.out.println();
			}
		 }
	}					


