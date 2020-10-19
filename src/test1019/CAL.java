package test1019;

import java.util.Calendar;

public class CAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now =Calendar.getInstance();
		int year =now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)+1;
		int day=now.get(Calendar.DAY_OF_MONTH);
		
		int week=now.get(Calendar.DAY_OF_WEEK);
		
		String strweek =null;
		switch (week) {
		case Calendar.MONDAY:
			strweek="월";
			break;
		case Calendar.TUESDAY:
			strweek="화";
			break;
		case Calendar.WEDNESDAY:
			strweek="수";
			break;
		case Calendar.THURSDAY:
			strweek="목";
			break;
		case Calendar.FRIDAY:
			strweek="금";
			break;
		case Calendar.SATURDAY:
			strweek="토";
			break;
		default:
			strweek="일";
		}
		int ampm=now.get(Calendar.AM_PM);
		String strampm=null;
		if(ampm==Calendar.AM) {
			strampm="오전";
		}else {
			strampm="오후";
		}
		int hour =now.get(Calendar.HOUR);
		int min =now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(strweek+"요일");
		System.out.println(strampm+" ");
		System.out.println(hour+"시");
		System.out.println(min+"분");
		System.out.println(second+"초");
	}

}
