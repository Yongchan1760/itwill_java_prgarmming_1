package test1013;

import java.util.HashMap;

public class KeyE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "ȫ�浿");
		
		String value =hashMap.get(1);
		System.out.println(value);
	}

}
