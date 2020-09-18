package java0919;

public class Memberservice {
	
	String id="hong";
	String pwd="12345";
	 boolean login(String a,String b) {
		if(this.id==a && this.pwd==b) {
			return true;
			//System.out.println("회원정보 정상");
		}
		else {
			return false;
		}
	}
	void logout(String c) {
		if(this.id==c) {
			System.out.println("2.로그아웃");
		}	
	}

}
