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
			System.out.println("1.�л���|2.����|3.��������Ʈ|4.�м�|5.����");
			System.out.println("-----------------------");
			System.out.println("��ȣ�� �����Ͻÿ� :");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("�л����� �Է��ϼ���:");
				studentnum=sc.nextInt();
				System.out.println("������ ��ȣ��>>>>>>"+select);
				System.out.println("�л�����"+studentnum);
			}
			else if(select==2) {	
				score=new int[studentnum];
				for (int i = 0; i < studentnum; i++) {
					System.out.println("������ �Է��ϼ���:");
					score[i]=sc.nextInt();
					System.out.println("������"+"score["+i+"]="+score[i]);
				}
			}
			else if(select==3) {
				System.out.println("������ ��ȣ��>>>>>>"+select);
				for (int i = 0; i < studentnum; i++) {
					System.out.println("score["+i+"]="+score[i]);
				}
			}
			else if(select==4) {
				int max1=score[0];
				System.out.println("������ ��ȣ��>>>>>>"+select);
				for (int i = 0; i < score.length; i++) {
					if(score[i]>max1) {
						max1=score[i];
					}
				}
				System.out.println("�ְ���"+max1);
				
				int sum=0;
				int avg=0;
				for (int i = 0; i < score.length; i++) {
					
					sum+=score[i];
				}
				System.out.println("����"+sum);
				avg=sum/score.length;
				System.out.println("���������"+avg);
			}
			else if(select==5) {
				System.out.println("������ ��ȣ��>>>>>>"+select);
				run =false;
			}
		}
		System.out.println("����");
	}

}
