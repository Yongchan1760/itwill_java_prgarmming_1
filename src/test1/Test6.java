package test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간으로 변경할 초를 입력하세요: ");
		int sec = sc.nextInt();
		int hour = sec / 3600;
		int min = (sec % 3600) / 60;
		int second = sec % 3600 % 60;
		System.out.println(hour+"시간 "+min+"분 "+second+"초 ");	
	}
}
