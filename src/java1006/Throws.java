package java1006;

public class Throws {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}
	public static void findClass() throws ClassNotFoundException {
		Class c=Class.forName("java.lang.String2");
	}
}
