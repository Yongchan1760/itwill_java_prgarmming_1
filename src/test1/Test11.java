package test1;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���~: ");
		int age=sc.nextInt();
		System.out.println("00���� �����̴�"+age);
		String entry=(age>=15)?"���尡��":"�������";
		System.out.println(entry);
	}

}
