package test1023;

import java.util.*;

public class BoardDao {
	
	public List<Board1> getBoardList(){
		
		List<Board1> list=new ArrayList<>();
		
		list.add(new Board1("�Խ���1","����1" ));
		list.add(new Board1("�Խ���2","����2" ));
		list.add(new Board1("�Խ���3","����3" ));
		return list;
		
	}
}

