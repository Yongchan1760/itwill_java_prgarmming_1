package test1;


import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("계절을 입력하세요 :");
		String data= sc.next();
		{
			switch(data) {
			case "spring":
				System.out.println("봄봄");
				break;
			case "summer":
				System.out.println("따뜻");
				break;
			case "winter":
				System.out.println("솔져");
				break;
			case "fall":
				System.out.println("쌀쌀 추버라");
				break;
			default :
				System.out.println("잘못된값이 입력되었습니다.");
				break;
				}
		}
	}
}
