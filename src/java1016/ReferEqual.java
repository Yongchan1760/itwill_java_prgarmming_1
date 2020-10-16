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
			System.out.println("참");
		}
		if(tel5==tel3) {
			System.out.println("참조하는 주소번지 같음");
		}
		else {
			System.out.println("참조하는 주소번지 다름");
		}
		if(tel3.equals(tel5)) {
			System.out.println("실제값을 비교하니 참");
		}
		else {
			System.out.println("거짓임");
		}
		
	}

}
