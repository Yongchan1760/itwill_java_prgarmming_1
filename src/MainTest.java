import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0907_1
		/*
		 * for (int i = 0; i < args.length; i++) { System.out.println(args[i]); }
		 * System.out.println("메인종료");
		 */
		/*
		 * args 빈공간이 있나없나 확인 args :main 뒤에 오는 값들을 입력값들로 받아들이겠다.
		 * 
		 * 1) 패키지 없는 클래스명.자바로 저장한후 관리자 cmd창으로 모든파일 인코딩은 안시로 2) 클래스명.java가 저장된 저장소로 이동 d:
		 * 3) dir/w 폴더 목록 확인 4) javac 클래스명.java 컴파일 5) dir/w 폴더 목록 확인 6) 클래스명.class 생성
		 * 7) java 클래스명 8) 자바 파일 메소드 출력값 생성
		 * 
		 * ex) java 클래스명 넣고싶은값
		 */
		
		//0907_2
		/*
		 * if(args.length!=2) { System.out.println("원하는 값의 수가 아닙니다."); System.exit(0); }
		 * String strnum1=args[0]; String strnum2=args[1]; int
		 * num1=Integer.parseInt(strnum1); int num2=Integer.parseInt(strnum2); int
		 * result =num1+num2; System.out.println(num1+"+"+num2+"="+result);
		 * 
		 * int [] arr1=new int[3]; //1차원 배열 int [][] arr2=new int[3][2]; // 3행2열 2차원 배열
		 * int [][][] arr3=new int[3][3][3]; //3행 3열 3차원 배열
		 * 
		 * 
		 * System.out.println(arr2.length); System.out.println(arr2[0].length);
		 * System.out.println(arr2[1].length); System.out.println(arr2[2].length);
		 */
			
			//0907_3
			int [][]arr4=new int[3][3];
			for(int i=0;i<arr4.length;i++) {//행의 길이를 나타냄
				for(int j=0;j<arr4[i].length;j++) {//arr4[0] 0번째 열의 길이 
					System.out.println("arr["+i+"]["+j+"]의 값은 ="+arr4[i][j]);
				}
			}
			//int [][]arr5=new int[3][] {{10},{20}}; 잘못된 코드
			
			int [][]arr5= {{1,2,3},
						  {10,20,30},
						  {40,50,90}};
			
			for(int i=0;i<arr5.length;i++) {
				for(int j=0;j<arr5[i].length;j++) {
					System.out.println("arr["+i+"]["+j+"]의 값은 ="+arr5[i][j]);
				}
			}
			
			//연습문제 
			//배열 선언 방법1
			int[][]math =new int[2][3];
			for (int i = 0; i < math.length; i++) {//행의 길이
				for (int j = 0; j < math[i].length; j++) {
					System.out.println("math["+i+"]["+j+"]="+math[i][j]);
				}
			}
			System.out.println();
			
			//배열 선언 방법2
			int [][]eng=new int[2][];//행만 선언
			eng[0]=new int[2];// 0번째 행의 2열
			eng[1]=new int[3];//1번쨰 행의 3열 선언
			for (int i = 0; i < eng.length; i++) {//행의 길이
				for (int j = 0; j < eng[i].length; j++) {
					System.out.println("eng["+i+"]["+j+"]="+eng[i][j]);
				}
			}
			System.out.println();
			
			//배열 선언 방법3
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
			for(int d:date) {//향상된 포문
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
