package test1023;

import java.util.List;
import java.util.*;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime =System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("걸린시간"+(endTime-startTime));
		
		startTime =System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist 걸린시간"+(endTime-startTime));
	}

}
