package test_Class;

class Book{
	String author="���";
	String title="ȫ�浿��";
	int price=10000;
	
	
	Book(){
		System.out.println("����Ʈ �������Դϴ�.~");
	}//����Ʈ ������
	
}

public class Test_0911 {

	public static void main(String[] args) {
		System.out.println();
		Book p=new Book();//p��ü ���� ����� ���ÿ� �ּҸ� ����
		System.out.println(p.author);
		System.out.println(p.price);
		System.out.println(p.title);
		System.out.println("p�� �ּҴ� "+p);
		System.out.println();
		Book p2=new Book();
		System.out.println("p2�� �ּҴ�"+p2);
		Book p3;
		p3=p2;
		System.out.println(p3);
		// �����̾ƴ϶� �ּҰ����� p3�� p2�� ������ �Ͼ��.
		System.out.println();
		Book book=new Book();
		System.out.println(book.author);
		System.out.println(book.price);
		System.out.println(book.title);
		
		
		
	}

}
