package test1030;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


import java.util.*;

public class ObjectStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		writeList();
		List<Board> list=readList();
		
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-mm-dd");
		for(Board board:list) {
			System.out.println(
			board.getBno() + board.getTitle()+
			board.getContent()+board.getWriter()+
			sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception{
		List<Board> list=new ArrayList<>();
		
		list.add(new test1030.Board(1, "제목", "내용1", "글쓴이", new Date()));
		list.add(new test1030.Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new test1030.Board(3, "제목3", "내용3", "글쓴이3", new Date()));
	
		FileOutputStream fos=new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception{
		FileInputStream fis=new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Board> list=(List<Board>)ois.readObject();
		return list;
	}
	

}
