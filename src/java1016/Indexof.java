package java1016;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="��� ������ �ۼ�";
		
		int location=a.indexOf("������");
		System.out.println(location);
		if(a.indexOf("����") !=-1) {
			System.out.println("���� ���þ���");
		}
		else {
			System.out.println("���� ��������");
		}
		
	}

}
