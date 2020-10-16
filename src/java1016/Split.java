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
		String str="¾È0³çÇÏ3¼¼z¿äAÀú´ÂDµù´óEµ¿dÀÔ´Ï´Ù.";
		String [] result=str.split("[0-9a-zA-Z]");//0~9±îÁö ³ª´²ÁØ´Ù.
		
		/*
		String str="¾È0³çÇÏ3¼¼2¿ä";
		String [] result=str.split("[0-9]");//0~9±îÁö ³ª´²ÁØ´Ù.
		String str="¾ÈA³çÇÏE¼¼C¿ä";
		String [] result=str.split("[A-Z]");//A~Z±îÁö ³ª´²ÁØ´Ù.
		
		 * String str="¾Èa³çÇÏb¼¼c¿ä"; String [] result=str.split("[a-z]");//a~z±îÁö ³ª´²ÁØ´Ù.
		 */
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		for(String a:result) {
			System.out.println("Çâ»óµÈ ===="+a);
		}
		
		String name="[a-zA-Z°¡-ÆR]{2,5}";
		System.out.println("hello java".matches(name));
		System.out.println("°í±¸¸¶best".matches(name));
		System.out.println("º­Go".matches(name));
		System.out.println("È«±æµ¿".matches(name));
		System.out.println("È«".matches(name));
		
		
		String rname="^(010|011)[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
		String[]number= {
				"010-000-1234",
				"01112345678",
				"010)1234 5678",
				"010 1234 567a"
		};
		String sum="{0}´Â ÀüÈ­¹øÈ£ Å¸ÀÔÀÎ°¡?{1}";
		for(String number1:number) {
			boolean result1=Pattern.matches(rname, number1);
			System.out.println(MessageFormat.format(sum, number1,result1));
		}
		
		System.out.println("ÀÔ·ÂÇÏ¼¼¿ä :");
		Scanner sc =new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String line;
		
		while (!(line=sc.nextLine()).equals("x")) {
			sb.append(line+" ");
		}
		System.out.println(sb.toString());
	
		
		
		
		
	}

}
