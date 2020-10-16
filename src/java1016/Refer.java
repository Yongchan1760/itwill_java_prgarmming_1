package java1016;

public class Refer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn="010624-1230123";
		char a= ssn.charAt(7);
		System.out.println(a);
		switch (a) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		}
	}

}
