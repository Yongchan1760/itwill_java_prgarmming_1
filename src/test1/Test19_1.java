package test1;

import java.util.Scanner;

public class Test19_1 {

	public static void main(String[] args) {
		int balance =0;
		int input;
		int money=0;
		Scanner sc= new Scanner(System.in);//����
		for(;;) {
			System.out.println("------------------");
			System.out.println("1.���� |2.���|3.�ܰ�|4.����");
			System.out.println("------------------");
			System.out.println("<����> :");
			input =sc.nextInt();
			if(input==1) {
				System.out.println("���ݾ��� �Է��Ͻÿ� :");
				money =sc.nextInt();//����
				balance+=money;
				System.out.println("���ݾ� >"+balance);
			}
			else if(input==2) {
				System.out.println("��ݾ�:");
				money =sc.nextInt();//����
				balance-=money;
			}
			else if(input==3) {
				System.out.println("�ܰ� ="+balance);
			}
			else if(input==4) {
				System.out.println("����");
				break;
			}
		}
	}
}
