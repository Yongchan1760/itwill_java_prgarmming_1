package test1;

import java.util.Scanner;

public class Test13 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int mon;
			while(true) {
				System.out.println("�˰�������� �Է� :");
				mon=sc.nextInt();
					switch(mon) {
						case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						System.out.println("31�ϱ��� �ִ� ���Դϴ�.");
						break;
						case 2: case 4: case 6: case 9: case 11:
						System.out.println("30�ϱ��� �ִ� ���Դϴ�.");
						break;
						default:
			    	    System.out.println("�߸��� �Է� �Դω�~");
				}
				System.out.println();
			}
		 }
	}					


