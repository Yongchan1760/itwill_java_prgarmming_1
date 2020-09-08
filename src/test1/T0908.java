package test1;

import java.util.Scanner;

public class T0908 {

	public static void main(String[] args) {
		//09-08
		/*
		 * int []arr3= {1,5,3,8,2}; int max=arr3[0]; for (int i = 0; i < arr3.length;
		 * i++) { if(arr3[i]>max) { max=arr3[i]; } } System.out.println(max);
		 */
		
		////////////////
		boolean run=true;
		int studentnum=0;
		int score[]=null;
		Scanner sc=new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.학생수|2.점수|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------");
			System.out.println("번호를 선택하시오 :");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("학생수를 입력하세요:");
				studentnum=sc.nextInt();
				System.out.println("선택한 번호는>>>>>>"+select);
				System.out.println("학생수는"+studentnum);
			}
			else if(select==2) {	
				score=new int[studentnum];
				for (int i = 0; i < studentnum; i++) {
					System.out.println("점수를 입력하세요:");
					score[i]=sc.nextInt();
					System.out.println("점수는"+"score["+i+"]="+score[i]);
				}
			}
			else if(select==3) {
				System.out.println("선택한 번호는>>>>>>"+select);
				for (int i = 0; i < studentnum; i++) {
					System.out.println("score["+i+"]="+score[i]);
				}
			}
			else if(select==4) {
				int max1=score[0];
				System.out.println("선택한 번호는>>>>>>"+select);
				for (int i = 0; i < score.length; i++) {
					if(score[i]>max1) {
						max1=score[i];
					}
				}
				System.out.println("최고값은"+max1);
				
				int sum=0;
				int avg=0;
				for (int i = 0; i < score.length; i++) {
					
					sum+=score[i];
				}
				System.out.println("합은"+sum);
				avg=sum/score.length;
				System.out.println("평균점수는"+avg);
			}
			else if(select==5) {
				System.out.println("선택한 번호는>>>>>>"+select);
				run =false;
			}
		}
		System.out.println("종료");
	}

}
