package java0919;

public class Membersevice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberservice a=new Memberservice();
		boolean result =a.login("hong","12345");
		if(result) {
			System.out.println("1.�α��� ����");
			a.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� pwd ��ġ���� ����");
		}
	}

}
