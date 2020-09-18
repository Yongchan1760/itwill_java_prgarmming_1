package java0919;

public class Membersevice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberservice a=new Memberservice();
		boolean result =a.login("hong","12345");
		if(result) {
			System.out.println("1.로그인 정상");
			a.logout("hong");
		}
		else {
			System.out.println("id 또는 pwd 일치하지 않음");
		}
	}

}
