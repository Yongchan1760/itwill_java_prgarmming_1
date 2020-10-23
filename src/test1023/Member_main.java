package test1023;

import java.util.*;


public class Member_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set =new HashSet<>();
		
		set.add(new Member("È«±æµ¿", 30));

		set.add(new Member("È«±æµ¿", 30));
		System.out.println("ÃÑ°´Ã¼¼ö"+set.size());
	}

}
