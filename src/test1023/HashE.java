package test1023;

import java.util.*;

public class HashE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("c���");
		set.add("�ڷᱸ��");
		set.add("�ڷᱸ��");
		
		int size =set.size();
		System.out.println(size);
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String element =iterator.next();
			System.out.println(element);
		}
		set.remove("�ڷᱸ��");
		set.remove("c���");
		System.out.println();
		System.out.println(set.size());
		
		iterator =set.iterator();
		for (String element :set) {
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������");
		}
	}

}
