package test1019;


import java.text.*;
import java.util.*;


public class DateE {

	public static void main(String[] args) throws ParseException {
		Date now =new Date();
		String strnow=now.toString();
		System.out.println(strnow);
		
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm�� ss��");
		
		String str2now =sdf.format(now);
		System.out.println(str2now);
		System.out.println("--------------");
		
		
		
		
		String source ="2020�� 12�� 25��";
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy�� mm�� dd��");
		Date date2=sdf2.parse(source);
		sdf2.applyPattern("yyy�� mm�� dd��(E)");
		System.out.println(sdf2.format(date2));
		
	}

}
