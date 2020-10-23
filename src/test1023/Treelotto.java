package test1023;

import java.util.*;


public class Treelotto {
	Integer bonus;
	Set<Integer> lotto=new TreeSet<>();
	
	public void setup() {
		Random random=new Random();
		while(bonus==null) {
			int num=random.nextInt(45)+1;
			if(lotto.size()<6) {
				lotto.add(num);
			}
			else {
				bonus=num;
			}
		}
	}
	@Override
	public String toString() {
		return "당첨번호:"+lotto+"보너스"+bonus;

	}
}
