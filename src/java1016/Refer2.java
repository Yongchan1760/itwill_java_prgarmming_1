package java1016;

public class Refer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =new String("abc");
		String b="abc";
		
		if(a==b) {
			System.out.println("��"); //�ּҹ����� ��
		}
		else {
			System.out.println("����");
		}
		
		if(a.equals(b)) {
			System.out.println("��");
		}
		else {
			System.out.println();//���������� �� 
		}
	}

}
