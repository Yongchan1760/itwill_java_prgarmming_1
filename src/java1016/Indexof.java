package java1016;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="디비 쿼리문 작성";
		
		int location=a.indexOf("쿼리문");
		System.out.println(location);
		if(a.indexOf("딩동") !=-1) {
			System.out.println("디비랑 관련없음");
		}
		else {
			System.out.println("디비랑 관련있음");
		}
		
	}

}
