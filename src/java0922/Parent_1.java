package java0922;

public class Parent_1 extends Parent {
	private String name;
	
	public Parent_1() {
		this("ȫ�浿");
		System.out.println("Parent_1 ��");
	}
	
	public Parent_1(String name) {
		this.name=name;
		System.out.println("Parent_1 string name call");
	}
}
