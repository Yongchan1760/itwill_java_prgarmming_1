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
		 * System.out.println(str3.equals(str4)); //�׹����� �������ִ� �������� ���ϱ⋚���� true���� ���´�
		 * //������ �����ͺ����� ���Ҷ��� �������� ����Ѵ�.
		 */		 	
		  int a=10;
		  int b=20;
		  System.out.println((a+=10)>15|(b-=10)>15);
		  System.out.println("a="+a+", b="+b);
		  System.out.println();
		  // �տ��� �ڱ��� �� Ȯ������ ����� ����
		  a=10;
		  b=20;
		  System.out.println((a+=10)>15||(b-=10)>15);
		  System.out.println("a="+a+", b="+b);
		  // �ո� Ȯ���ϰ� ���̸� �ڴ� Ȯ�ε� ���ϰ� �ٷ� ����� ����'
		}
	}


