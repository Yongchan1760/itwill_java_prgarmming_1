package java1016;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

import test1013.SysytemTimeE;

public class Split {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String str="��0����3��z��A����D����E��d�Դϴ�.";
		String [] result=str.split("[0-9a-zA-Z]");//0~9���� �����ش�.
		
		/*
		String str="��0����3��2��";
		String [] result=str.split("[0-9]");//0~9���� �����ش�.
		String str="��A����E��C��";
		String [] result=str.split("[A-Z]");//A~Z���� �����ش�.
		
		 * String str="��a����b��c��"; String [] result=str.split("[a-z]");//a~z���� �����ش�.
		 */
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		for(String a:result) {
			System.out.println("���� ===="+a);
		}
		
		String name="[a-zA-Z��-�R]{2,5}";
		System.out.println("hello java".matches(name));
		System.out.println("����best".matches(name));
		System.out.println("��Go".matches(name));
		System.out.println("ȫ�浿".matches(name));
		System.out.println("ȫ".matches(name));
		
		
		String rname="^(010|011)[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
		String[]number= {
				"010-000-1234",
				"01112345678",
				"010)1234 5678",
				"010 1234 567a"
		};
		String sum="{0}�� ��ȭ��ȣ Ÿ���ΰ�?{1}";
		for(String number1:number) {
			boolean result1=Pattern.matches(rname, number1);
			System.out.println(MessageFormat.format(sum, number1,result1));
		}
		
		System.out.println("�Է��ϼ��� :");
		Scanner sc =new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String line;
		
		while (!(line=sc.nextLine()).equals("x")) {
			sb.append(line+" ");
		}
		System.out.println(sb.toString());
	
		
		
		
		
	}

}
