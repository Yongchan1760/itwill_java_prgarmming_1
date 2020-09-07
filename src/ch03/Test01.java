package ch03;

public class Test01 {

	public static void main(String[] args) {
		//int a1=1;
		//double a2=1.0;
		//System.out.println(a1==a2);
		//double a3=0.1;
		//float a4=0.1f;
		//System.out.println(a3==a4);
		//System.out.println((float)a3==a4);
		
		/**
		 * String str1="abc"; String str2="abc"; String str3=new String("abc"); String
		 * str4=new String("abc"); System.out.println(str1==str2);
		 * System.out.println(str3==str4); //System.out.println(str1.equals(str2));
		 * System.out.println(str3.equals(str4)); //그번지가 가지고있는 실제값을 비교하기떄문에 true값이 나온다
		 * //참조형 데이터변수를 비교할때는 이퀄스를 사용한다.
		 */		 	
		  int a=10;
		  int b=20;
		  System.out.println((a+=10)>15|(b-=10)>15);
		  System.out.println("a="+a+", b="+b);
		  System.out.println();
		  // 앞에서 뒤까지 다 확인한후 결과값 도출
		  a=10;
		  b=20;
		  System.out.println((a+=10)>15||(b-=10)>15);
		  System.out.println("a="+a+", b="+b);
		  // 앞만 확인하고 참이면 뒤는 확인도 안하고 바로 결과값 도출'
		}
	}


