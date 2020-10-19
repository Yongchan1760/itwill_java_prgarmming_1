package test1019;


import java.text.*;
import java.util.*;


public class DateE {

	public static void main(String[] args) throws ParseException {
		Date now =new Date();
		String strnow=now.toString();
		System.out.println(strnow);
		
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		
		String str2now =sdf.format(now);
		System.out.println(str2now);
		System.out.println("--------------");
		
		
		
		
		String source ="2020년 12월 25일";
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy년 mm월 dd일");
		Date date2=sdf2.parse(source);
		sdf2.applyPattern("yyy년 mm월 dd일(E)");
		System.out.println(sdf2.format(date2));
		
	}

}
