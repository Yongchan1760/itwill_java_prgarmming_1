package test1;


import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		String data= sc.next();
		{
			switch(data) {
			case "spring":
				System.out.println("����");
				break;
			case "summer":
				System.out.println("����");
				break;
			case "winter":
				System.out.println("����");
				break;
			case "fall":
				System.out.println("�ҽ� �߹���");
				break;
			default :
				System.out.println("�߸��Ȱ��� �ԷµǾ����ϴ�.");
				break;
				}
		}
	}
}
