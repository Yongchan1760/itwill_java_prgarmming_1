package test1023;

import java.util.*;

public class Linkp {
		Integer bonus;
		List<Integer>lotto=new ArrayList<>();
		
		public void setup() {
			Random random =new Random();
			while(bonus==null) {
				int num=random.nextInt(45)+1;
					if(!lotto.contains(num)) {
						if(lotto.size()<6) {
							lotto.add(num);
						}
						else {
							bonus=num;
						}
					}
			}
			Collections.sort(lotto);
		}
		@Override
		public String toString() {
			return "당첨번호 :"+lotto+"보너스"+bonus;
		}
}

