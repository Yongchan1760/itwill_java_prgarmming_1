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
			strweek="��";
			break;
		case Calendar.TUESDAY:
			strweek="ȭ";
			break;
		case Calendar.WEDNESDAY:
			strweek="��";
			break;
		case Calendar.THURSDAY:
			strweek="��";
			break;
		case Calendar.FRIDAY:
			strweek="��";
			break;
		case Calendar.SATURDAY:
			strweek="��";
			break;
		default:
			strweek="��";
		}
		int ampm=now.get(Calendar.AM_PM);
		String strampm=null;
		if(ampm==Calendar.AM) {
			strampm="����";
		}else {
			strampm="����";
		}
		int hour =now.get(Calendar.HOUR);
		int min =now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		System.out.println(year+"��");
		System.out.println(month+"��");
		System.out.println(day+"��");
		System.out.println(strweek+"����");
		System.out.println(strampm+" ");
		System.out.println(hour+"��");
		System.out.println(min+"��");
		System.out.println(second+"��");
	}

}
