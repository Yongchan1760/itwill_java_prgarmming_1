package test_Class;

class Book{
	String author="허균";
	String title="홍길동전";
	int price=10000;
	
	
	Book(){
		System.out.println("디폴트 생성자입니다.~");
	}//디폴트 생성자
	
}

public class Test_0911 {

	public static void main(String[] args) {
		System.out.println();
		Book p=new Book();//p객체 생성 선언과 동시에 주소를 받음
		System.out.println(p.author);
		System.out.println(p.price);
		System.out.println(p.title);
		System.out.println("p의 주소는 "+p);
		System.out.println();
		Book p2=new Book();
		System.out.println("p2의 주소는"+p2);
		Book p3;
		p3=p2;
		System.out.println(p3);
		// 대입이아니라 주소가없는 p3와 p2가 공유가 일어났다.
		System.out.println();
		Book book=new Book();
		System.out.println(book.author);
		System.out.println(book.price);
		System.out.println(book.title);
		
		
		
	}

}
