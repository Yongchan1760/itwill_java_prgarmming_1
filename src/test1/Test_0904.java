package test1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test_0904 {
	
	public static int add(int []score) {
	 int sum=0;
	 	for(int i=0;i<3;i++) {
			sum+=score[i];
		}
	 	return sum;
	}
	
	public static void main(String[] args) {
		int [] score;
		score=new int[] {83,99,70};
		int sum1=0;
			for(int i=0;i<3;i++) {
			sum1+=score[i];
			}
		System.out.println("sum1������="+sum1);
		int sum2= add(new int[] {10,20,30} );
		System.out.println("sum2 ����"+sum2);
		System.out.println();
	}
}
		/*
		 * int[]score= {89,89,456}; int sum=0; for (int i = 0; i < score.length; i++) {
		 * sum+=score[i]; } System.out.println(sum); double
		 * avg=(double)sum/score.length; System.out.println(avg); double []s1=new
		 * double[3]; String []s2=new String[3]; Test_0904 t[]=new Test_0904[3];
		 * System.out.println("t�� �ּҰ�="+t); for (int i = 0; i < t.length; i++) {
		 * t[i]=new Test_0904(); } String s3=new String("sfsfqqqq");
		 * 
		 * 
		 * String []s5= {"10","66"};
		 * 
		 * 
		 * 
		 * String []s4= new String[10]; for (int i = 0; i < s4.length; i++) { s4[i]=new
		 * String(); }
		 * 
		 * Test_0904 []s8= new Test_0904[10]; for (int i = 0; i < s4.length; i++) {
		 * s8[i]=new Test_0904(); }
		 */
		
		/*
		 * int []s9= new int[10] ;
		 * 
		 * for (int i = 0; i < s9.length; i++) { s9[i]= 10; } for (int i = 0; i <
		 * s9.length; i++) { System.out.println(s9[i]); }
		 */
		
		
		/*
		 * int [] arr= new int[10]; boolean [] arr2 =new boolean[5]; for (int i = 0; i <
		 * arr.length; i++) { System.out.println(arr[i]); // �迭 �����ϰ� ������� int 0�̵��� }
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr2[i]);
		 * 
		 * } int [] score= {83,90,87};
		 */
	
	/*int [] arrint;
	arrint =new int[3];//�̰Ŵ� �ȴ�
	
	int [] arrint2 = {0,0};// �̰ǵȴ�.
	arrint2 = {0.0};//�̰� �ȵ�
	int [] arrint3 =new int[] {10,20};//�̰ǵȴ�.
	//����ε��� ������ ���� ���������.
}*/
		
		//�޼��带 ����� ���
		//public static ������ Ÿ�� �޼����̸�()
		//f(x)=3 ���Ǻκ�
	

	
	
