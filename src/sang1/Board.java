package sang1;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this(title,content,"로그인한 회원아이디","현재 컴퓨터 날짜",0);
	}
	Board(String title, String content,String writer){
		this(title,content,writer,"현재 컴퓨터 날짜",0);
	}
	Board(String title, String content,String writer,String date){
		this(title,content,writer,date,0);
	}
	Board(String title, String content,String writer,String date,int hitcount){
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.date=date;
		this.hitcount=hitcount;
	}
	/*
	 * 예를 들어 20명의 학생이 있다 그런데 18명은 공통이고 2명이 가진 조건들이 다르다 그래서 생성자마다 18명의 공통된 정보는 항상
	 * 갱신하고 나머지 값들은 매개변수 각각의 매개변수 개수로 입력받아 변수를 초기화한다.
	 */
}
