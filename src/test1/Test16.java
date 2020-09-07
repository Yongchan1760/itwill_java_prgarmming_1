package test1;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i;
		int max=0;//arr[0]
		int min=0;//arr[0]
		int [] arr=new int[5];//배열 선언
			for(i=0;i<arr.length;i++) {
				System.out.println("정수를 입력해서 배열에 저장해보자 :");
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
			System.out.println("가장 큰값은"+" "+max+" "+"가장 작은값은"+min);
		}
	}
