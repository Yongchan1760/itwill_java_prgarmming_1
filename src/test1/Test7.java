package test1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �׼� �Է� :");
		int a=sc.nextInt();//
		int five=a/50000; //5����///78880
		int m_one=(a%50000)/10000;//1����
		int five_one=(a%10000)/5000;//5000
		int one=(a%5000)/1000;//1000
		int hun=(a%1000)/100;//100
		int hun_one=(a%100)/50;
		int hun_two=(a%50)/10;
		System.out.println("��������"+five+"��");
		System.out.println("������"+m_one+"��");
		System.out.println("��õ����"+five_one+"��");
		System.out.println("õ����"+one+"��");
		System.out.println("100��"+hun+"��");
		System.out.println("50��"+hun_one+"��");
		System.out.println("10��"+hun_two+"��");
	}

}
