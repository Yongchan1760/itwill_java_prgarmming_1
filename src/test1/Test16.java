package test1;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i;
		int max=0;//arr[0]
		int min=0;//arr[0]
		int [] arr=new int[5];//�迭 ����
			for(i=0;i<arr.length;i++) {
				System.out.println("������ �Է��ؼ� �迭�� �����غ��� :");
				arr[i]=sc.nextInt();
			}
			for(i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			for(i=0;i<arr.length;i++) {
				if(arr[i]>max) {  // 5 4 2 6 0
					max=arr[i];
				}
				else if(arr[i]<min) {// -1 5 3 2-2
					min=arr[i];
				}
			}
			System.out.println("���� ū����"+" "+max+" "+"���� ��������"+min);
		}
	}
