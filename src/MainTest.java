import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0907_1
		/*
		 * for (int i = 0; i < args.length; i++) { System.out.println(args[i]); }
		 * System.out.println("��������");
		 */
		/*
		 * args ������� �ֳ����� Ȯ�� args :main �ڿ� ���� ������ �Է°���� �޾Ƶ��̰ڴ�.
		 * 
		 * 1) ��Ű�� ���� Ŭ������.�ڹٷ� �������� ������ cmdâ���� ������� ���ڵ��� �Ƚ÷� 2) Ŭ������.java�� ����� ����ҷ� �̵� d:
		 * 3) dir/w ���� ��� Ȯ�� 4) javac Ŭ������.java ������ 5) dir/w ���� ��� Ȯ�� 6) Ŭ������.class ����
		 * 7) java Ŭ������ 8) �ڹ� ���� �޼ҵ� ��°� ����
		 * 
		 * ex) java Ŭ������ �ְ������
		 */
		
		//0907_2
		/*
		 * if(args.length!=2) { System.out.println("���ϴ� ���� ���� �ƴմϴ�."); System.exit(0); }
		 * String strnum1=args[0]; String strnum2=args[1]; int
		 * num1=Integer.parseInt(strnum1); int num2=Integer.parseInt(strnum2); int
		 * result =num1+num2; System.out.println(num1+"+"+num2+"="+result);
		 * 
		 * int [] arr1=new int[3]; //1���� �迭 int [][] arr2=new int[3][2]; // 3��2�� 2���� �迭
		 * int [][][] arr3=new int[3][3][3]; //3�� 3�� 3���� �迭
		 * 
		 * 
		 * System.out.println(arr2.length); System.out.println(arr2[0].length);
		 * System.out.println(arr2[1].length); System.out.println(arr2[2].length);
		 */
			
			//0907_3
			int [][]arr4=new int[3][3];
			for(int i=0;i<arr4.length;i++) {//���� ���̸� ��Ÿ��
				for(int j=0;j<arr4[i].length;j++) {//arr4[0] 0��° ���� ���� 
					System.out.println("arr["+i+"]["+j+"]�� ���� ="+arr4[i][j]);
				}
			}
			//int [][]arr5=new int[3][] {{10},{20}}; �߸��� �ڵ�
			
			int [][]arr5= {{1,2,3},
						  {10,20,30},
						  {40,50,90}};
			
			for(int i=0;i<arr5.length;i++) {
				for(int j=0;j<arr5[i].length;j++) {
					System.out.println("arr["+i+"]["+j+"]�� ���� ="+arr5[i][j]);
				}
			}
			
			//�������� 
			//�迭 ���� ���1
			int[][]math =new int[2][3];
			for (int i = 0; i < math.length; i++) {//���� ����
				for (int j = 0; j < math[i].length; j++) {
					System.out.println("math["+i+"]["+j+"]="+math[i][j]);
				}
			}
			System.out.println();
			
			//�迭 ���� ���2
			int [][]eng=new int[2][];//�ุ ����
			eng[0]=new int[2];// 0��° ���� 2��
			eng[1]=new int[3];//1���� ���� 3�� ����
			for (int i = 0; i < eng.length; i++) {//���� ����
				for (int j = 0; j < eng[i].length; j++) {
					System.out.println("eng["+i+"]["+j+"]="+eng[i][j]);
				}
			}
			System.out.println();
			
			//�迭 ���� ���3
			int[][]score= {{90,80,40},
							{99,77,65},
							{76,87,32}};
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					System.out.println("score["+i+"]["+j+"]="+score[i][j]);
				}
			}
			System.out.println();
			
			//0907_4
			String[] strarr=new String[3];
			strarr[0]="Java";
			strarr[1]="Java";
			strarr[2]=new String("Java");
			System.out.println(strarr);
			System.out.println(strarr[0]==strarr[1]);
			System.out.println(strarr[0]==strarr[2]);
			System.out.println(strarr[0].equals(strarr[2]));
			////////////////////////////////////////////
			System.out.println();
			System.out.println();
			//////////////////////////////
			String[] strarr2=new String[3];
			String[] strarr3=new String[3];
			String[] strarr4=new String[3];
			strarr2[0]="Java";
			strarr3[1]="Java";
			strarr4[2]=new String("Java");
			System.out.println(strarr2);
			System.out.println(strarr3);
			System.out.println(strarr4);
			System.out.println(strarr2==strarr3);
			System.out.println(strarr2[0]==strarr3[1]);
			System.out.println(strarr2[0]==strarr4[2]);
			System.out.println(strarr2[0].equals(strarr4[2]));
			/////////////////////////////////////////////
			
			
			int []date=new int[3];
			for (int i = 0; i < date.length; i++) {
				System.out.println(date[i]);
			}
			for(int d:date) {//���� ����
				System.out.println(d);
			}
			
			int[] sc1= {95,33,45,65,90};
			int sum=0;
			for (int sc:sc1) {
				sum+=sc;
				System.out.println(sum);
			}
			double av=(double)sum/sc1.length;
			System.out.println(av);
			
			
	}
}
