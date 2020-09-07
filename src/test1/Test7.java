package test1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수 입력 :");
		int a=sc.nextInt();//
		int five=a/50000; //5만원///78880
		int m_one=(a%50000)/10000;//1만원
		int five_one=(a%10000)/5000;//5000
		int one=(a%5000)/1000;//1000
		int hun=(a%1000)/100;//100
		int hun_one=(a%100)/50;
		int hun_two=(a%50)/10;
		System.out.println("오만원권"+five+"매");
		System.out.println("만원권"+m_one+"매");
		System.out.println("오천원권"+five_one+"매");
		System.out.println("천원권"+one+"매");
		System.out.println("100원"+hun+"개");
		System.out.println("50원"+hun_one+"매");
		System.out.println("10원"+hun_two+"매");
	}

}
