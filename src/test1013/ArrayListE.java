package test1013;
import java.util.*;

public class ArrayListE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>list=new ArrayList<>();
		
		list.add("java");
		list.add("jdbc");
		list.add("Servlet/jsp");
		list.add(2, "database");
		list.add("ibatis");
		
		int size =list.size();
		System.out.println("ÃÑ°´Ã¼¼ö: "+size);
		
		System.out.println();
		
		String skill =(list.get(2));
		System.out.println("2:"+skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
			
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("ibatis");
		
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
