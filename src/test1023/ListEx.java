package test1023;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDao dao=new BoardDao();
		List<Board1> list=dao.getBoardList();
		for (Board1 board:list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}

}
