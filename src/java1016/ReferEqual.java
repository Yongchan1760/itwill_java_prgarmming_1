package java1016;

public class ReferEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel1 =new String("   02");
		String tel2 =new String("123    ");
		String tel5= new String("		abc			");
		String tel3="		abc			";
		String tel4="		abc			";
		if(tel3==tel4) {
			System.out.println("��");
		}
		if(tel5==tel3) {
			System.out.println("�����ϴ� �ּҹ��� ����");
		}
		else {
			System.out.println("�����ϴ� �ּҹ��� �ٸ�");
		}
		if(tel3.equals(tel5)) {
			System.out.println("�������� ���ϴ� ��");
		}
		else {
			System.out.println("������");
		}
		
	}

}
