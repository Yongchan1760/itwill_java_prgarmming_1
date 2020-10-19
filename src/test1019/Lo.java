package test1019;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Lo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������");
		Locale [] locales=Locale.getAvailableLocales();
		for(Locale l:locales) {
			System.out.println("1�� ����"+l.getLanguage()+" - "+l.getCountry());
		}
		
		System.out.println("-------------------");
		System.out.println("Ÿ����");
		String [] tzs=TimeZone.getAvailableIDs();
		int i=0;
		for(String tz:tzs) {
			System.out.println("Ÿ���� :"+tz);
			System.out.println(tzs[i]);
		}
		System.out.println();
		
		Calendar cal=Calendar.getInstance();
		TimeZone newYorkTZ= TimeZone.getTimeZone("America/New_York");
		Calendar nyCal= Calendar.getInstance(newYorkTZ);
		int gap=(cal.get(Calendar.HOUR_OF_DAY))-nyCal.get(Calendar.HOUR_OF_DAY);
		
		Calendar buddhistcal=Calendar.getInstance(new Locale("th","TH"));
		System.out.println(buddhistcal.getClass().getName());
		
		
	}

}
