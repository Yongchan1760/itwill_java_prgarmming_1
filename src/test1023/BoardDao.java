package test1023;

import java.util.*;

public class BoardDao {
	
	public List<Board1> getBoardList(){
		
		List<Board1> list=new ArrayList<>();
		
		list.add(new Board1("게시판1","내용1" ));
		list.add(new Board1("게시판2","내용2" ));
		list.add(new Board1("게시판3","내용3" ));
		return list;
		
	}
}

